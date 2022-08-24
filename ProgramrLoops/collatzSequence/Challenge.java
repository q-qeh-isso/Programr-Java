package collatzSequence;

import java.util.Scanner;

/**
 * Take any natural number n.
 * If n is even, divide it by 2 to get n / 2.
 * If n is odd, multiply it by 3 and add 1 to get 3n + 1.
 * Repeat the process indefinitely.
 * 
 * In 1937, Lothar Collatz proposed that no matter what number you begin with, 
 * the sequence eventually reaches 1. This is widely believed to be true, 
 * but has never been formally proved.
 * Write a program that inputs a number from the user, and then displays 
 * the Collatz Sequence starting from that number. Stop when you reach 1. 
 * Count the number of steps.
 * 
 * For example:
 * Input 
 * 5 
 * Output 
 * 5 16 8 4 2 1 
 * Terminated after 5 steps. 
 * 
 * Input  
 * 1 
 * Output 
 * 1 4 2 1 
 * Terminated after 3 steps
 * 
 *  
 *
 */

public class Challenge {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt(); 
		int count = 0;
		String result = "";
		boolean isNegative = false;
        while(true){
        	if(num < 0){
                isNegative = true;
            }
            if(Math.abs(num) % 2 == 0){
                result += num + " ";
                count++;
                if(isNegative){
                    num = -(Math.abs(num) / 2);
                } else {
                    num = Math.abs(num) / 2;
                }
            } else {
                result += num + " ";
                count++;
                if(isNegative){
                    num = -((3 * Math.abs(num)) + 1);
                } else {
                    num = (3 * Math.abs(num)) + 1;
                }
            }
            if(Math.abs(num) == 1){
                result += num;
                break;
            }
        }
		System.out.print(result+"\nTerminated after "+count+" steps.");
	}

}
