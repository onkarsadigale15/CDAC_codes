package com.app.org;

import com.app.org.Emp;
import com.app.org.Mgr;
import com.app.org.Worker;
import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner sc=new Scanner(System.in);		
		System.out.print("Enter the capacity");

Emp[] team=new Emp[sc.nextInt()];
boolean exit=false;
 int counter=0;
	while(!exit)
	{
	System.out.print("Enter your choices");
    System.out.println("1.hire manager 2.hire worker 3. display 4.update the info 5.exit");
	System.out.println("choice");
	switch(sc.nextInt())
	{  
	case 1:
	if(counter<team.length)
	{
	 System.out.print("Enter the manager details=id: name: basic: perfBonous");
	team[counter++]=new Mgr(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextDouble());
	
}
	else
	{
		System.out.print("team full");
	}
	break;
	case 2: // hire manager
		
	if(counter<team.length)
	{
		System.out.println("enter the worker details=id: name: basic: perfbonous:deptid:hoursWorked:hourlyRate");
	team[counter++]=new Worker(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextInt(),sc.nextInt(),sc.nextDouble());
	
	
	}
	
	else
	{
	System.out.println("Team full");	
	}
	break;
	
	case 3: //display
		System.out.println("Display details");
		for(Emp i:team)
		{
			System.out.println(i);
		System.out.print(i.computeNetSalary());
		}
	break;
	
	case 4:// update
	System.out.print("Enter the id=");
	for(Emp i:team)
	{
		if(i.getId()==sc.nextInt())
		{
			if(i instanceof Mgr)	
			{
			System.out.print("Enter new performance bonous=");
			((Mgr)i).setPerfbonous(sc.nextInt());
			System.out.println("Updated!!!");
		}
		else 
		{
			System.out.println("Enter the new bonus or hourly rate increment");
			((Worker)i).setHourlyRate(sc.nextInt());
			System.out.println("Updated!!!");
		}}
	
	else 
		{
			
			System.out.println("Invalid details");
		}
		
		
	
	}
		break;

	case 5:exit=true;
	break;

	
	
	}}
		
	sc.close();
	}

}
