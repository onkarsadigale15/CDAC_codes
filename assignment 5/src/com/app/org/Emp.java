package com.app.org;

public abstract class Emp {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
private int id;
private String name;
private double basic;

//constructor
public Emp(int id,String name,double basic)
{
	
	this.id=id;
	this.name=name;
	this.basic=basic;
	//System.out.print("emp class");
	}

		
		/*Emp state--- id(int),
		name, deptId(string) , basic(double)
		*/
public abstract double computeNetSalary();
@Override
public String toString() 
{
	return "Emp[id=" +id + ", name=" +name+ ",basic=" +basic+"]";
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getBasic() {
	return basic;
}


public void setBasic(double basic) {
	this.basic = basic;
}


//	return basic;}
//only method declaration
//{
//	return -1;
//}

		
		
	
		
		
		
		
	}

