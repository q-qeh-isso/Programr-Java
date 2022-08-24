package noMultiplesof34;

import java.util.Scanner;

/**
 * Ask user for number n, Print all numbers 1-> n. 
 * Except multiples of 3 or 4.
 * 
 * Input : 
 * 10 
 * Output: 
 * 1 
 * 2 
 * 5 
 * 7 
 * 10 
 * 
 * Input: 
 * 5 
 * Output: 
 * 1 
 * 2 
 * 5 
 * 
 * @author Renan
 *
 */

public class NoMultiples34 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter number:");		
		int num = scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if(i%3 != 0 && i%4 != 0){
				System.out.println(i);
			}
		}
		
	}

}
