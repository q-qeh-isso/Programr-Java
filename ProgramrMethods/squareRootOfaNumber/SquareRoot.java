package squareRootOfaNumber;

import java.util.Scanner;

/**
 * Write a Java program to print the square root of a positive 
 * number. Round off the output to the nearest integer.
 * 
 * For example:
 * Input:
 * Enter a number: 4
 * Output:
 * The square root is: 2
 * 
 * Input:
 * Enter a number: 9
 * Output:
 * The square root is: 3
 * 
 *  
 *
 */

public class SquareRoot {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
//		double sqr = Math.sqrt(num);
//		int res = (int) sqr;
		int res = (int) Math.sqrt(num);
		
		System.out.println(res);
		
	}

}
