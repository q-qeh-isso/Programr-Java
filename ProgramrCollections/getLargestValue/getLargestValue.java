package getLargestValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program that creates an ArrayList which can hold Integers. 
 * Enter the number of integers that will be inserted, then enter those 
 * integers. Then use a linear search to find the largest 
 * value in the ArrayList, and display that value.
 * 
 * For example:
 * Input:
 * 3
 * 1
 * 2
 * 3
 * Output:
 * 3
 * 
 * Input:
 * 7
 * 5
 * 500
 * -8
 * 0
 * 3
 * 56
 * -1000
 * Output:
 * 500
 * 
 *  
 *
 */

public class getLargestValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of integers that will be inserted: ");
		int numbers = scan.nextInt();		
		List<Integer> intElems = new ArrayList<Integer>(); 
		//Search intSearch = new Search();
		
		System.out.println("Enter some integers to insert to the ArrayList: ");
		while (numbers-- > 0) {
			// To add an element to the ArrayList
			intElems.add(scan.nextInt());
		}
		/*for(int i=0; i<numbers; i++){
			System.out.println("Enter the " + (i+1) + " integer to insert to the ArrayList: ");
			int inElem = scan.nextInt();
			intElems.add(inElem);
		}*/
		//int max = Collections.max(intElems); //working
		//System.out.println(max); //working
		//mostraLista(intElems);
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < intElems.size(); i++) {
			if(intElems.get(i) > max){
				max = intElems.get(i);
			}
		}
		System.out.println("Maior numero �: " + max);
	}
	
	private static void mostraLista(List<Integer> elems){
		//Pra cada variavel nome dentro de nomes
		System.out.println("*** Elementos ***");
		for(int n : elems){
			System.out.println(n);
		}		
	}

}
