package binary;

import java.util.Scanner;

/**
 * Write a program that prints out decimal number "n" in binary.
 * 
 * Enter the number to be converted into binary: 3
 * 11
 * 
 * Enter the number to be converted into binary: 420
 * 110100100
 * 
 *  
 *
 */

public class Binary {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter the number to be converted into binary:");		
		int num = scanner.nextInt();
		String res = "";
		
		if(num < 0){
			res = "0";
		} else {
			res = Integer.toBinaryString(num);
		}
		System.out.println(res);
	}

}
