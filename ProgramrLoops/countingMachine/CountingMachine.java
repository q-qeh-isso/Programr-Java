package countingMachine;

import java.util.Scanner;

/**
 * Write a program that gets an integer from the user. 
 * Count from 0 to that number. Use a for loop to do it.
 * 
 * Input
 * 10
 * Output 
 * 0 1 2 3 4 5 6 7 8 9 10
 * 
 * Input
 * 7 
 * Output 
 * 0 1 2 3 4 5 6 7
 * 
 *  
 *
 */

public class CountingMachine {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a number");		
		int num = scanner.nextInt();
		
		for (int i = 0; i <= num; i++) {
			System.out.print(i+" ");
		}		
		
	}

}
