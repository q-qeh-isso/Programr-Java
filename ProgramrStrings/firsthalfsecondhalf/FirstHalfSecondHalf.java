package firsthalfsecondhalf;

import java.util.Scanner;

/**
 * Given a string from user, swap the first half with second half.
 * If the string length is odd, take the lower first half and swap. 
 * And if the string length is 1, leave it alone.
 * 
 * For Example:
 * Input:
 * abcde
 * Output:
 * cdeab
 * 
 * Input:
 * abcd
 * Output:
 * cdab
 * 
 *  
 *
 */

public class FirstHalfSecondHalf {

	public static void main(String[] args) {
		System.out.println("Enter a string:");  
		Scanner scan = new Scanner(System.in);  
		String str = "";
		str = scan.nextLine();
		String newStr = "";
		
		int halfLen = 0;
		String half1 = "";
		if(str.length() > 1) {
			halfLen = str.length()/2;
			half1 = str.substring(0,halfLen);
			newStr = str.substring(halfLen) + str.substring(0,halfLen);		
		} else {
			newStr = str;
		}
		System.out.println(newStr);
		
		/*int halfLen = 0;
		String half1 = "";
		if(str.length()%2 == 0 && str.length() > 1) {
			halfLen = str.length()/2;
			half1 = str.substring(0,halfLen);			
			newStr = str.substring(halfLen) + half1;		
		} else if(str.length()%2 != 0 && str.length() > 1){
			halfLen = str.length()/2;
			half1 = str.substring(0,halfLen);
			newStr = str.substring(halfLen) + half1;
		} else {
			newStr = str;
		}
		System.out.println(newStr);*/

	}

}
