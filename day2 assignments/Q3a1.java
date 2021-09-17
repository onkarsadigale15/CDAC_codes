//import java.util.Scanner;
import java.lang.Math;

class point2D{

int x;
int y;
    point2D(int x,int y)
{
this.x=x;
this.y=y;
}


String getDetails()
{
return "x coordinate="+x+" "+ "y coordinates="+y;
}

boolean isEqual(point2D point2)
{
    return this.x==point2.x && this.y==point2.y ? true:false;  
}

point2D createpoint(int cord1,int cord2)
{
x=this.x+cord1;
y=this.y+cord2;
return new point2D(x, y);
}

double calculatedistance(point2D p2)
{

  double distance= Math.sqrt(Math.pow((p2.x-this.x),2) + Math.pow((p2.y-this.y),2));
return distance;
}
}

public class Q3a1{
    public static void main(String[] args)
    {

point2D p1=new point2D(10,20);
point2D p2=new point2D(20,30);
point2D p3=p1.createpoint(5,-2);
//point2D p4=p2.calculatedistance();
//point2D p4=p2.calculatedistance(5,10);

System.out.println(p1.getDetails());
System.out.println("is point a equal to point b"+p1.isEqual(p2));

System.out.println(p3.getDetails());

System.out.println(p2.getDetails());


}
}

