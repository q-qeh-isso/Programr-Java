package windChill;

import java.util.Scanner;

/**
 * Write a program to calculate Wind chill.
 * Accept temperature (in Fahrenheit) and the wind speed as input and calculate wind chil 
 * using given formula.
 * wind_chill = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * wind_speed ^ 0.16
 * 
 * For ex :
 * 1) Suppose temp 20 and wind speed is 7.
 * wind_chill = 35.74 + 0.6215*20 + (0.4275*20 - 35.75) * 7 ^ 0.16
 * so wind_chill = 11.034900625509998
 * 
 * 2) Suppose temp 70 and wind speed is 15.
 * wind_chill = 35.74 + 0.6215*70 + (0.4275*70 - 35.75) * 15 ^ 0.16
 * so wind_chill = 70.26098370128452
 * 
 *  
 *
 */

public class WindChill {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature(Fahrenheit):");
		double temp = scanner.nextDouble(); 
		System.out.println("Enter wind speed:");
		double wind_speed = scanner.nextDouble();
		
		double wind_chill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind_speed,0.16);
		
		System.out.println(wind_chill);
		
	}

}
