package tester;

import java.util.*;
import static utils.CollectionUtils.*;
import com.app.core.*;

import com.app.core.Category;

import custom_exception.BookCustomeHandlingException;

import static com.app.core.Book.*;

class TestHashMapBook {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Book> bookMap = populateMap(populateSampleData());
			boolean exit = false;
			while (!exit) {
				System.out.print("\n1.Add book\n2.Show all books\n" + "3.Issue out a book\n4.Return a book\n"
						+ "5.Remove\n100.Exit\nChoice : ");
				try {
					switch (sc.nextInt()) {
					case 1:
						/*
						 * Add book. I/P Book details In case of a new book ,
						 * store book details in the map
						 * In case of duplicate title , 
						 * just update the quantity
						 */

						// Input Book Details : Title
						System.out.print("Enter book details :\nTitle : ");
						String title = sc.next();
						if (bookMap.containsKey(title)) { // containsKey() method boolean type returns true if map
							                              // contain mapping for a specific key
							System.out.println(title + "  Book Is Already Available In Our Book Set...");
							System.out.println("Enter the Quantity :");
							bookMap.get(title).setQuantity(bookMap.get(title).getQuantity()+sc.nextInt());//in case of duplicate title only update the quantity 
                         }
                        else { //In case of new book title Store that whole book details in map
							System.out.println("Other book details :\n[category, price, publishDate, authorName, quantity] : ");
							bookMap.put(title, new Book(title, Category.valueOf(sc.next().toUpperCase()),
									sc.nextDouble(), sdf.parse(sc.next()), sc.next(), sc.nextInt()));
						}
						System.out.println("New book added...");
						System.out.println("Quantiy of " + title + " book : " + bookMap.get(title).getQuantity());
						break;
					case 2://Display All books in a library

						for (Book b : bookMap.values())
							System.out.println("Book : " + b);
						break;
					case 3:
//						System.out.print("Enter title of book : ");
//						String title1 = sc.next();
//
//						if (bookMap.containsKey(title1)) {
//							System.out.print("Enter quantity : ");
//							int qty = sc.nextInt();
//							Book book = bookMap.get(title1);
//							if (book.getQuantity() == 0)
//								throw new BookCustomeHandlingException("Book is not availble for now...");
//							if (qty > book.getQuantity()) {
//								throw new BookCustomeHandlingException(
//										"Book quantity is larger than available books...");
//							}
//							System.out.println(title1 + " book quantity : " + (book.getQuantity() - qty));
//							book.setQuantity(book.getQuantity() - qty);
//						} else {
//							throw new BookCustomeHandlingException("Book not available in library");
//						}
//						break;
						System.out.println("Enter the title of the book to be issued");
						Book bookToBeIssued=bookMap.get(sc.next());
						if(bookToBeIssued != null ) {
							bookToBeIssued.setQuantity(bookToBeIssued.getQuantity()-1);
							System.out.println(bookToBeIssued+" issued successfully!!");
						}else
							throw new BookCustomeHandlingException("No such Book present in the library!!!!");
							
						break;
					case 4:
						System.out.print("Enter title of book : ");
						String name2 = sc.next();
						System.out.print("Enter quantity : ");
						int qnt1 = sc.nextInt();
						if (bookMap.containsKey(name2)) {
							Book book = bookMap.get(name2);
							System.out.println(name2 + " book quantity : " + (book.getQuantity() + qnt1));
							book.setQuantity(book.getQuantity() + qnt1);
						} else {
							throw new BookCustomeHandlingException("Book not available in library");
						}
						break;
					case 5 :// Remove book
					     //i/p book title
                        System.out.print("Enter title of book : ");
						String title3 = sc.next();
						System.out.println("Book removed : " + bookMap.remove(title3));
						break;
					case 100:
						exit = true;
						break;
					default:
						System.out.println("Enter correct option!!!");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}
		}
	}
}
