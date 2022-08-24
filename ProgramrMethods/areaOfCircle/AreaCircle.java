package areaOfCircle;

import java.util.Scanner;

/**
 * Write a java program to find the area of a circle.
 * 
 * For example:
 * Input:
 * Enter the radius: 2
 * Output:
 * Area of circle is: 12.56
 * 
 * Input:
 * Enter the radius: 10
 * Output:
 * Area of circle is: 314.0
 * 
 *  
 *
 */

public class AreaCircle {
	
	// Constant PI is defined at the class level     
	static final double PI = 3.14; 

	public static void main(String[] args) {		
		AreaCircle ac1 = new AreaCircle();
		ac1.getArea();
	}
	
	public void getArea() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int num = scanner.nextInt();
		
		double area = PI * (num * num);
		
		System.out.println("Area of circle is: " + area);
	}

}
