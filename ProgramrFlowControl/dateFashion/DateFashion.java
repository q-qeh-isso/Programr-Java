package dateFashion;

import java.util.Scanner;

/**
 * You and your date are trying to get a table at a restaurant. 
 * The parameter "you" is the stylishness of your clothes, in the range 0..10, 
 * and "date" is the stylishness of your date's clothes. 
 * The result getting the table is encoded as an int value 
 * with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, 
 * then the result is 2 (yes). With the exception that if either of you 
 * has style of 2 or less, then the result is 0 (no). Otherwise the 
 * result is 1 (maybe). 
 * 
 * Rate your style on scale on 10:5
 * Rate your date's style on scale on 10:10
 * Will you get the table?(0=no/1=maybe/2=yes):2
 * 
 * Rate your style on scale on 10:5
 * Rate your date's style on scale on 10:2
 * Will you get the table?(0=no/1=maybe/2=yes):0
 * 
 * @author Renan
 *
 */

public class DateFashion {

	public static void main(String[] args) {

		int you = 0;
		int date = 0;
		Scanner scanner = new Scanner(System.in); 

		System.out.print("Rate your style on scale on 10:");		
		you = scanner.nextInt();
		System.out.print("Rate your date's style on scale on 10:");		
		date = scanner.nextInt();

		int success = datefashion(you, date);
		System.out.println("Will you get the table?(0=no/1=maybe/2=yes):"+success);

	}

	public static int datefashion(int you,int date){
		///{ write you code here
		if(you <= 2 || date <= 2) return 0;
		else if(you >= 8 || date >= 8) return 2;
		
		return 1;
		///}
	}

}
