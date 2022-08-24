package palindromeCheck;

import java.util.Scanner;

/**
 * Write a program to ask a string from user and check 
 * if it is a palindrome or not.
 * 
 * Hint: Palindrome strings are those strings which are same whether 
 * read from the front or back. eg 'mom', 'dad', 'nitin', 'madam' * 
 * 
 * Input: 
 * Enter a String:
 * madam
 * Output:
 * Entered string is a palindrome.
 * 
 * Input:
 * Enter a String:
 * abc
 * Output:
 * Entered string is not a palindrome.
 * 
 *  
 *
 */

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		 
        System.out.print("Enter a line of text: "); 
        String line = sc.nextLine();
        System.out.println();
        
        //{ Write your code here  
        // Start  
        String rev = "";
        boolean hasBlank = false;
        for(int i = line.length()-1; i>=0; i--){
        	if(line.charAt(i) == ' '){
        		hasBlank = true;
        		continue;
        	} else {
        		rev += line.charAt(i);
        	}
        }
        
        System.out.println("reverse version: " + rev);
        
        if (rev.equals(line) || (rev.equals(line) && hasBlank)){
            System.out.println("Entered string is a palindrome.");
        } else {
            System.out.println("Entered string is not a palindrome.");  
        }
	}

}
