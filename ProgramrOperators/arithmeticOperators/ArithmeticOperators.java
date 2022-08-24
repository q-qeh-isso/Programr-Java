package arithmeticOperators;

import java.util.Scanner;

/**
 * Write Java program to allow the user to input two integer values 
 * and then the program prints the results of adding, subtracting, 
 * multiplying, and dividing among the two values.
 * 
 * Ex:
 * 
 * Enter value a: 30 
 * Enter value b: 10 
 * The result of adding is 40 
 * The result of subtracting is 20 
 * The result of multiplying is 300 
 * The result of dividing is 3.0
 * 
 * Enter value a: -28 
 * Enter value b: 14 
 * The result of adding is -14 
 * The result of subtracting is -42 
 * The result of multiplying is -392 
 * The result of dividing is -2.0
 * 
 *  
 *
 */

public class ArithmeticOperators {
	
	public static void main(String[] args) {
		
		int resulta = 0, results = 0, resultm = 0;
		float resultd = 0;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a:");		
		int a = scanner.nextInt();
		System.out.println("Enter b:");		
		int b = scanner.nextInt();
		
		resulta = a+b;
		results = a-b;
		resultm = a*b;
		resultd = a/(b);
		
		System.out.println("The result of adding is " + resulta);
		System.out.println("The result of subtracting is " + results);
		System.out.println("The result of multiplying is " + resultm);
		System.out.println("The result of dividing is " + resultd);
		
		
		
	}

}
