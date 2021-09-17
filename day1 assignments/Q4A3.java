import java.util.Scanner;
public class Q4A3 {
    public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Entre 2 numbers=");
int n1=sc.nextInt();
int n2=sc.nextInt();
boolean shouldContinue = true;
do{
System.out.println("1. Add");
System.out.println("2.Subtract");
System.out.println("3.multiplication");
System.out.println("4.Divide");
System.out.println("5.Exit");




System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
switch(choice)
{
case 1: System.out.println("Answer="+(n1+n2));
break;

case 2: System.out.println("Answer="+(n2-n1));
break;

case 3: System.out.println("Answer="+(n1*n2));
break;

case 4: System.out.println("Answer="+(n2/n1));
break;

case 5:shouldContinue=false;
break;

}

}
while (shouldContinue);
sc.close();


}
}
