import java.util.Scanner;

public class Point {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter point 1 Coordinate..x y");
        Point2D p1=new Point2D(sc.nextInt(), sc.nextInt());

        System.out.println("Enter point 2 Coordinate..x y");
        Point2D p2=new Point2D(sc.nextInt(),sc.nextInt());
        System.out.println("The Point p1 Coordinates are :");
       System.out.println("point 1 : "+p1.getDetails());

       System.out.println("The Point p2 Coordinates are :");
       System.out.println("point 2 : "+p2.getDetails());
       System.out.println("Checking points p1 and pe Equality");
        System.out.println("coordinates of p1 and p2 are : "+(p1.isEqual(p2)? "SAME" : "DIFFERENT"));

        Point2D p3= p1.addOffset(10,20);
        System.out.println("The points of p1 with offset are.."+p3.getDetails());

        System.out.println();
        System.out.println("The Distance is: "+p1.calculateDistance(p2));
        System.out.println("The Point p1 Coordinates are :");
        System.out.println("point 1 : "+p1.getDetails());

       }
}
