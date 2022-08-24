package testPalindromicWord;

import java.util.Scanner;

/**
 * Write a program that prompts user for a word and prints "Yes" if it 
 * is a palindrome and "No" if not.
 * 
 * Enter a string:
 * mom
 * Yes
 * 
 * Enter a string:
 * Sam
 * No
 * 
 *  
 *
 */

public class TestPalindromic {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		 
        System.out.println("Enter a string:"); 
        String str = scanner.nextLine();
        
        String rev = "";
        boolean flag = true;
        for(int i = str.length()-1; i>=0; i--){
        	rev += str.charAt(i);
        }
        if (!rev.equals(str)) flag = false;

        if (flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");  
        }
		
	}

}
