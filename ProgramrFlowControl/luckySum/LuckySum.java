package luckySum;

import java.util.Scanner;

/**
 * Given 3 int values, a b c, return their sum. However, if one of the 
 * values is 13 then it does not count towards the sum and values to 
 * its right do not count. So for example, if b is 13, 
 * then both b and c do not count. 
 * 
 * Enter 3 values:
 * 1
 * 2
 * 3
 * Lucky sum:6
 * 
 * Enter 3 values:
 * 13
 * 2
 * 12
 * Lucky sum:0
 * 
 * @author Renan
 *
 */

public class LuckySum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a,b,c,s;
		System.out.println("Enter 3 values:");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		s=luckySum(a,b,c);
		System.out.println("Lucky sum:"+s);
		/*int[] num = new int[3];
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter 3 numbers:");	
		for (int i = 0; i < 3; i++) {
			num[i] = scanner.nextInt();
		}

		int res = 0;
		for (int i = 0; i < num.length; i++) {
			if(num[i] == 13) break;
			res += num[i];
		}

		System.out.println("Lucky sum:"+res);*/		

	}
	public static int luckySum(int a,int b,int c){
	    ///{ write you code here
		if(a == 13) return 0;
		if(b == 13) return a;
		if(c == 13) return a+b;
		
		return a+b+c;
	    ///}
	}

}
