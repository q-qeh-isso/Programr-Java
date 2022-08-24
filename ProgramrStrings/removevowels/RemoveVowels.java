package removevowels;

import java.util.Scanner;

/**
 * Problem:
 * User enters a word, you have to code such that, 
 * any vowel found in word should be dropped (removed).
 * 
 * Examples:
 * Input:
 * Hello
 * Output:
 * Hll
 * 
 * Input:
 * john
 * Output:
 * jhn
 * 
 *  
 *
 */

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.print("Enter string: "); 
		String str = sc.nextLine();
		String newStr = "";
		char ch = ' ';

		/*for (int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
				continue;
			}
			newStr += ch;
		}*/
		
		char[] vowels = new char[]{'a','e','i','o','u','A','E','I','O','U'};
		firstloop:
		for (int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			
			secloop:
			for (int v = 0; v < vowels.length; v++) {
				if(ch == vowels[v]){
					continue firstloop;
				}
			}
			
			newStr += ch;
		}
		
		System.out.println(newStr);

	}

}
