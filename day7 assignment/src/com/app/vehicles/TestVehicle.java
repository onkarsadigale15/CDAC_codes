package com.app.vehicles;

import java.util.Scanner;
import com.app.vehicles.*;
public class TestVehicle{

	public static void main(String args[]) {
	try(Scanner sc=new Scanner(System.in))
	{
		
		System.out.println("Enter the 1st vehicles details regno, clr price");
		Vehicles v1=new Vehicles(sc.next(),sc.next(),sc.nextDouble());
		System.out.println("Enter the 1st vehicles details regno, clr price");
		Vehicles v2=new Vehicles(sc.next(),sc.next(),sc.nextDouble());
		System.out.println(v1.equals(v2)?"SAME":"DIFFERENT");
	
		System.out.print(v1.hashCode()+""+v2.hashCode());
		
		
		//override equals method
		//over rude equals methid :in vehiles call, inherited from the objects class, to replace ref
		//ref equality by content equality(unique id:)
		
	}



}
}