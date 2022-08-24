package sumLimit;

import java.util.Scanner;

/**
 * Make a Java program that accepts two integers(num1 and num2) as an 
 * input from the user and returns their sum as long as the sum has the 
 * same number of digits as num1. If sum has more digits than num1 than 
 * return num1 without num2.
 * 
 * Enter the 1st number: 2
 * Enter the 2nd number: 3
 * Result:5
 * 
 * Enter the 1st number:9
 * Enter the 2nd number:3
 * Result:9
 * 
 * @author Renan
 *
 */

public class SumLimit {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter 2nd number:");
		int num2 = scanner.nextInt();
		
		
		int sum = num1 + num2;
		int sumLen = String.valueOf(sum).length();
		int num1Len = String.valueOf(num1).length();
		int res = 0;
		if(sumLen == num1Len) res = sum;
		else res = num1;
		
		System.out.println(res);
		
	}

}
