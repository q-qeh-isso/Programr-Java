package EvenNumbersOnly;

import java.util.Scanner;

public class Challenge {
	
	public static void main(String args[]) 
	{   
		Scanner scanner=new Scanner(System.in);   
		int a[]; 
		a = new int[5];  
		System.out.println("Enter elements of array :");  
		for(int i = 0; i<5; i++){  
			a[i] = scanner.nextInt();  
		}
		///{write you code here
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2 == 0) {
				System.out.println(a[i]);
				count++;
			}
				
		}
		if(count == 0) System.out.println("Even number not found in array");
		///}
	}

}
