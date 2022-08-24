package maxblock;

import java.util.Scanner;

/**
 * Write a Java program to accept a string as an input. 
 * Use the following method:
 * 
 * public int maxBlock(String str)
 * 
 * Following method must return the length of the largest block in the string. 
 * A block is a run of adjacent characters that are the same.
 * 
 * Examples:
 * Enter a string:
 * hoopla
 * 2
 * 
 * Enter a string:
 * abCCCddBBBxx
 * 3
 * 
 *  
 *
 */

public class MaxBlock {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.println("enter a string: ");
		str=scanner.nextLine();
		
		int len = maxBlock(str);
		System.out.println(len);
		
	}
	
	public static int maxBlock(String str){
		int maxLen = 0;
		int tempLen = 0;
		char prevChar = ' ';
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == prevChar){
				tempLen++;
			} else {
				maxLen = (tempLen > maxLen) ? tempLen : maxLen;
				prevChar = c;
				tempLen = 1;
			}	
		}
		maxLen = (tempLen > maxLen) ? tempLen : maxLen;
		return maxLen;
	}

}
