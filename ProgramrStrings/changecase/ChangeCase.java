package changecase;

import java.util.Scanner;

/**
 * Problem:
 * User enters a string in mixed case(uppercase +lowercase),
 * code so that uppercase is changed to lowercase and vice-versa.
 * 
 * For Exmaple:
 * Input:
 * Hello
 * Output:
 * hELLO
 * 
 * Input:
 * wORLd
 * Output:
 * WorlD
 * 
 *  
 *
 */

public class ChangeCase {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a sentence:");  
		Scanner scan = new Scanner(System.in);  
		String str = "";
		str = scan.nextLine();
		String newStr = "";
		char ch = ' ';
		
		for(int i = 0; i<str.length(); i++){
			ch = str.charAt(i);
			if(Character.isUpperCase(ch)){
				newStr += Character.toLowerCase(ch);
			} else {
				newStr += Character.toUpperCase(ch);
			}
		}
		/*String[] lets = str.split("");		
		for(int i = 0; i<lets.length; i++){
			String temp = lets[i].toUpperCase();
			if(lets[i].equals(temp)){
				newStr += lets[i].toLowerCase();
			} else {
				newStr += lets[i].toUpperCase();
			}
		}*/
		/*char[] lets = str.toCharArray();		
		for(int i = 0; i<lets.length; i++){
			String temp = String.valueOf(lets[i]).toUpperCase();
			if(String.valueOf(lets[i]).equals(temp)){
				newStr += String.valueOf(lets[i]).toLowerCase();
			} else {
				newStr += String.valueOf(lets[i]).toUpperCase();
			}
		}*/
		
		System.out.println(newStr);
		
	}

}
