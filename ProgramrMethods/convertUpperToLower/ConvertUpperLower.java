package convertUpperToLower;

import java.util.Scanner;

/**
 * Ask user for a letter, if upper case, change to lower case. 
 * Else leave it alone.
 * 
 * Example:
 * Input : N 
 * Output : n 
 * 
 * Input: n 
 * Output: n
 * 
 * 
 *  
 *
 */

public class ConvertUpperLower {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter a letter:");
		String x = scanner.next();

		System.out.println(helper(x));
		
	}
	
	public static String helper(String a){
		///{Write your code here
		if(Character.isUpperCase(a.charAt(0))){
			return a.toLowerCase();
		}
		
		return a;
		///}         
	}

}
