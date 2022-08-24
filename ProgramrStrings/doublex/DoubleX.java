package doublex;

import java.util.Scanner;

/**
 * Given a string, return true if the first instance of "x" 
 * in the string is immediately followed by another "x".
 * 
 * Examples:
 * Enter a string of your choice:
 * Ccxxab
 * doublex? :true
 * 
 * Enter a string of your choice:
 * catisnotdog
 * doublex? :false
 * 
 *  
 *
 */

public class DoubleX {

	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		String str="";
		boolean r;
		System.out.println("Enter a string of ur choice:");
		str=scanner.nextLine();
		r=doublex(str);
		System.out.println("doublex? :"+r);
	}

	static boolean doublex(String str) {
		if(str.contains("xx")){
			return true;
		}
		return false;
	}

}
