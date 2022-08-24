package rightOrWrong;

import java.util.Scanner;

/**
 * COM PROBLEMA NA COMPILACAO DO PROGRAMMR
 * 
 * Given 12+12 , ask the user for the answer. If the user inputs 
 * the correct answer, print true else print false. 
 * Use booleans and not strings.
 * 
 * For Example:
 * Input: 
 * 25 
 * Output: 
 * false 
 * 
 * Input: 
 * 24 
 * Output: 
 * true 
 * 
 * @author Renan
 *
 */

public class RightOrWrong {
	
	public static void main(String[] args) {
		
		boolean flag = false;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("12+12=");	
		int num = scanner.nextInt();
		
		if(num == 12+12) flag = true;
		
		System.out.println(flag);
		
	}

}
