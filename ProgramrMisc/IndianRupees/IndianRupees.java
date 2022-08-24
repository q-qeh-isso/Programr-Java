package IndianRupees;

import java.util.Scanner;

public class IndianRupees {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt(); 
		
		String numStr = String.valueOf(num);
		String iniStr = "";
		String lastStr = "";
		//int[] arr = new int[3];
		for(int i = 0; i<numStr.length()-3; i++){
			iniStr += numStr.substring(i,i+1);
		}
		System.out.println(iniStr);
		for(int i = 0; i<numStr.length(); i++){
			if(i >= numStr.length()-3){
				lastStr += numStr.substring(i,i+1);
			}
		}		
		System.out.println(lastStr);
		
		System.out.println(iniStr + "Thousand " + lastStr);
	}

}
