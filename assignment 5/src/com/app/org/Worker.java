package com.app.org;

public class Worker extends Emp {

	private int deptid;
	private int hoursWorked;
   double hourlyRate;
	
	public Worker(int id,String name,double basic,double perfbonous,int deptid,int hoursWorked,double hourlyRate)
	{
		super(id,name,basic);
		this.deptid=deptid;
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
		
	}	
	
	public int getDeptid() {
		return deptid;
	}
	
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}


	public int getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public double getHourlyRate() {
		return hourlyRate;
	}


	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


		//override toString , inherited from Person , to ret COMPLETE details of the faculty
		@Override
		public String toString()
		{
			return "Worker[hourlyWorked="+super.toString()+" yrsOfExperience "+deptid+" no.of hours worked" +hoursWorked+ "hourly rate="+hourlyRate+"]";
		}
			
	
@Override
public double computeNetSalary()
{
	return (super.getBasic()+(hoursWorked*hourlyRate));// --override computeNetSalary);
}



/*public double gethourlyRate() {
	return hourlyRate;
}
*/

	
	
	 //compute net salary 
	 //(formula:  = basic+(hoursWorked*hourlyRate)


}
