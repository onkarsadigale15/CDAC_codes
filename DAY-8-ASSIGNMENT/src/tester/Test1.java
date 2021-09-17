package tester;

import static java.util.Date.*;
import java.util.Scanner;
import com.app.core.*;
import custom_exception.CustomerHandlingException;
import utils.ValidationUtils;
import static utils.ValidationUtils.*;
import static com.app.core.Customer.sdf;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			int counter=0;
			Customer[] customers = new Customer[10];
			System.out.println("1. Register Customer Details");
			System.out.println("2. Display Customers ");
			System.out.println("3. Exit ");

			while (!exit) {
				try {
				System.out.println("Enter the Choice : ");
				switch (sc.nextInt()) {
				case 1:
					/*1. Prompt for customer details
                     Validate customer details (using validation rules)
                     You should not  accept duplicate customer details
                     Iff it's valid , create customer instance , o.w display error message via catch clause.*/
					
					System.out.println("Enter the Customer Details : ");
					System.out.println("Enter the name, Email, Password, Registration amount, DOB and Plan : ");
						Customer cust= new Customer(sc.next(), validateEmail(customers ,sc.next()), validatePassword(sc.next()),
							validateRegAmt(sc.nextDouble()), convertValidateDate(sc.next()), convertCategory(sc.next()));
						customers[counter++]=cust;
						System.out.println("Customers details added....");
						
					break;
				case 2:
					System.out.println("Display Customer Details : ");
					for (Customer c : customers)
						if(c != null)
							System.out.println(c);
						else
							
							break;
				case 3:
					exit=true;
					break;
				}
				
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				//read off
				sc.nextLine();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
