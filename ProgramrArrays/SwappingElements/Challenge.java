package SwappingElements;

import java.util.Scanner;

/**
 * Ask for 5 elements. Swap every even positioned element with odd 
 * positioned element next to it.
 * 
 * For example:
 * 
 * Input:
 * 1 2 3 4 5
 * Output:
 * 2 1 4 3 5
 * 
 * Input:
 * 10 5 6 3 9
 * Output:
 * 5 10 3 6 9
 * 
 * @author Renan
 *
 */

public class Challenge {

	public static void main(String args[]) 
	{   
		Scanner scanner=new Scanner(System.in);   
		int[] a; 
		a = new int[5];  
		System.out.print("Enter elements of array :");  
		for(int i = 0; i<5; i++){  
			a[i] = scanner.nextInt();  
		}
		///{write you code here
		int[] res = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if(i==a.length-1){
				res[i] = a[i];
				break;
			}
			if(i < a.length-1 && i%2 == 0 && (i+1)%2 != 0){
				res[i] = a[i+1];
				res[i+1] = a[i];
				i++;
				continue;
			}
			if(i > 0 && i%2 != 0 && (i-1)%2 == 0){
				res[i] = a[i-1];
				res[i+1] = a[i];
				i++;
				continue;
			}
		}
		
		for(int n : res) System.out.print(n+" ");
		///}
	}

}
