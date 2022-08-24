package extractingDigits;

import java.util.Scanner;

/**
 * Write a program to extract each digit from an int, in the reverse order.
 * 
 * Enter a number:123
 * Reverse of number:321
 * 
 *  
 *
 */

public class ExtractingDigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a number");		
		int num = scanner.nextInt();
		String out = "";
		int len = Integer.toString(num).length();
		String str = String.valueOf(num);		
		
		for (int i = len-1; i >= 0; i--) {
			out += str.charAt(i);
		}

		System.out.println("Reverse of number: "+out);
	}

}
