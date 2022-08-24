package areaOfTriangle;

/**
 * In this exercise, complete the function that "returns a value". 
 * When you call this function, it should calculate the area of the 
 * triangle using Heron's formula and return it.
 * 
 * Heron's formula:
 * Area = (s*(s-a)*(s-b)*(s-c))0.5 where s = (a+b+c)/2
 * 
 *  
 *
 */

public class Area {
	
	public static void main(String[] args) {
		
		double a;
		
		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3,3,3 has an area of:" + a);

		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3,4,5 has an area of:" + a);
 
		a = triangleArea(9, 9, 9);
		System.out.println("A triangle with sides 9,9,9 has an area of:" + a );
		
	}
	
	public static double triangleArea( int a, int b, int c ){
		double s = (a+b+c)/2.0d;
		double res = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return res;
	}

}
