package substringchecker;

import java.util.Scanner;

/**
 * Write a program to check if the second string is a 
 * substring of the first string.
 * 
 * Examples:
 * Enter first string:CSED
 * Enter second string:SE
 * Yes
 * 
 * Enter first string:abc
 * Enter second string:d
 * No
 * 
 *  
 *
 */

public class SubstringChecker {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String str="";
		String str2="";
		System.out.println("enter a string: ");
		str=scanner.nextLine();
		System.out.println("enter another string: ");
		str2=scanner.nextLine();
		
		String flag = "No";
		if(str.length() > str2.length()){
			if(str.contains(str2)){
				flag = "Yes";
			} else {
				flag = "No";
			}
		} else {
			flag = "No";
		}
		
		System.out.println(flag);

	}
}
