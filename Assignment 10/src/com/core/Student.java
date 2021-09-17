package com.core;
import java.text.SimpleDateFormat;
import java.util.Date;





public class Student {

private String prn;
private String name;
private String email; 
private String	password;
private Course type;
private double	GPA ;
private Date dob;
public static SimpleDateFormat sdf;

static {
	sdf=new SimpleDateFormat("dd-MM-yyyy");
}

/**
 * @param prn
 * @param name
 * @param email
 * @param password
 * @param gPA
 * @param dob
 */
public Student(String prn, String name, String email, String password,Course type,  double gPA, Date dob) {
	super();
	this.prn = prn;
	this.name = name;
	this.email = email;
	this.password = password;
	this.GPA = gPA;
	this.dob = dob;
	this.type=type;
}


//add overloaded constr wrapping PK
	public Student(String prn) {
		super();
		this.prn = prn;
	}


/*	public double getGPA() {
		return GPA;
	}
*/

	public void setGPA(double gPA) {
		GPA = gPA;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [prn=" +prn + ", name=" +name + ", email=" +email+ ", password="+password
				+",course type="+type+ ",gPA="+GPA+ ",dob="+dob+"]";
	}

	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
			System.out.println("in acct's equals");
			if(obj instanceof Student)
				return prn.equals(((Student)obj).prn);
			return false;
			
		
}








}
