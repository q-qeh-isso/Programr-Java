package sumOfPrimesInNumber;

import java.util.Scanner;

/**
 * Problem:
 * Add all prime digits present in a number.
 * 
 * For eg:
 * Input:
 * 123456 
 * Output: 
 * Sum of prime digits= 10 
 * 
 * Input:
 * 123
 * Output:
 * 5
 * 
 *  
 *
 */

public class Challenge {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter number(string format):");		
		String str = scanner.nextLine();
		
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			int cur = Integer.parseInt(str.substring(i,i+1));
			for (int j = 1; j <= cur; j++) {
				if(cur%j == 0) count++;
			}
			if(count == 2){
				sum += cur;
			}
		}
		
		System.out.println(sum);
		
		
	}

}
