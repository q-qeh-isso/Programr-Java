package AbundantNumbers;

import java.util.Scanner;

public class AbundantNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size:");
		int num=scanner.nextInt();
		int temp = 0;
		int sumDivisors = 0;	
		int[] abundants = new int[20];
		int elems = 0;
		/*for (int i = 2; i<num; i++) {
			//sumDivisors = 0;
			for (int c = 1; c<=i; c++) {
				if(i%c==0){
					sumDivisors += c;
				}
			}
			if(sumDivisors > i){
				abundants[temp] = i;
				temp++;
			}
		}*/
		/*for(int i = 1; i<=num; i++){
			if(num%i==0){
				sumDivisors += i;
			}
			
		}
		if(sumDivisors > num){
			System.out.println(sumDivisors);
		}*/
		
		for (int i = 0; i < abundants.length; i++) {
			System.out.print(abundants[i] + " ");
		}

	}

}
