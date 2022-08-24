package findSimpleInterest;

import java.util.Scanner;

/**
 * Write a simple program that will compute the amount of 
 * interest that is earned on an investment over a period of one year.  
 * The initial amount of the investment and the interest rate are input 
 * by the user. (Enter 5 for 5% interest rate)
 * 
 * The value of the investment at the end of the year is output. 
 * Enter the initial investment:
 * 30000
 * Enter the annual interest rate:
 * 5
 * The value of the investment after one year is: 31500
 * 
 *  
 *
 */

public class Find {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the initial investment:");		
		double principal = scanner.nextInt();
		System.out.println("Enter the annual interest rate:");		
		double rate = scanner.nextInt();
		
		double interest = (rate * principal) / 100;
		double res = interest + principal;		
		System.out.println(res);
		
	}

}
