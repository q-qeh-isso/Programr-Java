package fibonacci;

import java.util.Scanner;

public class TesteFibonacci {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int num = scan.nextInt();
		
		//ate num 93, apos 93 excede o long
		long[] fbArr = new long[num];
		if(num > 3){
			fbArr[0] = 0;
			fbArr[1] = 1;
			fbArr[2] = 1;
			for(int i = 3; i<fbArr.length; i++){
				fbArr[i] = fbArr[i-2] + fbArr[i-1];
			}
		} else {
			for(int i = 0; i<fbArr.length; i++){
				if(i==2){
					fbArr[i] = i-1;
				} else {
					fbArr[i] = i;
				}
			}
		}

		for(int i = 0; i<fbArr.length; i++){
			System.out.println(fbArr[i]);
		}
		
		
	}

}
