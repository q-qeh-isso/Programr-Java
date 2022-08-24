package palindromString;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		String strn;  
		int flag=0;  
		System.out.println("Enter the string:");  
		Scanner sc = new Scanner(System.in);  
		strn=sc.nextLine();  
		System.out.println("Result string is:");  
		//write your logic here  
		String rev = "";
		boolean hasBlank = false;
		for(int i = strn.length()-1; i>=0; i--){
			if(strn.charAt(i) == ' '){
				hasBlank = true;
				continue;
			} else {
				rev += strn.charAt(i);
			}
		}

		//System.out.println("reverse version: " + rev);

		if (rev.equals(strn) || (rev.equals(strn) && hasBlank)){
			flag = 1;
		}

		//end  
		if(flag==1)  
			System.out.print("palindrome");  
		else   
			System.out.print("not a palindrome");

	}

}
