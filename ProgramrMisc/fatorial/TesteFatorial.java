package fatorial;

import java.util.Scanner;

public class TesteFatorial {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		int fatorial = 1;
		for(int i = num; i>0; i--){
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		
	}

}
