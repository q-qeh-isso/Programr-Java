package isitequalornot;

import java.util.Scanner;

public class IsItEqualOrNot {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.print("Enter a string:");
		str=scanner.nextLine();
		
		System.out.println(equalIsNot(str));
		

	}
	public static boolean equalIsNot(String str){
		int is = 0;
		int not = 0;
		String argStr = str;
		String newStr = "";
		for (int i = 0; i < argStr.length(); i++) {
			if(argStr.contains("is")){
				is++;
				newStr = argStr.replaceFirst("is", "");
				argStr = newStr;
			}
			if(argStr.contains("not")){
				not++;
				newStr = argStr.replaceFirst("not", "");
				argStr = newStr;
			}
		}
		if(is != not){
			return false;
		}
		return true;
	}

}
