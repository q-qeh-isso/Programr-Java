package octalToDecimal;

import java.util.Scanner;

/**
 * Write a program called Oct2Dec to convert an input octal string 
 * into its equivalent decimal number.
 * 
 * Enter an octal number:21
 * Decimal Value:17
 * 
 * Enter an octal number:5
 * Decimal Value:5
 * 
 * @author Renan
 *
 */

public class OctalDecimal {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter an octal number:");		
		String num1 = scanner.nextLine();
		
		try{
			int res = Integer.parseInt(num1, 8);
			System.out.println("Decimal Value:" + res);
		} catch (Exception e){
			System.out.println("Please enter a valid octal number");
		}
	}

}
