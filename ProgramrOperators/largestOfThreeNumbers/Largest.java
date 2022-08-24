package largestOfThreeNumbers;

import java.util.Scanner;

/**
 * Write a program to find the largest of three numbers and then 
 * print whether the "First" or the "Second" or the "Third" number 
 * is the largest.  If the largest number has a duplicate then 
 * "Entered numbers are not distinct." is displayed.
 * 
 * Enter three integers:
 * 5
 * 24
 * 13
 * Second number is largest.
 * 
 * Enter three integers:
 * 69 
 * 17 
 * 69
 * Entered numbers are not distinct.
 * 
 *  
 *
 */

public class Largest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter 3 numbers:");		
		int a = scanner.nextInt();		
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int res = b;
		String count = "Second";
		
		
		if(a > res){
			res = a;
			count = "First";
		}
		if(c > res){
			res = c;
			count = "Third";
		}
		if((a == b  && !count.equals("First")) || 
			(b == c && !count.equals("Second")) || 
			(c == a && !count.equals("Third")) ){
			
			System.out.println("Entered numbers are not distinct.");
		} else {
			System.out.println(count + " number is largest.");
		}
	}

}
