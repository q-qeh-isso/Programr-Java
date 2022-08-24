package moreUserInputData;

import java.util.Scanner;

/**
 * NAO COMPILA NO PROGRAMMR
 * 
 * Ask the user for several pieces of information, and display them 
 * on the screen afterward as a summary.
 * 
 * first name
 * last name
 * grade (classification)
 * student id number
 * login name
 * GPA (0.00 to 4.00)
 * 
 * For example:
 * Input:
 * First name: Helena 
 * Last name: Bonham-Carter 
 * Grade (9-12): 12 
 * Student ID: 453916 
 * Login: bonham_453916 
 * GPA (0.00-4.00): 3.73 
 * 
 * Output: 
 * Login:bonham_453916  
 * ID:453916  
 * Name:Bonham-Carter; Helena  
 * GPA:3.73  
 * Grade:12  
 * 
 *  
 *
 */

public class MoreData {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("First name: ");		
		String fn = scanner.next();
		System.out.print("Last name: ");
		String ln = scanner.next();
		System.out.print("Grade (9-12): ");
		int grade = scanner.nextInt();
		while(grade < 9 || grade > 12) {
			System.out.println("Invalid Grade");
			System.out.println("Grade (9-12): ");
		    grade = scanner.nextInt();
		}
		System.out.print("Student ID: ");
		int id = scanner.nextInt();
		System.out.print("Login: ");
		String login = scanner.next();
		System.out.print("GPA (0.00-4.00): ");
		double gpa = scanner.nextDouble();
		while (gpa < 0 || gpa > 4) {
			System.out.println("Invalid GPA");
			System.out.println("GPA (0.0-4.0): ");
			gpa = scanner.nextDouble();
		}
		
		System.out.println("Login:"+login);
		System.out.println("ID:"+id);
		System.out.println("Name:"+ln+"; "+fn);
		System.out.println("GPA:"+gpa);
		System.out.println("Grade:"+grade);
	}

}
