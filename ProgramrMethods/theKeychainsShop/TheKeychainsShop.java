package theKeychainsShop;

import java.util.Scanner;

/**
 * You have to create a menu driven program with the following menu:-
 * 
 * 1. Add Keychains to Order.
 * 2. Remove Keychains from Order.
 * 3. View Current Order.
 * 4. Checkout.
 * Please Enter Your Choice:
 * 
 * You have to make four different functions, one each to 
 * addKeychains(),removeKeychains(), viewOrder() and checkout().
 * The four functions respond to the user's entered choice 1,2,3,4 
 * respectively and display a message indicating that they have been called.
 * The program should exit when checkout is called.
 * 
 *  
 *
 */

public class TheKeychainsShop {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To The Keychain Shop!");

		while(true){
			System.out.println("1. Add Keychains to Order.");
			System.out.println("2. Remove Keychains from Order.");
			System.out.println("3. View Current Order.");
			System.out.println("4. Checkout.");
			System.out.print("Please Enter Your Choice:");
			int opt = scanner.nextInt();
			switch(opt){
			case 1:
				addKeychains();
				break;
			case 2:
				removeKeychains();
				break;
			case 3:
				viewOrder();
				break;
			case 4:
				checkout();
				System.exit(0);
				break;
			default:
				System.out.println("Incorrect Choice.");
			}
		}

	}
	public static void addKeychains(){
		System.out.println("ADD KEYCHAINS.");
	}
	public static void removeKeychains(){
		System.out.println("REMOVE KEYCHAINS.");
	}
	public static void viewOrder(){
		System.out.println("VIEW ORDER.");
	}
	public static void checkout(){
		System.out.println("CHECKOUT.");
	}

}
