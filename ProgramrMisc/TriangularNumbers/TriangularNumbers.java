package TriangularNumbers;

import java.util.Scanner;

public class TriangularNumbers {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the height:");
		int size=scanner.nextInt();
		System.out.println("Numbers Triangle is:");

		//add your nested for loop logic here
		//start
		int temp = 1;
		for(int i = 1; i<=size; i++){
			//temp = i+1;
			for(int c = 0; c<i; c++){				
				System.out.print((temp++)+"_");
				//temp += c+1;
			}
			System.out.println();
		}
	}

}
