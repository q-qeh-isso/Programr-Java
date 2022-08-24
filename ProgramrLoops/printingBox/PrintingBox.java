package printingBox;

import java.util.Scanner;

/**
 * Write a program that will print a box of #'s taking from user the 
 * height and width values.
 * 
 * Inputs:
 * Enter height:
 * 7
 * Enter width:
 * 5
 * Output:
 * #####
 * #####
 * #####
 * #####
 * #####
 * #####
 * #####
 * 
 * Inputs:
 * Enter height:
 * 5
 * Enter width:
 * 5
 * Output:
 * #####
 * #####
 * #####
 * #####
 * ##### 
 * 
 * 
 *  
 *
 */

public class PrintingBox {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter height:");		
		int height = scanner.nextInt();
		System.out.println("Enter width:");		
		int width = scanner.nextInt();
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}

}
