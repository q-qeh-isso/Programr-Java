package anglePairs;

import java.util.Scanner;

/**
 * Write a static method named anglePairs that accepts three angles (integers), 
 * measured in degrees, as parameters and returns whether or not there exists 
 * both complementary and supplementary angles amongst the three angles passed.
 * Two angles are complementary if their sum is exactly 90 degrees; two angles 
 * are supplementary if their sum is exactly 180 degrees.
 * Therefore, the method should return true if any two of the three angles
 * add up to 90 degrees and also any two of the three angles add up to 
 * 180 degrees; otherwise the method should return false. 
 * You may assume that each angle passed is non-negative.
 * Here are some example calls to the method and their resulting return values.
 * 
 * Enter any three angles:45
 * 135
 * 45
 * anglePairs(45 135 45) has complementary and supplementary angles:true
 * 
 * Enter any three angles:45
 * 135
 * 45
 * anglePairs(30 60 90) has complementary and supplementary angles:false
 * 
 *  
 *
 */

public class AnglePairs {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter any three angles:");
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();

		System.out.println("anglePairs("+a1+" "+a2+" "+a3+") has complementary and supplementary angles:"+anglePairs(a1,a2,a3));
		
	}

	private static boolean anglePairs(int a1, int a2, int a3) {
		
		if(a1+a2 == 90 && (a2+a3 == 180 || a1+a3 == 180) ) return true;
		if(a2+a3 == 90 && (a1+a3 == 180 || a1+a2 == 180)) return true;
		if(a1+a3 == 90 && (a2+a3 == 180 || a2+a1 == 180)) return true;
		
		return false;
	}

}
