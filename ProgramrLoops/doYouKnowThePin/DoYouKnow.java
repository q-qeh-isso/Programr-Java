package doYouKnowThePin;

import java.util.Scanner;

/**
 * You have to design the code such that the user has only three tries to 
 * guess the correct pin of the account
 * 
 * Input: 
 * 22132 
 * 23412 
 * 12345 
 * Output:- 
 * INCORRECT PIN. TRY AGAIN. 
 * INCORRECT PIN. TRY AGAIN. 
 * PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT. 
 * 
 * Input: 
 * 88843 
 * 23434 
 * 23334 
 * Output: 
 * INCORRECT PIN. TRY AGAIN. 
 * INCORRECT PIN. TRY AGAIN. 
 * YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.
 * 
 *  
 *
 */

public class DoYouKnow {
	
	public static void main(String[] args) {
		
		int pin = 12345;
		int tries = 0;
		int n = 0;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter pin:");		
		for (int i = 0; i < 3; i++) {
			n = scanner.nextInt();
			tries++;
			if(n != pin) {
				if(tries >= 3){
					System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
				} else {
					System.out.println("INCORRECT PIN. TRY AGAIN.");
				}
			} else {
				System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
				break;
			}
		}
		
	}

}
