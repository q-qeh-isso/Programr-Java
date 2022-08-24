package BinaryDecimal;

import java.util.Scanner;

public class BinaryDecimal {

	public static void main(String[] args) {
		String num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextLine(); 
		
		
		int foo = Integer.parseInt(num, 2);
		System.out.println(foo);
	}

}
