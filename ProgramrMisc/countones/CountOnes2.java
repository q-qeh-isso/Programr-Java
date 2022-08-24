package countones;

import java.util.Scanner;

public class CountOnes2 {
	
	public static void main(String[] args) {

		int numMin, numMax; // contains user input statement
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter min value:");
		numMin = scan.nextInt();
		System.out.println("Enter max value:");
		numMax = scan.nextInt();

		String tempStr = "";
		char c;
		int count = 0;
		for (int i = numMin; i <= numMax; i++) {
			tempStr = String.valueOf(i);
			if(tempStr.length() >= 2){
				for (int k = 0; k<tempStr.length(); k++) {
					c = tempStr.charAt(k);
					if(c == '1'){
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
