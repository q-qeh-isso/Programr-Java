package binaryToDecimal;

import java.util.Scanner;

/**
 * Write a java program to convert binary number into decimal value.
 * 
 * For Example:
 * Input:
 * 10100011 
 * Output: 
 * 163
 * 
 * Input: 
 * 101 
 * Output: 
 * 5 
 * 
 *  
 *
 */

public class BinaryToDecimal {
	
	public static void main(String[] args) {		
		String num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary:");
		num = sc.nextLine(); 
		
		int foo = Integer.parseInt(num, 2);
		System.out.println(foo);
		
	}

}
