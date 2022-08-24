package addString;

import java.util.Scanner;

public class AddString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in, "UTF-8"); 
		String total = ""; 
		
		//ask for three strings here
		System.out.println("First string:");
		total += scanner.nextLine();
		System.out.println("Second string:");
		total += scanner.nextLine();
		System.out.println("Third string:");
		total += scanner.nextLine();

		//print the result 
		System.out.println(total);  

	}

}
