package com.core;

//package utils;

import java.util.ArrayList;

//import com.core.CustomerException;

public class Validation {

	public static Course convertCourse(String str) {
		return Course.valueOf(str.toUpperCase());
	}
	
	public static String prnUnique(String prn, ArrayList<Student> stlist) throws CustomerException{
		Student newstd = new Student(prn);
		for(Student st : stlist) {
			if(st!=null) {
				if(st.equals(newstd)) {
					throw new CustomerException("PRN Already taken..");
					
				}
			}
		}
		return prn;
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

