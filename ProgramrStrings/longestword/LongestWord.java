package longestword;

import java.util.Scanner;
/**
 * Program to display the longest word in a given sentence.
 * The sentence should be given as an input from the key board 
 * by the user. If there are two words of equal length, 
 * it displays the first longest word. 
 * 
 * Example:
 * Input: What is your occupation ?
 * Output:The longest word in the sentence is occupation
 * 
 * Input:what is your name ?
 * Output:The longest word in the sentence is what
 * 
 *  
 *
 */

public class LongestWord {

	public static void main(String[] args) {
		System.out.println("Enter a sentence:");  
		Scanner scan = new Scanner(System.in);  
		String s1 = "";
		s1 = scan.nextLine();
		String longestWord = "";

		///{Enter your code here   
		String[] words = s1.split(" ");
		longestWord = words[0];
		for(int i = 0; i<words.length; i++){
			if(words[i].length() > longestWord.length()){
				longestWord = words[i];
			}
		}

		System.out.println("The longest word in the sentence is:"+longestWord);
	}

}
