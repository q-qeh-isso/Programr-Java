package sumnumber;

import java.util.Scanner;

/**
 * Write a Java program that accepts a string as an input. 
 * Use the following function: 
 * 
 * public static int sumNumbers(String str)
 * 
 * Following function must return the sum of the numbers appearing 
 * in the string, ignoring all other characters.
 * 
 * Examples:
 * Enter a string:
 * abc123xyz
 * Sum:123
 * 
 * Enter a string:
 * aa11b33
 * Sum:44
 * 
 *  
 *
 */

public class SumNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.println("enter characters and numbers: ");
		str=scanner.nextLine();
		
		System.out.println("Sum:"+sumNumbers(str));

	}
	public static int sumNumbers(String str){
		String[] strNums = new String[str.length()];
		int sum = 0;
		int t = 0;
		
		for (int i = 0; i < strNums.length; i++) {
			strNums[i] = "";
		}
		
		for (int i = 0; i <str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				strNums[t] += String.valueOf(ch);
			} else {
				t++;
			}
		}
		/*for(String s : teste){
			System.out.println(s);
		}*/
		for (int i = 0; i < strNums.length; i++) {
			if(strNums[i].equals("")){
				continue;
			} else {
				sum += Integer.parseInt(strNums[i]);
			}
		}
		return sum;
	}

}
