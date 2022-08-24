package addelementsofarray;

import java.util.Scanner;

public class AddElementsArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] arr= new int[10];		
		int sum = 0;
		System.out.println("Enter 10 elements to the array:");
		for (int i = 0; i < 10; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		

	}

}
