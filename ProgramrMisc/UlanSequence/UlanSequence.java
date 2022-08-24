package UlanSequence;

import java.util.Scanner;

public class UlanSequence {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt(); 
		String result = "";
		boolean isNegative = false;
        while(true){
            if(num % 2 == 0){
                num = num / 2;
                if(num == 1){
                	result += num;
                	break;
                } else {
                	result += num + " -> ";
                }
            } else {
                num = (3 * num) + 1;
                if(num == 1){
                	result += num;
                	break;
                } else {
                	result += num + " -> ";
                }
            }
        }
		System.out.print(result);
	}

}
