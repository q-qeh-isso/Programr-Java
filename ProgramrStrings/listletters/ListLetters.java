package listletters;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that reads a line of text entered by the user. 
 * Convert all the letters to upper case and then print a list 
 * of the different letters that occur in the text in ascending order. 
 * Also display the count of different letters.
 * 
 * Examples:
 * Please type in a line of text:
 * hello
 * Your input contains the following letters:
 * E
 * H
 * L
 * O
 * There were 4 different letters.
 * 
 * Please type in a line of text:
 * What do you want
 * Your input contains the following letters:
 * A
 * D
 * H
 * N
 * O
 * T
 * U
 * W
 * Y
 * There were 9 different letters.
 * 
 *  
 *
 */


public class ListLetters {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.println("type in a line of text: ");
		str=scanner.nextLine();
		char ch = ' ';
		String newStr = "";
		
		str = str.toUpperCase();
		for (int i = 0; i < str.length(); i++){
			ch = str.charAt(i);
			if(ch != ' '){
				newStr += ch;
			}
			str = str.replace(ch, ' ');
		}
		
		char[] strC = newStr.toCharArray();
		Arrays.sort(strC);		
		System.out.println("Your input contains the following letters: ");
		for(char c : strC){
			System.out.println(c);
		}
		
		System.out.println("There were " + strC.length + " different letters.");
		
		/*int difLet = 0;
		for (int i = 0; i < str.length()-1; i++) {
			if(str.substring(i, i+1).equals(str.substring(i+1, i+2))){
				i++;
				continue;
			} else {
				difLet++;
				System.out.println(str.substring(i, i+1).toUpperCase());
			}
		}*/

		
	}

}
