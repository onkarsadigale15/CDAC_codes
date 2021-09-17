package utils;

import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;
import cust_exception.StudentHandlingException;
import com.app.core.*;
import static utils.ValidationUtils.*;
import static com.app.core.CourseType.*;


public class CollectionUtils {
	

	// add a static method to return hard coded sample data
	public static ArrayList<Student> populateSampleData() {
		ArrayList<Student> list = new ArrayList<>();
		try {

			list.add(new Student("11166", "lokesh", "lokij@gmail.com", "lokeshj", 9.45, convertDate("24-11-1996"),
					 convertType("REACT")));
			list.add(new Student("11146", "nayan", "nayad@gmail.com", "Naynd", 4.56, convertDate("23-12-1997"),
					 convertType("SPRING")));
			list.add(new Student("11187", "akshay", "aksha@gmail.com", "akshayk", 8.85, convertDate("04-05-1998"),
					 convertType("DBT")));
			list.add(new Student("11198", "omkar", "om@gmail.com", "omkark", 8.98, convertDate("23-12-1994"),
					convertType("ANGULAR")));
			list.add(new Student("11119", "bharti", "bhart@gmail.com", "bharti", 4.77, convertDate("03-07-1997"),
					convertType("REACT")));
			list.add(new Student("11110", "danny", "dann@gmail.com", "dansi", 8.90, convertDate("01-01-1999"),
					convertType("ANGULAR")));

		} catch (ParseException e) {
			System.out.println("Error in sample data " + e);
		}
		return list;
	}
	public static void showDetails(ArrayList<Student> studentList) {
		for(Student s : studentList)
			System.out.println(s);
	}

}
