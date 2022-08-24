package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int sum=110;
		try{
			if(sum >100){
				throw new sumException("The number is greater than 100.");
			}
		} catch(sumException e){
			e.printStackTrace();
		}
	}

}
