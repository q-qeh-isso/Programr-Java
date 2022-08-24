package armstrongNumbers;

import java.util.Scanner;

/**
 * ERRO
 * 
 * Using nested for loops, find all the three-digit Armstrong numbers. 
 * Armstrong numbers are three digit numbers such that the sum of the 
 * digits cubed is equal to the number itself.
 * 
 * For example, 153 is an Armstrong number because 1� + 5� + 3� = 153
 * However, 294 is not, because 2� + 9� + 4� = 801 (not 294)
 * 
 * Output:
 * 153
 * 370
 * 371
 * 407
 * 
 *  
 *
 */

public class ArmstrongNumbers {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a number");		
		int num = scanner.nextInt();
		
		String str = String.valueOf(num);
		int test = 0;
		for (int i = 0; i < str.length(); i++) {
			int cur = Integer.valueOf(str.substring(i,i+1));
			test += (cur*cur*cur); 
		}
		if(test == num) System.out.println("It is an Armstrong number.");
		else System.out.println("It is not an Armstrong number.");
		
	}

}
