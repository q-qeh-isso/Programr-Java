package sumOf5Integers;

import java.util.Scanner;

/**
 * Write a program to find the sum of 5 integers.
 * 
 * Enter an integer:2
 * Enter an integer:4
 * Enter an integer:3
 * Enter an integer:-2
 * Enter an integer:3
 * Output :
 * Total is:15
 * 
 *  
 *
 */

public class SumOfIntengers {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Enter an integer:");
			nums[i] = scanner.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		
		System.out.println("Total is:"+sum);
		
	}

}
