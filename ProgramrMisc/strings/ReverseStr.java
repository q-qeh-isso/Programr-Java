package strings;

import java.util.Scanner;

public class ReverseStr {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter a string:\n"); 	
		String s; 	 
		s=input.nextLine();	
		String rev="";	  
		//write your logic here 
		for(int i = 0; i<s.length(); i++){
		    rev += s.substring(s.length()-1-i, s.length()-i);
		}
		/*char[] sArr = s.toCharArray();
		for(int i = sArr.length-1; i>=0; i--){
			rev += sArr[i];
		}*/
		System.out.println("Reverse:\n"+ rev);
	}

}
