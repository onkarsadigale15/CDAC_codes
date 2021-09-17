package utils;

import java.util.Arrays;
import com.app.core.*;
import custom_exception.CustomerHandlingException;


import static com.app.core.Customer.sdf;
import static com.app.core.Category.valueOf;
import java.text.ParseException;
import java.util.Date;

/* 2.3 Create in "utils" package : ValidationRules
Rules 
1)email must contain "@" & should be from ".com" domain
2)password must be min 4 max 10 chars long
3)reg amount should be multiples of 500
4)dob should be before 1st Jan 1995
5)duplicate customer details should not be stored.

Supply these validation rules using different static methods.
(Centralized exception handling is expected)   */
public class ValidationUtils {

	public static final int MAX_AGE;
	public static final int MIN_AGE;
	public static Date THRESHOLD_DATE;
	static {
		MIN_AGE = 4;
		MAX_AGE = 10;
		try {
			THRESHOLD_DATE = sdf.parse("01-01-1995");

		} catch (Exception e) {
			System.out.println("Error in static block");
		}
	}

//validate email
	public static String validateEmail(Customer[] customers, String email) throws CustomerHandlingException {
		for (Customer c : customers) {
			if (c != null) {
				if (c.getEmail().equals(email))
					throw new CustomerHandlingException("This email is already registered!");
			}
		}
		if (email.contains("@") && email.endsWith(".com"))
			return email;
		throw new CustomerHandlingException("Invalid Email!!");

	}

//............................................
// Validate Password
	public static String validatePassword(String password) throws CustomerHandlingException {
		if (password.length() >= MIN_AGE && password.length() <= MAX_AGE) 
			return password;
		throw new CustomerHandlingException(
					"Invalid password! password should contains at least 4 character and at most 10 character");
		
		}
//convert date
		public static Date convertValidateDate(String strDate) throws ParseException {
			return sdf.parse(strDate);
		}
		// Validate  Category
		public static Category convertCategory(String category) {
			return Category.valueOf(category.toUpperCase());
		}

		// Validate RegAmt
		public static double validateRegAmt(double regAmt) throws CustomerHandlingException 
		{
			if ((regAmt % 500 != 0 && regAmt > 0))
				
					throw new CustomerHandlingException("Invalid registration amount !! entrer registration amount in multiples of 500");
				
			return regAmt;
		}

		// Validate DOB
		public static Date validateDOB(Date date) throws CustomerHandlingException, ParseException
		{
			if(date.after(THRESHOLD_DATE))
				throw new CustomerHandlingException("Invalid DOB ! Your age must be 25 or above");
			return date;
		}
		
		public static String checkForDuplication(String inputEmail,Customer[] customers) throws CustomerHandlingException
		{
			//create a customer wrapping email (Primary Key : email)
			Customer testCustomer=new Customer(inputEmail); //abc-1234
			for(Customer v : customers) //v=vehicles[0]
				if(v != null)
					if (v.equals(testCustomer))
						throw new CustomerHandlingException("Dup cutomer details detected!!!!!!");
			return inputEmail;
		}
		
		
	
	
}//lokesh lokesh@gmail.com lokesh 500 23-11-1996 silver
//ajay ajay@gmail.com ajay 1000 23-11-1997 silver