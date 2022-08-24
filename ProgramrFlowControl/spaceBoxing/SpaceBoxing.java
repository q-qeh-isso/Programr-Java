package spaceBoxing;

import java.util.Scanner;

/**
 * Brandon Foster is an interplanetary space Boxer, who  currently holds 
 * the championship belts for various different categories on many different 
 * planets. However, it is often difficult for him to recall what his 
 * "target weight" needs to be on earth in order to make the weight 
 * class on other planets. Make a Java program to help him keep track of this.
 * 
 * It should ask him his weight on earth, and to enter a number for the planet 
 * he wants to fight on. It should then compute his weight on the destination 
 * planet based on the table below:
 * #	Planet	Relative gravity
 * 1 	Venus 		0.78
 * 2 	Mars 		0.39
 * 3 	Jupiter 	2.65
 * 4 	Saturn 		1.17
 * 5 	Uranus 		1.05
 * 6 	Neptune 	1.23
 * 
 * Note: You are to use following formula when calculating the weight 
 * on the given planet (weight on earth * relative gravity)
 * 
 * Example
 * Input: 
 * Please enter your current earth weight : 128 
 * I have information for the following planets : 
 * 1. Venus 2. Mars 3. Jupiter  4. Saturn 5. Uranus 6. 
 * Neptune, which planet are you visiting : 1 
 * Output: 
 * Your weight in pounds : 99.84 
 * 
 * Input: 
 * Please enter your current earth weight : 128 
 * I have information for the following planets : 
 * 1. Venus 2. Mars 3. Jupiter  4. Saturn 5. Uranus 6. 
 * Neptune, which planet are you visiting : 2 
 * Output: 
 * Your weight in pounds : 49.92
 * 
 * @author Renan
 *
 */

public class SpaceBoxing {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Please enter your current earth weight : ");		
		int weight = scanner.nextInt();
		
		System.out.println("I have information for the following planets :");
		System.out.println("1. Venus 2. Mars 3. Jupiter  4. Saturn 5. Uranus 6. Neptune, which planet are you visiting : ");
		int planet = scanner.nextInt();
		
		double result = 0;
		switch(planet){
		case 1: //Venus
			result = weight * 0.78;
			break;
		case 2: //Mars
			result = weight * 0.39;
			break;
		case 3: //Jupiter
			result = weight * 2.65;
			break;
		case 4: //Saturn
			result = weight * 1.17;
			break;
		case 5: //Uranus
			result = weight * 1.05;
			break;
		case 6: //Neptune
			result = weight * 1.23;
			break;
		default:
			System.out.println("Invalid choice!");
		}
		
		System.out.println("Your weight in pounds : " + result);
	}

}
