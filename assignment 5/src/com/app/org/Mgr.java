package com.app.org;

//import com.app.org.*;

public class Mgr extends Emp {

	
private double perfbonous;
private double salary;


public Mgr(int id,String name,double basic,double perfbonous)
{
super(id,name, basic);
this.perfbonous=perfbonous;
this.salary=salary;

}



public double getPerfbonous() {
	return perfbonous;
}



public void setPerfbonous(double perfbonous) {
	this.perfbonous = perfbonous;
}



public double getSalary() {
	return salary;
}



public void setSalary(double salary) {
	this.salary = salary;
}



public double getperfbonous() {
	return perfbonous;
}






@Override
public String toString()
{
	return "Mgr[performance bonous ="+perfbonous+"]";
}

@Override
public double computeNetSalary()
{
	return super.getBasic()+perfbonous;
}







}


