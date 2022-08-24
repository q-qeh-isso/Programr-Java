package rotateleftbytwo;

import java.util.Scanner;

/**
 * Write a Java program that accepts a string as an input from the user. 
 * Display the "rotated 2" version of the string where the first two 
 * characters are moved to the end. The string length must be atleast 2.
 * 
 * Example:
 * Enter a string:
 * Hello
 * loHe
 * 
 *  
 *
 */

public class RotateLeft {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.println("enter a string: ");
		str=scanner.nextLine();
		
		if(str.length() > 2){
			System.out.println(str.substring(2)+str.substring(0,2));
		} else {
			System.out.println(str);
		}

	}

}
