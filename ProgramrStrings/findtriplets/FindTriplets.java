package findtriplets;

import java.util.Scanner;

/**
 * Make a Java program that accepts a string as an input. 
 * Use the following method:
 * 
 * public static int countTriplets(String str)
 * 
 * The method must return the number of triplets in the given string. 
 * We'll say that a "triplet" in a string is a char appearing three 
 * times in a row. The triples may overlap.
 * 
 * Examples:
 * Enter a string:
 * abcXXXabc
 * 1
 * 
 * Enter a string:
 * xxxabyyyycd
 * 3
 * 
 *  
 *
 */

public class FindTriplets {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.println("enter string: ");
		str=scanner.nextLine();
		
		
		System.out.println(countTriplets(str));

	}
	public static int countTriplets(String str){
		int count = 0;
		for (int i = 0; i < str.length()-2; i++) {
			char t1 = str.charAt(i);
			char t2 = str.charAt(i+1);
			char t3 = str.charAt(i+2);
			if(t1 == t2 && t2 == t3){
				count++;
			}
		}
		return count;
	}

}
