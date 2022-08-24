package printtriangle;

import java.util.Scanner;

public class PrintTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size=scanner.nextInt();
		System.out.println("Triangle is:");

		//add your nested for loop logic here
		//start
		for(int i = 1; i<=size; i++){
		    for(int l = 1; l<=i; l++){
		        System.out.print(i);
		    }
		    System.out.println();
		}
	}

}
