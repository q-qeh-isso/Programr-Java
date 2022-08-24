package stringtimes;

import java.util.Scanner;

/**
 * Given a string and a non-negative int n, return a larger string 
 * that is n copies of the original string. 
 * 
 * Examples:
 * Enter a string:
 * Hi
 * How many times?:
 * 3
 * stringTimes:HiHiHi
 * 
 * Enter a string:
 * Programr
 * How many times?:
 * 2
 * stringTimes:ProgramrProgramr
 * 
 *  
 *
 */

public class StringTimes {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string: ");
		String str=scanner.nextLine();
		System.out.println("how many times: ");
		int times=scanner.nextInt();
		
		String strFinal = stringTimes(str,times);
		System.out.println("stringTimes:"+strFinal);

	}
	
	public static String stringTimes(String str, int n){
		String result = "";
		for (int i = 1; i<=n; i++) {
			result += str;
		}
		return result;
	}

}
