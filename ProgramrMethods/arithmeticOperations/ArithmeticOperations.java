package arithmeticOperations;

import java.util.Scanner;

/**
 * In the below exercise, implement the Sum, Difference and 
 * Product methods. The main() method holds two integer variables. 
 * The program will take inputs from the user.
 * 
 * Sum(): Takes 2 integers as inputs and computes the sum and displays 
 * the sum, returns void.
 * Difference(): Takes 2 integers as inputs and computes the difference 
 * and displays the difference, returns void.
 * Product(): Takes 2 integers as inputs and computes their 
 * multiplication and returns the multiplication answer. 
 * This method (product) does not display the answer. 
 * Instead, it should return the answer to the calling main() program, 
 * which displays the answer.
 * 
 * Note:Do not use getters and setters.
 * 
 * Example1:
 * Inputs:
 * Enter first number:
 * 5
 * Enter second number:
 * 2
 * Outputs:
 * 7
 * 3
 * 10
 * 
 * Example2:
 * Inputs:
 * Enter first number:
 * 10
 * Enter second number:
 * 5
 * 
 * Outputs:
 * 15
 * 5
 * 50
 * 
 *  
 *
 */

public class ArithmeticOperations {

	public static void main(String[] args) {

		int num1 = 0;  
		int num2 = 0;  

		Scanner sc = new Scanner(System.in);  

		System.out.print("Enter first number: ");  
		num1 = sc.nextInt();  
		System.out.print("Enter second number: ");  
		num2 = sc.nextInt(); 

		sum(num1, num2);  
		difference(num1, num2);
		System.out.print(product(num1, num2)+"\n");

	}

	public static void sum(int num1, int num2){
		System.out.println(num1 + num2);
	}
	public static void difference(int num1, int num2){
		System.out.println(num1 - num2);
	}
	public static int product(int num1, int num2){
		return num1 * num2;
	}

}
