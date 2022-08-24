package decodeurl;

import java.util.Scanner;

/**
 * Write a java program to modify your input in place. 
 * Replace the substring with following characters as shown below:
 * if substring is %20 = ' ' 
 * if substring is %3A = '?' 
 * if substring is %3D = '.'
 * 
 * Examples:
 * kitten%20pic.jpg
 * kitten pic.jpg
 * 
 * hello%3Dworld.jpg
 * hello.world.jpg
 * 
 *  
 *
 */

public class DecodeUrl2 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a sentence:");  
		Scanner scan = new Scanner(System.in);  
		String str = "";
		str = scan.nextLine();
		
		DecodeUrl2 obj = new DecodeUrl2();
		str=obj.decodeURL(str);
		System.out.println("Decoded URL is: " + str);
		
	}
	
	public String decodeURL(String str){
		String newStr = "";
		if(str.contains("%20")){
			newStr = str.replace("%20", " ");
			
		} else if(str.contains("%3A")){
			newStr = str.replace("%3A", "?");
			
		} else if(str.contains("%3D")){
			newStr = str.replace("%3D", ".");
		}
		return newStr;
	}

}
