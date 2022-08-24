package sleep;

import java.util.Scanner;

/**
 * The parameter weekday is true if it is a weekday, and the parameter 
 * vacation is true if we are on vacation. We sleep in if it is not a 
 * weekday or we're on vacation. Display the message "You can sleep." 
 * if we sleep in else display "You cannot sleep."
 * 
 * Is it a weekday today?(true or false):false
 * Are you on a vacation?(true or false):false
 * You can sleep.
 * 
 * Is it a weekday today?(true or false):true
 * Are you on a vacation?(true or false):false
 * You cannot sleep.
 * 
 * @author Renan
 *
 */

public class Sleep {
	
	public static void main(String[] args) {
		
		boolean isWeekday = false;
		boolean onVacation = false;
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Is it a weekday today?(true or false):");		
		isWeekday = scanner.nextBoolean();
		System.out.print("Are you on a vacation?(true or false):");		
		onVacation = scanner.nextBoolean();
		
		if(onVacation) System.out.println("You can sleep.");
		else if(!onVacation && !isWeekday) System.out.println("You can sleep.");
		else System.out.println("You cannot sleep.");
		
	}

}
