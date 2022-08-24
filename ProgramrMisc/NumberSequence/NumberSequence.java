package NumberSequence;

import java.util.Scanner;

/**
 * Complete the following program which will take a number as input 
 * and prints its sequence as output.
 * 
 * For example if input number is 3 then program should print
 * 12321
 * if number is 4 then output should be 1234321
 * 
 * Example 1:
 * Enter the number 3
 * Sequence is:
 * 12321
 * 
 * Example2:
 * Enter the number;
 * 4
 * Sequence is:
 * 1234321
 * 
 *  
 *
 */

public class NumberSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size:");
		int num=scanner.nextInt();
		
		String temp = "";
		for (int i = 1; i <= num; i++) {
			temp += i;
		}
		for (int i = num-1; i >= 1; i--) {
			temp += i;
		}
		System.out.println(temp);
		
	}

}
