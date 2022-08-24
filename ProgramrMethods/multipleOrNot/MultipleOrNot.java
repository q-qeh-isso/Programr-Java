package multipleOrNot;

import java.util.Scanner;

/**
 * Given two numbers, is the second input a multiple of the first?
 * 
 * For Example:
 * Input:
 * 3
 * 6
 * Output:
 * true
 * 
 * Input:
 * 4
 * 6
 * Output:
 * false
 * 
 *  
 *
 */

public class MultipleOrNot {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter first number:");
		int x = scanner.nextInt();
		System.out.println("Enter second number:");
		int y = scanner.nextInt();

		System.out.println(multiples(x,y));
	}

	public static boolean multiples(int x , int y){
		///{Write your code here
		if(y%x == 0) return true;

		return false;
		///}         
	}

}
