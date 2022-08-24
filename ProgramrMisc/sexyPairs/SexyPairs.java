package sexyPairs;

import java.util.Scanner;

public class SexyPairs {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input:");
		int input = scanner.nextInt();
		
		int count1 = 0;
		int count2 = 0;
		int p1 = 0;
		int p2 = 0;
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				if(j%2 == 0) {
					count1++;
				}
			}
			if(count1 == 2) p1 = i;
			for (int j = 1; j <= i+6; j++) {
				if(j%2 == 0) {
					count2++;
				}
			}
			if(count2 == 2) p2 = i+6;
			if(count1 == 2 && count2 == 2) System.out.println("("+p1+","+p2+")"); 			
		}
		
	}

}
