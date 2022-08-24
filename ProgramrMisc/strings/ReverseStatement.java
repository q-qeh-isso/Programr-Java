package strings;

import java.util.Scanner;

public class ReverseStatement {

	public static void main(String[] args) {
		String strarr[]; // array which will hold splitted strings of the
							// statement
		String st; // contains user input statement
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Statement:");
		st = scan.nextLine();
		System.out.println("The reverse is:");
		
		strarr = st.split(" ");
		String reverseStr = "";
		for(int i = strarr.length-1; i>=0; i--){
			reverseStr += strarr[i] + " ";
		}
		
		System.out.println(reverseStr);
	}

}
