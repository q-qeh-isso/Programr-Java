package strings;

import java.util.Arrays;

public class ArrChar {
	
	public static void main(String[] args) {
		
		String str = "helloworld";
		char[] strArr = str.toCharArray();
		Arrays.sort(strArr);
		String sorted = new String(strArr);
		
		System.out.println(sorted);
		
		
		
	}

}
