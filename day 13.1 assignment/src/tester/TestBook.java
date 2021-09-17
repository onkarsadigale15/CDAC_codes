package tester;

import java.util.Scanner;
import com.app.core.*;
import static utils.CollectionUtils.*;
import custom_exception.*;
import java.util.HashSet;
import static com.app.core.Book.*;

public class TestBook {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashSet<Book> set = populateSampleData();
			boolean exit = false;
			while (!exit) {
				System.out.println("\n1.Add Book \n2.Display Book Details \n100.Exit  \nChoice");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter book details :\\n[title, category, price, publishDate, authorName, quantity] : \n");
						boolean press = set.add(new Book(sc.next(), Category.valueOf(sc.next().toUpperCase()),
								sc.nextDouble(), sdf.parse(sc.next()), sc.next(), sc.nextInt()));
						if (press == false)
							throw new BookHandlingException("Book is already Present in the set!!");
						System.out.println("Book Is Added Successfully!!!");
						break;
					case 2:
						for (Book b : set) {
							System.out.println("BOOK :" + b);
						}
						break;
					case 100:
						exit = true;
						break;

					default:
						System.out.println("Invalid choice Entered!!!");
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
