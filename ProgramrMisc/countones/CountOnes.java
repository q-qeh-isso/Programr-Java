package countones;

import java.util.Scanner;

public class CountOnes {
	
	public static void main(String[] args) {

		int numMin, numMax; // contains user input statement
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter min value:");
		//numMin = scan.nextInt();
		System.out.println("Enter max value:");
		numMax = scan.nextInt();

		int count = 0;
		String tempStr = "";
		for (int i = 0; i <= numMax; i++) {
			tempStr = String.valueOf(i);
			if(tempStr.length() >= 2){
				for (int c = 0; c<tempStr.length(); c++) {
					if(tempStr.substring(c,c+1).equals("1")){
						count++;
					}
				}
			}
			if(i == 1){
				count++;
			}
		}

		System.out.println(count);
	}

}
