package utils;

import static com.app.core.Student.sdf;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.CourseType;
import com.app.core.Student;
import cust_exception.*;

public class ValidationUtils {

	public static CourseType convertType(String type) {
	return CourseType.valueOf(type.toUpperCase());
	}

	public static Date convertDate(String date) throws ParseException {
		return sdf.parse(date);
	}

	public static int validatePrn(String prn, ArrayList<Student> students) throws StudentHandlingException {
		Student std = new Student(prn);
		int index = students.indexOf(std);
		if (index == -1)
			throw new StudentHandlingException("Student prn " + prn + " is not registerd...");
		return index;
	}

	public static String checkDuplicatePrn(String prn, ArrayList<Student> students) throws StudentHandlingException {
		Student stud = new Student(prn);
		if (students.contains(stud)) {
			throw new StudentHandlingException("Student already present!!!");
		}
		return prn;
	}
}
