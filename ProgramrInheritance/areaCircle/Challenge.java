package areaCircle;

import java.util.Scanner;

/**
 * Write a java program to print the area of circle using inheritance
 * 
 * Example:
 * Input:
 * Enter the radius:5
 * Output:
 * Radius 5.0 and Area is 78.5
 * 
 *  
 *
 */

public class Challenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   

		System.out.print("Enter the radius:");   
		double radius = scanner.nextDouble();   
		new Challenge().method(radius);   
	}   

	public void method(double radius) {   

		Circle myCircle = new Circle();   
		myCircle.setradius(radius);   
		System.out.print(myCircle.getDisplayText());   
	}

}