package tester;

import java.util.*;
import static utils.CollectionUtils.*;
import com.app.core.*;

import custom_exception.BookHandlingException;

import static com.app.core.Book.*;
class TestHashSetBook {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			HashSet<Book> bookSet = populateSampleData();
			boolean exit = false;
			while(!exit) {
				System.out.print("\n1.Add book\n2.Show all books\n100.Exit\nChoice : ");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter book details :\n[title, category, price, publishDate, authorName, quantity] : ");
						boolean press = bookSet.add(new Book(sc.next(), Category.valueOf(sc.next().toUpperCase()), sc.nextDouble(), sdf.parse(sc.next()),sc.next(), sc.nextInt()));
						if(press == false)
							throw new BookHandlingException("Book already present in set...");
						System.out.println("Book added successfully");
						break;
					case 2:
						for(Book b : bookSet)
							System.out.println("Book : "+b);
						break;
					case 3:
						
					case 100:
						exit = true;
						break;
					default:
						System.out.println("Enter correct option!!!");
						break;
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}
		}

	}

}
