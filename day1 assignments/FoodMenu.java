import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double dosaPrice=100, teaPrice=10, samosaPrice=20, sandwitchPrice=50,cheeseSandwitchprice=60, Smoothyprice=50,pizzaprice=250, burgerprice=150,pohePrice=30;
		int dosaQty=0, teaQty=0, somosaQty=0, sandwitchQty=0, cheeseSandwitchQty=0, SmoothyQty=0,pizzaQty=0, burgerQty=0,poheQty=0 ;
		boolean shouldContinue = true;
		do {
			System.out.println("*** Welcome to Food Menu ***");
			System.out.println("1. Dosa (Rs. 100)");
			System.out.println("2. Tea (Rs. 10)");
			System.out.println("3. Samosa (Rs. 20)");
			System.out.println("4. Sandwitch (Rs. 50)");

			System.out.println("5. cheese Sandwitch (Rs. 60)");
			System.out.println("6. Smoothy (Rs. 50)");
			System.out.println("7. pizza (Rs. 250)");
			System.out.println("8. burger (Rs.150)");
			System.out.println("9. pohe (Rs.30)");

			System.out.println("10. Generate Bill");
			
			System.out.println("Enter your choice : ");
			int choice = scan.nextInt();
			System.out.println("Enter qty: ");
			
			switch (choice) {
			case 1:
				dosaQty = dosaQty + scan.nextInt();
				break;
			case 2:
				teaQty = teaQty+ scan.nextInt();
				break;
			case 3:
				somosaQty = somosaQty + scan.nextInt();
				break;
			case 4:
				sandwitchQty= sandwitchQty + scan.nextInt();
				break;
			
				case 5:
				cheeseSandwitchQty= cheeseSandwitchQty+ scan.nextInt();
				break;
			
				case 6:
				SmoothyQty= SmoothyQty + scan.nextInt();
				break;
				case 7:
				pizzaQty= pizzaQty + scan.nextInt();
				break;
				case 8:
				burgerQty= burgerQty + scan.nextInt();
				break;

				case 9:
				poheQty= poheQty + scan.nextInt();
				break;

			
				case 10:
				// generate bill
				double total = dosaQty * dosaPrice + teaQty* teaPrice + somosaQty*samosaPrice+ sandwitchQty *sandwitchPrice +    
				cheeseSandwitchQty*cheeseSandwitchprice + SmoothyQty*Smoothyprice+ pizzaQty*pizzaprice+ burgerQty*burgerprice +poheQty*pohePrice;
				
				System.out.println("**********BILL**********");
				
				System.out.println("ITEM      PRICE     QTY        SUM");
				System.out.println("-----------------------------------");
				if(dosaQty != 0) {
					System.out.println("Dosa   Rs." +dosaPrice+"  "+ dosaQty + "="+ dosaQty*dosaPrice);
				}
				if(teaQty != 0) {
					System.out.println("Tea    Rs." +teaPrice+"  "+ teaQty + "="+ teaQty*teaPrice);
				}
				
				if(somosaQty != 0) {
					System.out.println("Samosa  Rs." +samosaPrice+"  "+ somosaQty + "="+ somosaQty*samosaPrice);
				}
				
				if(sandwitchQty != 0) {
					System.out.println("Sandwitch  Rs." +sandwitchPrice+"  "+ sandwitchQty + "="+ sandwitchQty*sandwitchPrice);
				}
				
				if(cheeseSandwitchQty != 0) {
					System.out.println("Dosa    Rs." +cheeseSandwitchprice+"  "+cheeseSandwitchQty + "="+ cheeseSandwitchQty*cheeseSandwitchprice);
				}

				if(SmoothyQty != 0) {
					System.out.println("Dosa    Rs." +Smoothyprice+"  "+ SmoothyQty+ "="+ SmoothyQty*Smoothyprice);
				}

				if(pizzaQty != 0) {
					System.out.println("Dosa    Rs." +pizzaprice+"  "+ pizzaQty + "="+ pizzaQty*pizzaprice);
				}

				if(burgerQty != 0) {
					System.out.println("Dosa    Rs." +burgerprice+"  "+ burgerQty + "="+ burgerQty*burgerprice);
				}


				
				if(poheQty !=0) {
					System.out.println("Dosa    Rs." +pohePrice+"  "+ poheQty + "="+ pohePrice*poheQty);
				}




				System.out.println("Total Bill to pay = " + total);
				System.out.println("************************");
				//System.exit(0);
				shouldContinue = false;
				break;
			default:
				System.out.println("Invalid choice, try again.");
			}
			
		} while (shouldContinue);
		
		scan.close();

	}

}
