package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;
//Create Java application for customer management system.
//states
//Customer : name(string),email(string),password(string),registrationAmount(double),dob(Date),type (CustomerType : enum)
public class Customer {
	private String name;
	private String email;
	private String password;
	private double regAmount;
	private Date dob;
    private Category CustomerType;
	
	//SDF : 1 copy 
	public static SimpleDateFormat sdf;
	
	static  {
		 sdf=new SimpleDateFormat("dd-MM-yyyy");
	}

	public Customer(String name, String email, String password, double regAmount, Date dob, Category customerType) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.CustomerType = customerType;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", regAmount=" + regAmount
				+ ", dob=" + sdf.format(dob) + ", CustomerType=" + CustomerType + "]";
	}
	
	
	public Customer(String email) {
		super();
		this.email = email;
	}
	@Override
	public boolean equals(Object c) {
		System.out.println("in vehicle's eq");
		if (c instanceof Customer)
			return email.equals(((Customer) c).email);
		return false;
	}

	public String getEmail() {
		return email;
	}

	

}
