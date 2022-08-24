package redLotteryTicket;

import java.util.Scanner;

/**
 * You have a red lottery ticket showing ints a, b, and c, each of 
 * which is 0, 1, or 2. If they are all the value 2, the result is 10. 
 * Otherwise if they are all the same, the result is 5. Otherwise so 
 * long as both b and c are different from a, the result is 1. 
 * Otherwise the result is 0. 
 * 
 * Enter 3 values from 0 to 2:
 * 1
 * 0
 * 1
 * Value of your ticket:0
 * 
 * Enter 3 values from 0 to 2:
 * 1
 * 2
 * 0
 * Value of your ticket:1
 * 
 * @author Renan
 *
 */

public class ResLottery {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int a,b,c,s;
		System.out.println("Enter 3 values from 0 to 2:");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		
		if(a == 2 && b == 2 && c == 2) s = 10;
		else if(a == b && b == c) s = 5;
		else if(b != a && c != a) s = 1;
		else s = 0;
		
		System.out.println("Value of your ticket:"+s);
		
	}


}
