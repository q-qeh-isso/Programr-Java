package sumnumberdifferent;

import java.util.Scanner;

public class SumNumberDIfferent {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.println("enter characters and numbers: ");
		str=scanner.nextLine();
		
		System.out.println(sumDigits(str));

	}
	
	public static int sumDigits(String str){
		int sum = 0;

		for (int i = 0; i <str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				sum += Character.getNumericValue(ch);
			}
		}

		return sum;
	}

}
