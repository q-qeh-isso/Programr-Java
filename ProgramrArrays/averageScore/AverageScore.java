package averageScore;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);   
		System.out.println("Size of the array:"); 
		int size = scanner.nextInt();
		int[] array = new int[size];  
		System.out.println("Enter values into the array:");  
		for(int i = 0; i<array.length; i++){  
			array[i] = scanner.nextInt();  
		}

		double res1 = 0;
		int div1 = 0;
		double res2 = 0;
		int div2 = 0;
		for (int i = 0, j = array.length-1; i < array.length/2; i++) {
			res1 += array[i];
			div1++;
			res2 += array[j];
			div2++;
		}
		double max = Math.max(res1/div1, res2/div2);
		
		/*double res2 = 0;
		int div2 = 0;
		for (int i = array.length/2; i < array.length; i++) {
			res2 += array[i];
			div2++;
		}
		res2 = res2/div2;	*/
		

		System.out.println(max);

	}

}
