package quadrantPoint;

import java.util.Scanner;

/**
 * Create a class called Point that includes two instance 
 * variables - x(type int) and y(type int). 
 * Provide a constructor that initializes the two instance variables. 
 * Provide the following function in the Point class:
 * 
 * public int quadrant()
 * 
 * Following function should return which quadrant of x/y this point 
 * object falls in. 
 * Quadrant 1 contains all points whose x and y values are both positive. 
 * Quadrant 2 contains all points with negative x but positive y. 
 * Quadrant 3 contains all points with negative x and y values. 
 * Quadrant 4 contains all points with positive x but negative y. 
 * If the point lies directly on x and/or y axis return 0.
 * 
 * Write test application named Challenge that demonstrates 
 * class Point's capabilities. Create a Point object and 
 * display object's quadrant.
 * 
 * Examples:
 * Enter x coordinate:
 * 1
 * Enter y coordinate:
 * 2
 * Quadrant 1
 * 
 * Enter x coordinate:
 * -1
 * Enter y coordinate:
 * 2
 * Quadrant 2
 * 
 *  
 *
 */

public class QuadrantPoint {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter X:");
		int x = scanner.nextInt();
		System.out.println("Enter Y:");
		int y = scanner.nextInt();
		
		Point pt = new Point(x,y);
		
		System.out.println("Quadrant " + pt.quadrant());
		
	}

}
