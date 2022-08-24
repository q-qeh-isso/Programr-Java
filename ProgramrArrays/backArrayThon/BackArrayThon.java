package backArrayThon;

import java.util.Scanner;

/**
 * Complete the code to print an array of integers in 
 * reverse order, in the following format.
 * 
 * Enter size of array:
 * 5
 * Enter 5 integers to fill the array:
 * 1 -3 4 7 2
 * 
 * Array printed backwards:
 * element [4] is:2
 * element [3] is:7
 * element [2] is:4
 * element [1] is:-3
 * element [0] is:1
 * 
 * @author Renan
 *
 */

public class BackArrayThon {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);   
		System.out.println("Enter size of array:");  
		int size = scanner.nextInt();
		int[] array = new int[size];  
		System.out.println("Enter 5 integers into the array:");  
		for(int i = 0; i<array.length; i++){  
			array[i] = scanner.nextInt();  
		}

		for (int i = array.length-1; i >= 0; i--) {
			System.out.println("element ["+i+"] is:"+array[i]);
		}

	}
	

}
