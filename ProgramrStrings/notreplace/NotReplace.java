package notreplace;

import java.util.Scanner;

public class NotReplace {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.print("Enter a string:");
		str=scanner.nextLine();
		
		//int ind = str.indexOf("is");
		//System.out.println(ind);
		
		String newStr = "";
		if(str.contains("is")){
			int ind = str.indexOf("is");
			//System.out.println(ind);
			for (int i = 0; i < str.length(); i++) {
				if(ind > 0 && ind < str.length()-2 ){
					
					if(str.substring(ind-1, ind).equals(" ") &&
							str.substring(ind+2, ind+3).equals(" ") ){
						newStr = str.replace(str.substring(ind, ind+2), "is not");
						str = newStr;
					}

				} else {
					
					if(str.substring(ind+2, ind+3).equals(" ") ){
						newStr = str.replace(str.substring(ind, ind+2), "is not");
						str = newStr;
					}
					if(str.substring(str.length()-3, str.length()-2).equals(" ") ){
						newStr = str.replace(str.substring(ind, ind+1), "is not");
						str = newStr;
					}
					
				}
			}		
			
		} else {
			newStr = str;
		}
		System.out.println(newStr);
		/*if(str.contains("is")){
			int ind = str.indexOf("is");
			if(ind != 0 && ind != str.length()-2){
				if(str.substring(ind-1, ind).equals(" ") || 
					str.substring(ind+2, ind+3).equals(" ") ){
					newStr = str.replace(str.substring(ind, ind+1), "is not");
				}
			} else {
				if(str.substring(ind+2, ind+3).equals(" ") ){
					newStr = str.replace(str.substring(ind, ind+1), "is not");
				}
				if(str.substring(str.length()-3).equals(" ") ){
					newStr = str.replace(str.substring(ind, ind+1), "is not");
				}
			}
		} else {
			newStr = str;
		}*/
		//System.out.println(newStr);

	}

}
