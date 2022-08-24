package stringsplosion;

import java.util.Scanner;

public class StringSplosion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.println("Enter a string:");
		str=scanner.nextLine();
		
		String bang = "";
		for (int i = 0; i < str.length(); i++) {
			bang += str.substring(0, i+1);
		}
		System.out.println(bang);

	}

}
