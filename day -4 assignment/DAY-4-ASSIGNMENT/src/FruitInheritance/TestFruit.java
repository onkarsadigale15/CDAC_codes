package FruitInheritance;

import java.util.Scanner;

public class TestFruit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO FRUIT BASKET");
		System.out.println("Enter the number of Fruits");
		Fruit[] quantity = new Fruit[sc.nextInt()];
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println("1 for apple");
			System.out.println("2 for mango");
			System.out.println("3 for orange");
			System.out.println("4 for display all the fruits from basket");
			System.out.println("10 for exit");
			System.out.println("Enter your choice");
			switch (sc.nextInt()) {
			case 1:
				if (counter < quantity.length) {
					System.out.println("enter type of Apple");
					quantity[counter++] = new Apple(sc.next());//up casting
				} else {
					System.out.println("basket is full!");
				}
				break;
			case 2:
				if (counter < quantity.length) {
					System.out.println("enter type of Mango ");
					quantity[counter++] = new Mango(sc.next());//up casting 
				} else {
					System.out.println("basket is full!");
				}
				break;
			case 3:
				if (counter < quantity.length) {
					System.out.println("enter type of Orange");
					quantity[counter++] = new Orange(sc.next());//up casting
				} else {
					System.out.println("basket is full");
				}
				break;
			case 4:
				System.out.println("BASKET DETAILS:");
				System.out.println("YOU ADDED BELOW FRUITS IN TYOUR BASKET:");
				System.out.println();
				for (Fruit f : quantity) {
					if (f != null) {

						System.out.println(f.taste());
					}
				}
				break;
			case 10:
				exit = true;
				System.out.println("Thank You !");
				break;
			default:
				System.out.println("You have entered wrong choice");
				break;
			}
		}
		sc.close();
	}
}
