package tripleup;

import java.util.Scanner;

/**
 * Make a Java program that accepts five integers from 
 * the user as input. Program should print "true" if the 
 * array contains, somewhere, three increasing adjacent 
 * numbers like ...4,5,6 otherwise print "false".
 * 
 * Entering values into the array:
 * 1 4 5 6 2
 * true
 * 
 * Entering values into the array:
 * 1 2 4 6 8
 * false
 * 
 * @author Renan
 *
 */

public class TripleUp {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);   
		int[] array = new int[5];  
		System.out.println("Enter 5 integers into the array:");  
		for(int i = 0; i<array.length; i++){  
			array[i] = scanner.nextInt();  
		}
		
		boolean flag = false;
		for (int i = 0; i < array.length-2; i++) {
			if(array[i+1] == array[i]+1 && array[i+2] == array[i+1]+1){
				flag = true;
				break;
			}
		}
		
		System.out.println(flag);

	}

}
