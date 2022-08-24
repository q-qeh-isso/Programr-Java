package countClumps;

import java.util.Scanner;

/**
 * Say that a "clump" in an array is a series of 2 or more 
 * adjacent elements of the same value. 
 * Return the number of clumps in the given array. 
 * You are to use the following function:
 * public static int countClumps(int[] nums)
 * 
 * Enter values into the array:
 * 1 2 2 3 4
 * Clumps:1
 * 
 * Enter values into the array:
 * 1 1 1 1 1
 * Clumps:1
 * 
 * @author Renan
 *
 */

public class CountClumps {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);   
		int[] array = new int[5];  
		System.out.println("Enter 5 integers into the array:");  
		for(int i = 0; i<array.length; i++){  
			array[i] = scanner.nextInt();  
		}
		
		int count = 0;
		for (int i = 0; i < array.length-1; i++) {
			if(array[i] == array[i+1]){
				count++;
				for (int j = i+1; j < array.length-1; j++) {
					if(array[j] != array[j+1]) {
						break;
					} else {
						i++;
					}
				}				
			}
		}
		
		System.out.println(count);
		
	}

}
