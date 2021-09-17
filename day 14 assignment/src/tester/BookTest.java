package tester;

import static com.app.core.BookStore.sdf;
import static utils.BookCollections.populateMap;
import static utils.BookCollections.populateSampleData;
import static utils.Validations.convertType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;


import com.app.core.BookStore;
import com.app.core.BookType;

import custom_Exception.CustomBookException;

;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			// String title, BookType catagory, double price, Date pdate, String authorNmae,
			// int quantity
			HashMap<String, BookStore> books = populateMap(populateSampleData());
			boolean exit = false;
			while (!exit)
				try {
					/*
					 * 2.1 Add book. I/P Book details In case of a new book , store book details in
					 * the map. In case of duplicate title , just update the quantity
					 */
					System.out.println(
							"1.Add book 2.Display all Books 3.Issue out a book 4.Return a book 5.Remove a book 10.Exit ");

					switch (sc.nextInt()) {
					case 1:
						System.out.println(" title,  catagory,  price, Date ,  authorNmae,  quantity");
						String b1 = sc.next();
						if (books.containsKey(b1))
							throw new CustomBookException("Dup acct no!!!!!");
						System.out.println(books.put(b1, new BookStore(b1, convertType(sc.next()), sc.nextDouble(),
								sdf.parse(sc.next()), sc.next(), sc.nextInt())));

						break;
					case 2:// display all books details

						for (BookStore a : books.values())// Collection<BookStore>
							System.out.println(a);
						break;

					case 3:
						System.out.println("Enter book Title");
						BookStore src = books.get(sc.next());
						if (src == null) {
							System.out.println("Invalid book title....!!!!!");
						} else
							System.out.println(src);
						System.out.println("Remaining quantities are:" + src.getQuantity());
						break;
					case 4:// Return a book i/p book title
						System.out.println("Enter book Title which is to be return");
						BookStore s1 = books.get(sc.next());
						if (s1 == null) {
							throw new CustomBookException("Invalid book title....!!!!!");
						} else {
							s1.setQuantity(s1.getQuantity());
							System.out.println("Book added...!!!!");
							System.out.println("Updated books quantities are: " + (s1.getQuantity() + 1));
						}
						break;
					case 5: // Remove book
						System.out.println("Enter book title to rmove book");
						String title = sc.next();
						if (!books.containsKey(title))
							throw new CustomBookException(" book not found ....!!!!!");
						System.out.println(books.remove(title).getTitle() + "Is removed..!!");
//						if (s == null) {
//							System.out.println("Invalid book title....!!!!!");
//						} else {
//							books.remove(s.getTitle());
//							System.out.println("Book removed...!!!!");
//						}
						break;
					case 6: // Reduce quantity of all old books by 10 % I/P : Date
						System.out.println("Enter date(dd-MM-yyyy) to remove older books");
						Date d1 = sdf.parse(sc.next());

						Collection<BookStore> val = books.values();
						Iterator<BookStore> itr = val.iterator();
						while (itr.hasNext()) {
							BookStore n = itr.next();
							if (n.getPdate().before(d1)) {
								 n.setQuantity((int) (n.getQuantity() * 0.5));
							}
//							

						}
						break;
					case 7:// Accept a category from user & display all available books(quantity > 0) under
							// specified category

						System.out.println("Enter Catagory of book");
						BookType t = convertType(sc.next());
						Collection<BookStore> t1 = books.values();
						Iterator<BookStore> itr1 = t1.iterator();
						while (itr1.hasNext()) {
						BookStore has = itr1.next();
						if (has.getCatagory().equals(t))
							
								if (has.getQuantity() > 0)
									System.out.println("Available books are: "+has);
								else
									throw new CustomBookException("Invalid Catagory of book....!!!");

						}break;
					case 8:// Sort books as per the title , display the same.
						TreeMap<String, BookStore> treemap1=new TreeMap<>(books);
						System.out.println("Books are sorted as per title");
						for(BookStore d:treemap1.values())
							System.out.println(d);
						
						break;
					case 9: //  Sort the books as per author & price.\
						
						//HM ---> Collection (values)
						Collection<BookStore> acctCollection=books.values();
						//Copy coll of refs into ANY List : ctor
						ArrayList<BookStore> list=new ArrayList<>(acctCollection);
						//Collections.sort(List<T> list,Comparator<? super T> comp)
						Collections.sort(list,new Comparator<BookStore>() {

							@Override
							public int compare(BookStore o1, BookStore o2) {
								System.out.println("in comp : author based");
								int check=o1.getAuthorNmae().compareTo(o2.getAuthorNmae());
								if(check==0) {
									return ((Double)o1.getPrice()).compareTo(o2.getPrice());
									
								}
								return check;	
							}
							
						});
						System.out.println("Books Available as per Authors name: ");
						for(BookStore a : list)
							System.out.println(a);
						break;

					case 10:
						exit = true;
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			sc.nextLine();
		}

	}

}
