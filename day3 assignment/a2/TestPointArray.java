package geometry;
//import java.awt.geom.Point2D;
import geometry.Point2D;

import java.util.*; 
public class TestPointArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("how many points"); //take input
		
		int size=sc.nextInt();
		int index=0;
		Point2D[] point=new Point2D[size];
		int ch=0;
		do {
			
			System.out.println("*****Menue*****");
			System.out.println("1.Plot a new point");
			System.out.println("2.Display all plotted points=");
			System.out.println("3.Test equality of 2 points");
			System.out.println("4.calculate the distance");
			
			
			ch=sc.nextInt();
			
			switch (ch) {
			case 1:System.out.println("Enter the index and new point ");
			        index=sc.nextInt();
				if(index<=size-1)
				{
					point[index]=new Point2D(sc.nextInt(),sc.nextInt());
					System.out.println("point added");
					break;
				}
				else
				{
					System.out.println("invalid address ");
				}     
				break;

			case 2:for(Point2D i:point)
			{
			System.out.println(i.getDetails());	
			}
			break;
			
			case 3:System.out.println("Enter the two index to check equality");
			if(point[sc.nextInt()].isEqual(point[sc.nextInt()]))
			 {
				 
			 System.out.println("Equal");
				
			 }
			 
			 else 
			 {
				 System.out.println("not Equal");
					
			 }
			 break;
				

			case 4:System.out.println("Enter the  two index to check Distance");
					System.out.println(point[sc.nextInt()].calculateDistance(point[sc.nextInt()]));			
					break;
					
					
			}
			}while(ch!=10);
			
		
	sc.close();
	}
	}