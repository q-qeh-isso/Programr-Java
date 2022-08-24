package printingCheckerboard;

import java.util.Scanner;

/**
 * Ask user for a number n. Print a checkerboard of size n. 
 * Example more specified in code. You would print a n x n square board 
 * of %'s with underscore in between. But every other row has alternating 
 * patterns. (Like a chessboard or checkerboard).
 * 
 * For Example:
 * Input: 
 * 3 
 * Output: 
 * %_%_%_ 
 * _%_%_% 
 * %_%_%_ 
 * 
 * Input: 
 * 5 
 * Output: 
 * %_%_%_%_%_ 
 * _%_%_%_%_% 
 * %_%_%_%_%_   
 * _%_%_%_%_% 
 * %_%_%_%_%_ 
 * 
 *  
 *
 */

public class PrintingCheckerboard {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a number");		
		int num = scanner.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(i%2 == 0) System.out.print("%_");
				else System.out.print("_%");
			}
			System.out.println();
		}
		
	}

}
