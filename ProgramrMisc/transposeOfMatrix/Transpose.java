package transposeOfMatrix;

import java.util.Scanner;

public class Transpose {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 9 numbers:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] res = new int[3][3];
		System.out.println("Transpose Matrix: ");
		for (int i = 0; i < res.length; i++) {
			int c = 0;
			for (int j = 0; j < res.length; j++) {
				res[c++][j] = arr[i][j];
			}
		}
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
 
		
	}

}
