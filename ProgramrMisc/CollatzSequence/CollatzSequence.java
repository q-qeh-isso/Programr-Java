package CollatzSequence;

import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt(); 
		
		String result = "";
		boolean isNegative = false;
        while(true){
        	if(num < 0){
                isNegative = true;
            }
            if(Math.abs(num) == 1){
                result += num;
                break;
            }
            if(Math.abs(num) % 2 == 0){
                result += num + " ";
                if(isNegative){
                    num = -(Math.abs(num) / 2);
                } else {
                    num = Math.abs(num) / 2;
                }
            } else {
                result += num + " ";
                if(isNegative){
                    num = -((3 * Math.abs(num)) + 1);
                } else {
                    num = (3 * Math.abs(num)) + 1;
                }
            }
        }
		System.out.print(result);
	}

}
