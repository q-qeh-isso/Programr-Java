package amicablenumbers;

import java.util.Scanner;

public class AmicableNumbers {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		int sumDivisors = 0;
		int sumAmicable = 0;
		for(int i = 1; i < num; i++){
			if(num%i == 0){
				sumDivisors += i; 
			}
		}
		for(int i = 1; i < sumDivisors; i++){
			if(sumDivisors%i == 0){
				sumAmicable += i; 
			}
		}
		
		System.out.println(sumAmicable);
		
		
		
	}

}
