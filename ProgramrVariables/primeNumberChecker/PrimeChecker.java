package primeNumberChecker;

import java.util.Scanner;

/**
 * Write a Java program to find if the input number is prime or not
 * 
 * Ex:
 * Enter your input number: 24
 * Input number is not a prime number
 * 
 * Enter your input number: 7 
 * Input number is a prime number
 * 
 *  
 *
 */

public class PrimeChecker {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a number:");		
		int num1 = scanner.nextInt();
		
		int count = 0;
		for (int i = 1; i <= num1; i++) {
			if(num1%i == 0) count++;
		}
		if(count == 2) System.out.println("Input number is a prime number");
		else System.out.println("Input number is not a prime number");
		
	}

}
