package hasbad;

import java.util.Scanner;

/**
 * Make a Java program that accepts a string from the user as an input. 
 * Display "True" if "bad" appears starting at index 0 or 1 in the 
 * string otherwise display "False".
 * 
 * Examples:
 * Enter a string:
 * badxx
 * True
 * 
 * Enter a string:
 * xxbadxx
 * False
 * 
 *  
 *
 */

public class HasBad {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.println("enter a string: ");
		str=scanner.nextLine();
		
		String flag = "False";
		if(str.substring(0,4).contains("bad")){
			flag = "True";
		}
		System.out.println(flag);

	}

}
