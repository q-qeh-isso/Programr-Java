package sumMultiplesOf3or5below;

import java.util.Scanner;

/**
 * Find the sum of multiples of 3 or 5 below a number of your choice.
 * 
 * Input: 
 * 10 
 * Output:
 * 23
 * 
 * Input:
 * 1000 
 * Output: 
 * 233168 
 * 
 * @author Renan
 *
 */

public class Challenge {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a number:");		
		String num1 = scanner.nextLine();
		
		int res = 0;
		int n = Integer.parseInt(num1);
		for (int i = 1; i < n; i++) {
			if(i%3 == 0 || i%5 == 0) res += i;
		}
		System.out.println(res);
		
	}

}
