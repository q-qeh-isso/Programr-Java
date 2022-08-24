package squareRootQuadraticRoot;

import java.util.Scanner;

/**
 * Given a double from user, calc the square root and the 
 * quad root and print it.
 * 
 * Limit the answers to 5 decimal places.
 * For Example:
 * Input: 
 * 81 
 * Output: 
 * 9.00000
 * 3.00000
 * 
 * Input: 
 * 625 
 * Output: 
 * 25.00000
 * 5.00000
 * 
 * @author Renan
 *
 */

public class Challenge {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter number:");		
		int num1 = scanner.nextInt();
		
		double squareRoot = Math.sqrt(num1);
		double quadRoot = Math.sqrt( Math.sqrt(num1) );
		
		System.out.printf("%.5f\n",squareRoot);
		System.out.printf("%.5f",quadRoot);
		
	}

}
