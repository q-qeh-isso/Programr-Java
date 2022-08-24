package locateLargest;

import java.util.Scanner;

/**
 * Write a code to take ten integers from the user,store them 
 * in an array, find the largest one and display it along with 
 * its position.
 * 
 * Input:
 * Enter the array values:
 * 76 90 78 65 45 69 32 9 41 88
 * Output: 
 * Array:76 90 78 65 45 69 32 9 41 88
 * The Largest Element is:90
 * It's at location:1
 * 
 * Input:
 * Enter the array values:76
 * 89 87 54 56 32 12 9 55 33
 * Output:
 * Array:76 89 87 54 56 32 12 9 55 33
 * The Largest Element is:89
 * It's at location:1
 * 
 * @author Renan
 *
 */

public class LocateLargest {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);   
		int[] array = new int[5];  
		System.out.println("Enter 5 integers into the array:");  
		for(int i = 0; i<array.length; i++){  
			array[i] = scanner.nextInt();  
		}
		
		int largest = array[0];
		int idx = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > largest) {
				largest = array[i];
				idx = i;
			}
			
		}
		System.out.println("Array:");
		for(int n : array) System.out.print(n+" ");		
		System.out.println("\nThe Largest Element is:"+largest);
		System.out.println("It's at location:"+idx);
		
	}

}
