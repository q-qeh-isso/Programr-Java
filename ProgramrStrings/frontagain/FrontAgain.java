package frontagain;

import java.util.Scanner;

public class FrontAgain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.println("Enter a string of ur choice:");
		str=scanner.nextLine();
		
		boolean flag = false;
		if(str.length() > 1){
			if(str.substring(0,2).equals(str.substring(str.length()-2))){
				flag = true;
			}			
		} else {
			flag = true;
		}
		System.out.println(flag);

	}
	
}
