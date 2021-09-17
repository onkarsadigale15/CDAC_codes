package utils;

import static com.app.core.Category.*;
import static com.app.core.Book.*;
import java.text.ParseException;
import java.util.*;

import com.app.core.Book;

public class CollectionUtils {
	//to populate hard coded data:
	public static HashSet<Book> populateSampleData() {
		HashSet<Book> set = new HashSet<>();
		try {
			set.add(new Book("Dune",  FANTASY, 650.0, sdf.parse("2-3-2020"), "Frank Herbert", 2));
			set.add(new Book("The silent patient",  DETECTIVE, 2500.0, sdf.parse("6-12-2015"), "Alex", 1));
			set.add(new Book("Hamnet",  LITERARY_FICTION, 850.0, sdf.parse("2-3-2020"), "Frank Herbert", 2));
			set.add(new Book("Dune",  FANTASY, 960.0, sdf.parse("15-06-2001"), "Maggie", 4));
			set.add(new Book("Gone girl",  DETECTIVE, 1800.0, sdf.parse("01-08-2000"), "Gillian", 3));

		} catch (ParseException e) {
			System.out.println("err in sample data " + e);
		}
		return set;
	}
}
