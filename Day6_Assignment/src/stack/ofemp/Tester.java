
package stack.ofemp;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = null;//set interface Stack referance is null 
		int ch=5;
		do {
			System.out.println("1. Fixed stack");
			System.out.println("2. Growable stack");
			System.out.println("3. Push data");
			System.out.println("4. Pop data and display");
			System.out.println("5. Exit");
			System.out.println("Enter choice:");
			ch = sc.nextInt(); sc.nextLine();
			switch(ch) {
			case 1: if (stack==null)//at start if stack is null 
				        stack = new FixedStack();//create new FixedStack obj
					else System.out.println("Stack is already chosen!");
					break;
			case 2: if (stack==null) 
						stack = new GrowableStack();
					else System.out.println("Stack is already chosen!");
					break;
			case 3: System.out.println("Enter employee details (int id, String name, double salary)");
					Employee e = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
					stack.push(e);
					break;		
			case 4: Employee emp = stack.pop();
					System.out.println("The poppes Data is :");
					if (emp!=null) 
						System.out.println(emp.toString());
					else System.out.println("Stack is empty!");
					break;
			case 5: System.out.println("Exited"); sc.close();
					return;
			default: System.out.println("Wrong choice! Exited"); sc.close();
					return;
			}
		}while(ch!=5);
		sc.close();
	}
}
