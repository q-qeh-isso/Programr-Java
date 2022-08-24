package evenOrOdd;

import java.util.Scanner;

/**
 * Given a number, is it odd or even?
 * 
 * Enter a number:
 * 2
 * Even
 * 
 * Enter a number:
 * 7
 * Odd
 * 
 *  
 *
 */

public class EvenOrOdd {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a number:");		
		int num1 = scanner.nextInt();
		
		if(num1%2 == 0) System.out.println("Even");
		else System.out.println("Odd");
		
	}

}
