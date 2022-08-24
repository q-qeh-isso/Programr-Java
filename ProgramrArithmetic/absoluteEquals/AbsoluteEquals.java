package absoluteEquals;

import java.util.Scanner;

/**
 * Check if the Absolute Values of the two inputted numbers 
 * are equal.
 * 
 * Examples:
 * If the numbers are 43 and 43, the program should print "true".
 * If the numbers are 43 and 46, the program should print "false".
 * If the numbers are 43 and -43, the program should print "true".
 * That's about it! :)
 * 
 * @author Renan
 *
 */

public class AbsoluteEquals {
	
	public static void main(String[] args) {
		
		boolean equal = false;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter 1st number:");		
		int num1 = scanner.nextInt();
		System.out.println("Enter 2nd number:");		
		int num2 = scanner.nextInt();
		
		if(Math.abs(num1) == Math.abs(num2)) equal = true;
		
		System.out.println("Result is:"+equal);
	}

}
