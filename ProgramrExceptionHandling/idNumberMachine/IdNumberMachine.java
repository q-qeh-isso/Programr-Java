package idNumberMachine;

import java.util.Scanner;

public class IdNumberMachine {

	public static void main(String[] args) throws IdException {
		Scanner scanner=new Scanner(System.in); 
		String input;
		int num;

		System.out.println("Enter the ID number:");  
		input = scanner.next();
		num = Integer.parseInt(input);
		input = String.valueOf(num);
		if(input.length() > 9 && input.length() < 11){
			//System.out.println(input);
			System.out.println("correct");
			//throw new IdException("correct");
		} else {
			System.out.println("incorrect");
			//throw new IdException("incorrect");
		}

	}

}
