package bobthere;

import java.util.Scanner;

/**
 * Write a Java program that accepts a string as input 
 * from the user. Print "True" if the given string 
 * contains a "bob" string. If it does not print "False". 
 * The middle "o" character can be any character.
 * 
 * Examples:
 * Enter a string:
 * b9b
 * True
 * 
 * Enter a string:
 * bac
 * False
 * 
 *  
 *
 */

public class BobThere {

	public static void main(String[] args) {
		System.out.println("Enter a sentence:");  
		Scanner scan = new Scanner(System.in);  
		String str = "";
		str = scan.nextLine();
		
		String flag = "False";
		for (int i = 0; i<str.length()-2; i++) {
			if(str.substring(i, i+1).equals("b") &&
				str.substring(i+2,i+3).equals("b")){
				flag = "True";
			}
		}
		System.out.println(flag);
	}

}
