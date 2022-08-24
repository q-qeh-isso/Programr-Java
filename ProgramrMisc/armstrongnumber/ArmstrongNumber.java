package armstrongnumber;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int i,num,sum=0;
		   
        System.out.println("Enter a number:");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();

        i=num;
        String str = String.valueOf(num);
        char c;
        for(int k = 0; k<str.length(); k++){
            c = str.charAt(k);
            sum += Character.getNumericValue(c)*Character.getNumericValue(c)*Character.getNumericValue(c);
        }
        if(sum==i)
           System.out.print("Number is a Armstrong number");
        else
           System.out.print("Number is not a Armstrong number");
	}

}
