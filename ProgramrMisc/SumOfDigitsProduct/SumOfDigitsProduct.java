package SumOfDigitsProduct;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Create a program that outputs the sum of digits of the 
 * product of the numbers from 1 and an inputted number. 
 * Sort of easy right? Now here's the thing.
 * 
 * The problem mainly focuses on the storage of data. 
 * Before you solve for the sum of the digits, you need to find 
 * the actual product. The product of the numbers from 1 to 100 is.
 * The datatype int can only store up to 2,147,483,647.
 * The datatype long can only store up to 9,223,372,036,854,775,807. 
 * What if the input was 100? The number of digits of the output 
 * would reach up to 158 digits, whereas long can only store up to 19. 
 * How would you do it?
 * 
 * For example,
 * Input:
 * 5
 * 1*2*3*4*5 = 120. 1+2+0 = 3.
 * Output:
 * 3
 * 
 * Input:
 * 6
 * 1*2*3*4*5*6 = 720. 7+2+0 = 9.
 * Output:
 * 9
 * 
 *  
 *
 */

public class SumOfDigitsProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scanner.nextInt();
		
		BigInteger fatorial = BigInteger.ONE;
		for(int i = num; i>0; i--){
			BigInteger temp = BigInteger.valueOf(i);
			fatorial = fatorial.multiply(temp);
		}
		//System.out.println(fatorial);
		
		String fatorialStr = fatorial.toString();
		long[] prod = new long[fatorialStr.length()];
		//BigInteger result = BigInteger.ZERO;
		for (int i = 0; i < prod.length; i++) {
			//System.out.println(fatorialStr.charAt(i));
			prod[i] = Long.parseLong(String.valueOf(fatorialStr.charAt(i)));
		}
		long result = 0;
		for (int i = 0; i < prod.length; i++) {
			result += prod[i]; 
		}
		System.out.println(result);
		
		
	}

}
