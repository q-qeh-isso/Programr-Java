package devryAdmissionProgram;

import java.util.Scanner;

/**
 * Write a program that reads user input for a student's grade point 
 * average and SAT exam score, and uses these values to decide whether 
 * the student is admitted to the university.
 * A GPA below 1.8 will cause the student to be rejected; and a SAT score 
 * below 900 will also cause a rejection.
 * Otherwise the student is accepted.
 * If both the GPA and the SAT score are too low, print the message about 
 * the GPA being too low. Your output should match the following:
 * 
 * Devry University Admission Program
 * Enter your GPA out of 5:1.9
 * Enter your SAT Score:900
 * You were accepted
 * 
 * Devry University Admission Program
 * Enter your GPA out of 5:1.2
 * Enter your SAT Score:300
 * Your GPA is too low
 * 
 * Devry University Admission Program
 * Enter your GPA out of 5:3.5
 * Enter your SAT Score:600
 * Your SAT score is too low
 * 
 * @author Renan
 *
 */

public class DevryAdmission {
	
	public static void main(String[] args) {
		
		double gpa = 0;
		int sat = 0;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Devry University Admission Program");
		
		System.out.print("Enter your GPA out of 5:");		
		gpa = scanner.nextDouble();
		System.out.print("Enter your SAT Score:");		
		sat = scanner.nextInt();
		
		if(gpa < 1.8) System.out.println("Your GPA is too low");
		else if(sat < 900) System.out.println("Your SAT score is too low");
		else System.out.println("You were accepted");
		
	}

}
