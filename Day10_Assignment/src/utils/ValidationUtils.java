package utils;

import java.util.ArrayList;

import com.app.core.Student;
import com.app.core.StudentCource;

import custom_exception.StudentHandlingException;

public class ValidationUtils {

	public static StudentCource convertCource(String str) {
		return StudentCource.valueOf(str.toUpperCase());
	}
	
	public static String prnUnique(String prn, ArrayList<Student> stlist) throws StudentHandlingException{
		Student newstd = new Student(prn);
		for(Student st : stlist) {
			if(st!=null) {
				if(st.equals(newstd)) {
					throw new StudentHandlingException("PRN Already taken..");
					
				}
			}
		}
		return prn;
	}

}
