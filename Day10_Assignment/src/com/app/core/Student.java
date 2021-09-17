package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private String prn;
	private String name;
	private String email;
	private String password;
	private StudentCource cource;
	private double gpa;
	private Date dob;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yy");
	}
	public Student(String prn, String name, String email, String password, StudentCource cource, double gpa, Date dob) {
		super();
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.password = password;
		this.cource = cource;
		this.gpa = gpa;
		this.dob = dob;
	}
	
	
	public Student(String prn) {
		super();
		this.prn = prn;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", email=" + email + ", password=" + password + ", cource="
				+ cource + ", gpa=" + gpa + ", dob=" + sdf.format(dob)+ "]";
	}
	
	
	
	public boolean equals (Object obj) {
		System.out.println("in equals..");
		if(obj instanceof Student) {
			return prn.equals(((Student)obj).prn);
		}
		return false;
	}
	
	
}
