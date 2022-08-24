package matrixMultiplication;

import java.util.Scanner;

/**
 * Write a program to takes two matrix(3*3) array as inputs and 
 * calculate the multiplication of both matrix.
 * 
 * Example :
 * 1. If two matrix are :
 * Matrix 1st :
 * 1 2 3
 * 4 5 6
 * 7 8 1
 * 
 * Matrix 2nd:
 * 1 2 3
 * 3 2 1
 * 4 5 2
 * 
 * then the multiplication of both matrix should be :
 * 19 21 11
 * 43 48 29
 * 35 35 31
 * 
 * 2. If two matrix are :
 * Matrix 1st :
 * 4 4 4
 * 2 2 2
 * 3 3 3
 * 
 * Matrix 2nd :
 * 1 4 3
 * 3 2 4
 * 1 2 4
 * 
 * then the multiplication of both matrix should be :
 * 20 32 44
 * 10 16 22
 * 15 24 33
 * 
 *  
 *
 */

public class MatrixMultiplication {

	public static void main(String[] args) {

		int array[][] = new int[3][3];
		int array1[][] =new int[3][3];
		int array2[][] = new int[3][3];

		Scanner scan=new Scanner(System.in);

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <3; j++) {
				System.out.println("Matrix 1st ["+i+"]["+j+"]:");
				array[i][j]=scan.nextInt();
			}
		}

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Matrix 2nd ["+i+"]["+j+"]:");
				array1[i][j]=scan.nextInt();
			}
		}

		//write your logic here 
		int aRows = array.length;
		int aColumns = array[0].length;
		int bRows = array1.length;
		int bColumns = array1[0].length;
		for (int i = 0; i < aRows; i++) { // aRow
			for (int j = 0; j < bColumns; j++) { // bColumn
				for (int k = 0; k < aColumns; k++) { // aColumn
					array2[i][j] += array[i][k] * array1[k][j];
				}
			}
		}
		//end


		System.out.println("Multiply of both matrix:");

		for(int i = 0; i < 3; i++) 
		{
			for(int j = 0; j < 3; j++) 
			{
				System.out.print(array2[i][j]+" ");
			}  
			System.out.println();
		}


	}

}
