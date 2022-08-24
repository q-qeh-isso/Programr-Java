package nameAgeSalary;

import java.util.Scanner;

/**
 * Write a java program to ask the user for his/her name, age, 
 * and salary (double). Follow the input/output format.
 * Following conversation should be displayed as output on screen, 
 * where you will enter the values of name,age and salary.
 * 
 * Suppose your inputs are:
 * John
 * 22
 * 500
 * 
 * Expected Output:
 * Hello. What is your name? 
 * Hi John! How old are you? 
 * So you're 22 eh? That's not old at all! 
 * How much do you make John?
 * 
 * 500.0! I hope that's per hour and not per year! LOL!
 * 
 *  
 *
 */

public class NameAge {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		System.out.println("Hello. What is your name?");		
		String name = scanner.nextLine();
		System.out.println("Hi "+name+"! How old are you?");		
		int age = scanner.nextInt();
		System.out.println("So you're "+age+" eh? That's not old at all!");
		System.out.println("How much do you make "+name+"?");
		double salary = scanner.nextDouble();
		System.out.println(salary+"! I hope that's per hour and not per year! LOL!");

	}

}
