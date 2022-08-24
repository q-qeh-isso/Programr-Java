package SumOddNums;

import java.util.Scanner;

public class SumOddNums {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt(); 
		
		for (int i = 1; i <= num; i++) {
			if(i%2!= 0){
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

}
