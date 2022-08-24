package factorialValue;

import java.util.Scanner;

/**
 * Write a java program to calculate the factorial value of given number.
 * 
 * Input: 
 * 5 
 * Output: 
 * Factorial of the number is: 120 
 * 
 * Input: 
 * 4 
 * Output: 
 * Factorial of the number is: 24 
 * 
 *  
 *
 */

public class FactorialValue {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter a number:");		
		int num = scanner.nextInt();
		
		int res = 1;
		for (int i = 1; i <= num; i++) {
			//res *= i;
			res = res * i;
		}
		
		System.out.println(res);
		
	}

}
