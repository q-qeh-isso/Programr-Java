package shareDigit;

import java.util.Scanner;

/**
 * Make a Java program that accepts two integers (each in the range 10-99) 
 * as an input. Use the following method:
 * 
 * shareDigit(int num1,int num2)
 * The method must return true if there is a digit that appears in both 
 * numbers otherwise return false.
 * 
 * Enter the 1st number:
 * 12
 * Enter the 2nd number:
 * 23
 * true
 * 
 * Enter the 1st number:
 * 12
 * Enter the 2nd number:
 * 43
 * false
 * 
 *  
 *
 */

public class ShareDigit {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter 1st number:");
		int first = scanner.nextInt();
		System.out.println("Enter 2nd number:");
		int second = scanner.nextInt();
		
		System.out.println(shareDigit(first,second));		
	}
	
	public static boolean shareDigit(int first, int second){
		if( (first/10 == second/10 || first/10 == second%10) ||
			(first%10 == second/10 || first%10 == second%10)
				){
			return true;
		}
		
		return false;
	}

}
