package ConsecutiveNumber;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNumber {

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		n = sc.nextInt(); 

		char[] nChars = String.valueOf(n).toCharArray();
		//System.out.println(Arrays.toString(nChars));
		//mostra(nChars);
		int ch, chp;
		boolean flag = false;
		for(int i = 0; i<nChars.length-1; i++){
			ch = Character.getNumericValue(nChars[i]);
			chp = Character.getNumericValue(nChars[i+1]);
			if(chp == ch+1){
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("given number is consecutive");
		} else {
			System.out.println("given number is not a consecutive");
		}
	}
	
	private static void mostra(char[] arr){
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");				
		}
	}

}
