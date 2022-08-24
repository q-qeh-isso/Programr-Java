package reverseNumber;

import java.util.Scanner;

/**
 * Problem:
 * Reverse inputted number.
 * 
 * For Example:
 * Input:
 * 123 
 * Output: 
 * 321
 * 
 * Input: 
 * 67 
 * Output: 
 * 76
 * 
 *  
 *
 */

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a number");		
		int num = scanner.nextInt();
		int rnum = 0;
		
		String str = String.valueOf(num);
		String res = "";
		for (int i = str.length()-1; i >= 0; i--) {
			res += str.charAt(i);
		}
		rnum = Integer.parseInt(res);
		
		System.out.println("Reverse is: "+rnum);
		
	}

}
