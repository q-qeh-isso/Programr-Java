package quadrantOfAngle;

import java.util.Scanner;

/**
 * A very simple challenge.

Write a program which accepts an Integer which is an Angle and 
prints the Quadrant number in which it is.

For Ex.
1) if user input 30 then it should print 1.
2) if user input 197 then it should print 3.
 * 
 *  
 *
 */

public class Quadrants {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the string:"); 
		int angle = scanner.nextInt();
		
		int res = 0;
		if(angle >= 0 && angle <= 90) res = 1;
		else if(angle > 90 && angle <= 180) res = 2;
		else if(angle > 180 && angle <= 270) res = 3;
		else if(angle > 270 && angle <= 360) res = 4;
		
		System.out.println(res);
		
	}

}
