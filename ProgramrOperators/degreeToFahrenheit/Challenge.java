package degreeToFahrenheit;

import java.util.Scanner;

/**
 * Write Java program to allow the user to input temperature in 
 * Celsius and convert it into fahrenheit.
 * 
 * Enter a temperature in Celsius: 25 
 * The temperature in Fahrenheit is: 77
 * 
 * Enter a temperature in Celsius: 0 
 * The temperature in Fahrenheit is: 32.0
 * 
 * Enter a temperature in Celsius: -25 
 * The temperature in Fahrenheit is: -13.0
 * 
 *  
 *
 */

public class Challenge {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a temperature in Celsius: ");
		double celsius = scanner.nextDouble();
		double fahrenheit = 0;
		
		fahrenheit = ((celsius / 5) * 9) + 32;
		System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
		
	}

}
