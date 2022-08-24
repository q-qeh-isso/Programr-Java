package ascendingnumbers;

import java.util.Arrays;

public class AscendingNumbers {
	
	public static void main(String[] args) {
		int a[]={5,4,2,6,8,9,1,3,10,7};

		 Arrays.sort(a);


		System.out.println("The output is:");
		for(int i=0;i<10;i++)
		System.out.println(a[i]);
	}

}
