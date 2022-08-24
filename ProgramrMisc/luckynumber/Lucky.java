package luckynumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lucky {
	
	public static void main(String[] args) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date(ddmmyy):");
		int number = 0;
		try {
			number = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String numStr = String.valueOf(number);
		char n1;
		int sum = 0;		
		for(int i = 0; i<numStr.length(); i++){
			n1 = numStr.charAt(i);
		    sum += Character.getNumericValue(n1);		
		}
		
		String sum1Str = String.valueOf(sum);
		if(sum1Str.length() > 1){
			sum = 0;
			for(int i = 0; i<sum1Str.length(); i++){
				n1 = sum1Str.charAt(i);
				sum += Character.getNumericValue(n1);
			}
		}


		System.out.println("Your lucky number is:"); 
		System.out.println(sum);
		
	}

}
