package addUpTheInputs;

import java.util.Scanner;

/**
 * You have to create a code such that it sums up all the integer 
 * values entered by the user. Summing stops when the user enters 0. 
 * Display sum at the end.
 * 
 * Input:
 * 2 
 * 3 
 * -1 
 * 3 
 * 0 
 * Output:
 * The total is: 7 
 * 
 * Input: 
 * 2 
 * -1 
 * 0 
 * Output: 
 * The total is: 1
 * 
 *  
 *
 */

public class AddUpTheInputs {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter numbers(stop by typing 0):");	
		
		int num = 0;
		int res = 0;
		while(true){
			num = scanner.nextInt();
			res += num;			
			if(num == 0) break;
		}
		
		System.out.println("The total is: " + res);
		
	}

}
