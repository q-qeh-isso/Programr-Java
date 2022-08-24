package CharOccurence;

import java.io.InputStreamReader;
import java.util.Scanner;

public class CharOcurrence {

	public static void main(String[] args) {
		String m;
		char c;
		int a_count=0;

		Scanner br = new Scanner(System.in);
		System.out.println("Enter the string :");
		m=br.nextLine(); 
		System.out.println("Enter the character :");
		c=br.nextLine().charAt(0); 

		//char[] mArr = m.toCharArray();
		for(int i = 0; i<m.length(); i++){
			if(m.substring(i,i+1).equals(String.valueOf(c))){
				a_count++;
			}
		}
		System.out.println("string = " + m);
		System.out.println("char = " + c);
		System.out.println("count = " + a_count);
		//System.out.println("\'" + m + "\' contains " + a_count + " \'"+c+"\'s");
	}
}
