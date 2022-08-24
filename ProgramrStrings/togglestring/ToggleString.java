package togglestring;

import java.util.Scanner;

/**
 * Ask user for a string. 
 * Toggle all upper case and lower case characters. 
 * 
 * Examples:
 * Input:
 * AbCdE 
 * Output:
 * aBcDe
 * 
 * Input:
 * HellO
 * Output:
 * hELLo
 * 
 *  
 *
 */

public class ToggleString {

	public static void main(String[] args) {
		System.out.println("Enter a sentence:");  
		Scanner scan = new Scanner(System.in);  
		String str = "";
		str = scan.nextLine();
		String newStr = "";
		
	
		for(int i = 0; i<str.length(); i++){
			String temp = str.substring(i, i+1).toUpperCase();
			if(str.substring(i, i+1).equals(temp)){
				newStr += str.substring(i, i+1).toLowerCase();
			} else {
				newStr += str.substring(i, i+1).toUpperCase();
			}
		}
		System.out.println(newStr);
	}

}
