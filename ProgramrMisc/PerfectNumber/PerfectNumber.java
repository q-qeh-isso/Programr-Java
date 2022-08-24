package PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		n = sc.nextInt(); 

		int sum = 0;
		for(int i = 1; i<n; i++){
			if(n%i==0){
				sum += i;
			}				
		}
		if(sum == n){
			System.out.println("given number is a perfect number");
		} else {
			System.out.println("given number is not a perfect number");
		}
	}

}
