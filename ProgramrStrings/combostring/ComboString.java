package combostring;

import java.util.Scanner;

/**
 * Make a Java program that accepts two strings as an input 
 * from the user. 
 * Display a string in the form short+long+short, with the 
 * shorter string on the outside and the longer string on 
 * the inside. If the two strings are equal, 
 * the first string will be on the outside.
 * 
 * Example:
 * Enter a string:
 * Hi
 * Enter another string:
 * Hello
 * HiHelloHi
 * 
 *  
 *
 */

public class ComboString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		String str2="";
		System.out.print("enter string: ");
		str=scanner.nextLine();
		System.out.println("enter another string: ");
		str2=scanner.nextLine();
		
		String largest = "",
				smallest = "";
		if(str.length() > str2.length()){
			largest = str;
			smallest = str2;
		} else if(str.length() < str2.length()){
			largest = str2;
			smallest = str;
		} else if(str.length() == str2.length()){
			largest = str2;
			smallest = str;
		}
		
		System.out.println(smallest+largest+smallest);
		
		

	}

}
