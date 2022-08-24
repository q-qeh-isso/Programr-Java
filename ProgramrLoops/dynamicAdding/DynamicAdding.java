package dynamicAdding;

import java.util.Scanner;

/**
 * Ask user for how much numbers to add. Then ask for specified number 
 * of int's. Then add them and print result.
 * 
 * For Example:
 * Input: 
 * 5 
 * Input: 
 * 1 
 * 2 
 * 3 
 * 4 
 * 5 
 * Output: 
 * 15 
 * 
 * Input: 
 * 3 
 * Input: 
 * 3 
 * 2 
 * 1 
 * Output: 
 * 6
 * 
 *  
 *
 */

public class DynamicAdding {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter how much numbers to add:");		
		int size = scanner.nextInt();
		int sum = 0;
		
		System.out.println("Enter "+size+" numbers:");
		for (int i = 0; i < size; i++) {
			sum += scanner.nextInt();
		}
		
		System.out.println(sum);
		
	}

}
