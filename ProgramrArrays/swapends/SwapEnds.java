package swapends;

import java.util.Scanner;

/**
 * Make an array that can hold integers. Swap the first element and 
 * the last element in the array. Print the modified array. 
 * The array length will be at least 1.
 * 
 * Enter size of the array:
 * 4
 * Enter integers into the array:
 * 1 2 3 4
 * 
 * Printing the array:
 * 4 2 3 1
 * 
 * @author Renan
 *
 */

public class SwapEnds {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);   
		System.out.println("Enter size of the array:");  
		int size = scanner.nextInt();
		int[] a = new int[size];  
		System.out.println("Enter integers into the array:");  
		for(int i = 0; i<a.length; i++){  
			a[i] = scanner.nextInt();  
		}
		if(a.length > 1){
			int temp = a[0];
			a[0] = a[a.length-1];
			a[a.length-1] = temp;
		}

		
		for(int n : a) System.out.println(n);
	}

}
