package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;


/*2.1 Student : prn (string : unique id) , 
 * name , email , password, 
 * course (enum) ,GPA(double) , 
 * dob(Date)
Add suitable constructor/s , toString , 
equals (as per the requirement)*/
public class Student  implements Comparable<Student> {
	public String prn;
	private String name;
	private String email;
	private String password;
	private double gpa;
	private Date dob;
	private CourseType type;

	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");

	}

	public Student(String prn, String name, String email, String password, double gpa, Date dob, CourseType type) {
		super();
		this.prn=prn;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gpa = gpa;
		this.dob = dob;
		this.type = type;
	}
	//add overloaded constr wrapping PK
	public Student(String prn) {
		super();
      this.prn=prn;
	}
	
	public void setGPA(double gpa) {
		this.gpa=gpa;
	}
	

	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", email=" + email + ", password=" + password + ", GPA=" +gpa
				+ ", dob=" + sdf.format(dob) + ", Course-Type=" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
       // System.out.println("In student Equals");
	    if (obj instanceof Student)
			return this.prn.equals(((Student) obj).prn);
		return false;

	}


	public int compareTo(Student anotherStudent) {
		
		 return this.prn.compareTo(anotherStudent.prn);
	}
	public String getPrn() {
		return prn;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public double getGpa() {
		return gpa;
	}
	public Date getDob() {
		return dob;
	}
	public CourseType getType() {
		return type;
	}
	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	

}
