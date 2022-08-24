package endup;

import java.util.Scanner;

/**
 * Given a string, return a new string where the last 3 chars are 
 * now in upper case. If the string has less than 3 chars, 
 * uppercase whatever is there. Note that str.toUpperCase() 
 * returns the uppercase version of a string.
 * 
 * Enter a string:Hello
 * HeLLO
 * 
 * Enter a string:hi
 * HI
 * 
 *  
 *
 */

public class EndUp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.println("Enter a string of ur choice:");
		str=scanner.nextLine();
		
		String end = "";
		String beg = "";
		if(str.length() > 3){
			end = str.substring(str.length()-3).toUpperCase();
			beg = str.substring(0, str.length()-3);
		} else {
			beg = str.toUpperCase();
		}
		
		System.out.println( beg+end );

	}

}
