package table;

import java.util.Scanner;

/**
 * Write a table program. The program should ask a user to input a number. 
 * This number is then used to print the table.
 * 
 * Input: 
 * Enter a number: 2
 * Enter number of multiples: 4 
 * Output: 
 * 2*1=2 
 * 2*2=4 
 * 2*3=6 
 * 2*4=8 
 * 
 * Input: 
 * Enter a number: 5 
 * Enter number of multiples: 3 
 * Output: 
 * 5*1=5 
 * 5*2=10 
 * 5*3=15 
 * 
 *  
 *
 */

public class Table {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter a number:");		
		int num = scanner.nextInt();
		System.out.print("Enter number of multiples:");		
		int mult = scanner.nextInt();
		
		for (int i = 1; i <= mult; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
		}
		
	}

}
