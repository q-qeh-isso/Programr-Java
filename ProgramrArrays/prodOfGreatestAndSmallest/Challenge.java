package prodOfGreatestAndSmallest;

import java.util.Scanner;

/**
 * User input integer values in 10 cell array.
 * He wants to find product of greatest and smallest number present in array.
 * Example:
 * 
 * Input:
 * 3
 * 2
 * 4
 * 5
 * 6
 * 8
 * 9
 * 7
 * -1
 * 10
 * Output:
 * -10
 * 
 * @author Renan
 *
 */

public class Challenge {

	public static void main(String args[]) 
	{   
		Scanner scanner=new Scanner(System.in);   
		int sum=0;   
		int a[]; 
		int max = 0,min=0; 
		a = new int[10];  
		System.out.println("Enter elements of array :");  
		for(int i=0;i<10;i++){  
			a[i]=scanner.nextInt();  
			if(i==9) break;  
		}
		///{write you code here   
		max = a[0];
		min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) max = a[i];
			else if(a[i] < min) min = a[i];
		}
		///}   

		System.out.println("Result is :"+(max*min)); 
	}


}
