package replacer;

import java.util.Scanner;

public class Replacer {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		String replaceChar="";
		String substituteChar="";
		System.out.print("Enter a string:");
		str=scanner.nextLine();
		System.out.print("Enter the character to be replaced:");
		replaceChar=scanner.nextLine();
		System.out.print("Enter the substitute character:");
		substituteChar=scanner.nextLine();
		
		
		String newStr = "";
		if(str.contains(replaceChar)){
			newStr = str.replace(replaceChar, substituteChar);
		} else {
			newStr = str;
		}
		System.out.println(newStr);
	}

}
