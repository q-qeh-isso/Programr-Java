package evenlySpaced;

import java.util.Scanner;

/**
 * Given three ints, a b c, one of them is small, one is medium and 
 * one is large. Return true if the three values are evenly spaced, 
 * so the difference between small and medium is the same as the 
 * difference between medium and large. 
 * 
 * Enter 3 values:
 * 2
 * 4
 * 6
 * EvenlySpaced?:true
 * 
 * Enter 3 values:
 * 3
 * 5
 * 9
 * EvenlySpaced?:false
 * 
 * @author Renan
 *
 */

public class EvenlySpaced {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		boolean res = false;
		Scanner scanner = new Scanner(System.in); 

		System.out.print("Enter 3 values?");		
		a = scanner.nextInt();	
		b = scanner.nextInt();
		c = scanner.nextInt();
		res = evenlySpaced(a,b,c);
		
		System.out.println("EvenlySpaced?:"+res);


	}
	public static boolean evenlySpaced(int a, int b, int c) {
		///{write you code here
		int min = Math.min(a, b);
		min = Math.min(min, c);
		int max = Math.max(a, b);
		max = Math.max(max, c);
		int mid = 0;

		if( (max == a && min == b) || (max == b && min == a) ) mid = c;
		else if( (max == b && min == c) || (max == c && min == b) ) mid = a;
		else if( (max == a && min == c) || (max == c && min == a) ) mid = b;

		if(mid-min == max-mid) return true;
		
		return false;
		///}
	}

}
