package numberoccurence;

import java.util.Scanner;

public class Occurance {
	
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = br.nextInt();

		System.out.println("Enter number to search:");
		int n = br.nextInt();

		System.out.println("Number of occurence of given number is:"); 

		String numberStr = String.valueOf(number);
		char c;
		int occurance = 0;
		for(int i = 0; i<numberStr.length(); i++){
		    c = numberStr.charAt(i);
		    if(Character.getNumericValue(c) == n){
		        occurance++;
		    }
		}
		
		System.out.println(occurance); 
	}

}
