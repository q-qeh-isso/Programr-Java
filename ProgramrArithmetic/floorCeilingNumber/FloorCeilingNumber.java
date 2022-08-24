package floorCeilingNumber;

import java.util.Scanner;

/**
 * Ask a user for a number then print the ceiling and floor. 
 * 
 * For Example:
 * Input: 
 * 5.6   
 * Output: 
 * 6 
 * 5 
 * 
 * Input: 
 * 8.4 
 * Output: 
 * 9 
 * 8 
 * 
 * @author Renan
 *
 */

public class FloorCeilingNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter double number:");		
		double num1 = scanner.nextDouble();
		
		int ceil = (int) Math.ceil(num1);
		int floor = (int) Math.floor(num1);
		System.out.println(ceil);
		System.out.println(floor);
		
	}

}
