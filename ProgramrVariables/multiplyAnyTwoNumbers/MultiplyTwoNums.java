package multiplyAnyTwoNumbers;

import java.util.Scanner;

/**
 * Complete the given Java program such that it multiplies the two 
 * inputted numbers.
 * 
 * Input:
 * 1
 * 2
 * Output:
 * 2
 * 
 * Input:
 * 2
 * 3
 * Output:
 * 6
 * 
 *  
 *
 */

public class MultiplyTwoNums {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter 1st number:");		
		int num1 = scanner.nextInt();
		System.out.println("Enter 2nd number:");		
		int num2 = scanner.nextInt();
		
		int product = num1 * num2;
		System.out.println(product);
		
	}

}
