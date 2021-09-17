import java.util.Scanner;
public class Testpoint {
    

public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
System.out.println("enter the 2 numbers=");
int a=sc.nextInt();
int b=sc.nextInt();
test obj=new test(a,b);

//int p3=obj.dim(int a,int b);


System.out.println("2 pointers are="+" "+a+" "+b);

System.out.println("Checking points a and b are Equality");
        System.out.println("coordinates of a and b are : "+(a.isEqual(b)? "SAME" : "DIFFERENT"));

}


}



class test{
int a1;
int b2;
test(int x,int y)
{
a1=x;
b2=y;
System.out.println("New value of a="+a1);
System.out.println("New value of b="+b2);

}


}
