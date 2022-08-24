package PrintTriangle2;

import java.util.Scanner;

public class PrintTriangle2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size=scanner.nextInt();
		System.out.println("Traingle is:");
		print_(size);

	}
	
	public static void print_(int n){

		for(int i = 1; i<=n; i++){
		    for(int l=0; l<i; l++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		  
	}

}
