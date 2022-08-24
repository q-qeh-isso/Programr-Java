package mixString;

import java.util.Scanner;

/**
 * Make a Java program that accepts two strings (str1 and str2) as an 
 * input from the user. Using a method, "mixString(String a, String b)", 
 * create a bigger string made of the first char of str1, the first 
 * char str2, the second char of str1, the second char of str2, and so on. 
 * Any leftover chars go at the end of the result. 
 * Print the result at the end. 
 * 
 * Enter first string:
 * abc
 * Enter second string:
 * xyz
 * axbycz
 * 
 * Enter first string:
 * Hi
 * Enter second string:
 * There
 * HTihere
 * 
 *  
 *
 */

public class MixString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1 = scanner.nextLine();
		System.out.println("Enter second string:");
		String str2 = scanner.nextLine();
		System.out.println(mixString(str1,str2));


	}

	public static String mixString(String str1, String str2){

		String big = (str1.length() > str2.length()) ? str1 : str2;
		String res = "";
		
		for (int i = 0; i < big.length(); i++) {
			if(i < str1.length()){
				res += str1.charAt(i);
			}			
			if(i < str2.length()){
				res += str2.charAt(i);
			}
		}
		return res;

	}

}
