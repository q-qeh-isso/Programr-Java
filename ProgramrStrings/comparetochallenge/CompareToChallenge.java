package comparetochallenge;

import java.util.Scanner;

public class CompareToChallenge {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		String str2="";
		System.out.println("Enter the first string:");
		str=scanner.nextLine();
		System.out.println("Enter the second string:");
		str2=scanner.nextLine();
		
		int dif = str.compareTo(str2);
		
		if(dif != 0){
			System.out.println("Difference between string1 and string2: "+dif);
		} else {
			System.out.println("Both strings are equal.");
		}

	}

}
