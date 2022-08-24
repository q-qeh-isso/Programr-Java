package sumcolarr;

import java.util.Scanner;

public class SumColArr {
	
	public static void main(String[] args) {
		int rows=10,cols=10;
		double a[][]=    {
		{12,62,16,34,33,48,35,63,35,11},
		{34,35,61,37,36,12,33,12,12,77},
		{37,58,95,24,36,41,23,45,12,33},
		{23,19,13,22,31,23,51,23,55,33},
		{32,33,88,22,31,23,41,23,55,33},
		{54,54,33,22,31,23,14,23,55,33},
		{37,76,33,22,31,23,22,23,55,33},
		{43,38,33,22,31,23,36,23,55,33},
		{13,35,32,22,31,23,87,23,55,33},
		{22,59,13,22,31,23,49,23,55,33}
						 };
		
		Scanner br = new Scanner(System.in);
		System.out.println("Enter the column:");
		int col = br.nextInt();
		
		int sum=0;
		col -= 1;
		System.out.println("Sum of the given column is:");
		for(int i = 0; i<a.length; i++){
			sum += a[i][col];
		    /*for(int c = 0; c<a[i].length; c++){
		        
		    }*/
		}
		System.out.println(sum);
	}

}
