package hex2Dec;

import java.util.Scanner;

/**
 * Write a program called Hex2Dec to convert an input hexadecimal 
 * string into its equivalent decimal number.
 * 
 * Enter a hexadecimal number:1a
 * 26
 * 
 * Enter a hexadecimal number:5
 * 5
 * 
 * @author Renan
 *
 */

public class HexDec {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter an octal number:");		
		String num1 = scanner.nextLine();
		
		try{
			int res = Integer.parseInt(num1, 16);
			System.out.println(res);
		} catch (Exception e){
			System.out.println("Please enter a valid octal number");
		}
		
	}

}
