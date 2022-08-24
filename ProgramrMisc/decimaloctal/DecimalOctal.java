package decimaloctal;

import java.util.Scanner;

public class DecimalOctal {

	public static void main(String[] args) {
		/*int num,rem,oct;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    num = sc.nextInt();
		
	    String str = "";
		
		char dig[]={'0','1','2','3','4','5','6','7'};
		
		while(num>0){
		    rem = num % 8;
		    str = dig[rem] + str;
		    num = num / 8;
		}

		 System.out.println("Octal number is:");
		 System.out.println(str);*/
		
		int num = 10;
		//num em tipo int
		//int oct = Integer.parseInt(Integer.toOctalString(num));
		//num em tipo string
		String oct = Integer.toOctalString(num);
		System.out.println(oct);
	}

}
