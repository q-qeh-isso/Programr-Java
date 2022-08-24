package ExpoenteLong;

import java.util.Scanner;

public class TesteLong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		//int num = scan.nextInt();
		long num = 2;
		long total = 0;
		long temp = num;
		
		for (int i = 1; i != 63; i++) {
			num *= temp;
		}
		num -= 1;
		
		System.out.println(num);
		//System.out.println((Math.pow(2,63))-1);
		//System.out.println(Math.pow(2,63));
	}	

}
