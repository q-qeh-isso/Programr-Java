package denominations;

import java.util.Scanner;

/**
 * A bank intends to design a program to display the denomination 
 * of an input amount. The available denomination with the bank are 
 * of rupees 1000 , 500 , 100 , 50 , 20 , 10 , 5 , 2 , and 1.
 * 
 * Design a program to accept the amount from the user and display 
 * the break-up in descending order of denomination. (i.e. preference 
 * should be given to the highest denomination available) along with 
 * the total number of notes. [Note: Only the denomination used, 
 * should be displayed].
 * 
 * Enter the amount :502
 * No of Rs 500 notes are 1
 * No of Rs 2 notes are 1
 * 
 * Enter the amount :1002023
 * No of Rs 1000 notes are 1002
 * No of Rs 20 notes are 1
 * No of Rs 2 notes are 1
 * No of Rs 1 notes are 1
 * 
 * @author Renan
 *
 */

public class Denominations {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter the amount:");		
		int num = scanner.nextInt();
		
		int count1000 = 0;
		int count500 = 0;
		int count100 = 0;
		int count50 = 0;
		int count20 = 0;
		int count10 = 0;
		int count5 = 0;
		int count2 = 0;
		int count1 = 0;
		
		if(num/1000 != 0) count1000 = num/1000;
			num -= count1000 * 1000;
		if(num/500 != 0) count500 = num/500;
			num -= count500 * 500;
		if(num/100 != 0) count100 = num/100;
			num -= count100 * 100;
		if(num/50 != 0) count50 = num/50;
			num -= count50 * 50;
		if(num/20 != 0) count20 = num/20;
			num -= count20 * 20;
		if(num/10 != 0) count10 = num/10;
			num -= count10 * 10;
		if(num/5 != 0) count5 = num/5;
			num -= count5 * 5;
		if(num/2 != 0) count2 = num/2;
			num -= count2 * 2;
		if(num/1 != 0) count1 = num/1;
			num -= count1 * 1;
		
		if(count1000 != 0) System.out.println("No of Rs 1000 notes are "+count1000);
		if(count500 != 0) System.out.println("No of Rs 500 notes are "+count500);
		if(count100 != 0) System.out.println("No of Rs 100 notes are "+count100);
		if(count50 != 0) System.out.println("No of Rs 50 notes are "+count50);
		if(count20 != 0) System.out.println("No of Rs 20 notes are "+count20);
		if(count10 != 0) System.out.println("No of Rs 10 notes are "+count10);
		if(count5 != 0) System.out.println("No of Rs 5 notes are "+count5);
		if(count2 != 0) System.out.println("No of Rs 2 notes are "+count2);
		if(count1 != 0) System.out.println("No of Rs 1 notes are "+count1);
		
		
	}

}
