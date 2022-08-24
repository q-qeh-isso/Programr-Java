package countingNumberOfAs;

import java.util.Scanner;

/**
 * Determine and print the number of times the character 'a' appears in the 
 * input entered by the user.
 * 
 * Example1:
 * Input: 
 * Enter String:
 * This is a test
 * Output:
 * Number of a's: 1
 * 
 *  
 *
 */

public class CountingAs {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter string:");		
		String str = scanner.nextLine();
		
		int countA = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') countA++;
		}
		
		System.out.println("Number of a's: "+countA);
		
	}

}
