package leapYear;

import java.util.Scanner;

/**
 * Write a program that which takes an year "N" as input and 
 * prints true if N corresponds to a leap year, and false otherwise. 
 * Assumes N >= 1582, corresponding to a year in the Gregorian calendar.
 * 
 * Enter the year to be checked: 
 * 1992
 * true
 * 
 * Enter the year to be checked: 
 * 2013
 * false
 * 
 *  
 *
 */

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the year to be checked:");		
		int year = scanner.nextInt();
		boolean flag = false;
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			flag = true;
		}
		System.out.println(flag);
		
	}

}
