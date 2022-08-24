package countones;

import java.util.Scanner;

/**
 * Write a program which accepts two integers as a minimum and 
 * maximum limit and calculates total of how many 1s were their 
 * within the limit.
 * 
 * For ex:
 * 1) if user input 1 11 then it should print 4.
 * 2) if user input 11 111 then it should print 34.
 * 
 *  
 *
 */

public class CountOnes3 {
	
	public static void main(String[] args) {

		int numMin, numMax; // contains user input statement
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter min value:");
		numMin = scan.nextInt();
		System.out.println("Enter max value:");
		numMax = scan.nextInt();

		String tempStr = "";
		int count = 0;
		for (int i = numMin; i <= numMax; i++) {
			tempStr = String.valueOf(i);
			for (int j = 0; j < tempStr.length(); j++) {
				if(tempStr.charAt(j) == '1') count++;
			}
		}

		System.out.println(count);
	}

}
