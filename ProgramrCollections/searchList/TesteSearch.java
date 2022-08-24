package searchList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> intList = new ArrayList<Integer>(); 
		intList.add(1);
	    intList.add(3);
	    intList.add(5);
	    intList.add(7);	    
	    //int searchNum = 5;
	    
	    ArrayList<String> strList = new ArrayList<String>();
	    strList.add("A");
	    strList.add("B");
	    strList.add("C");
	    strList.add("D");
	    String word = "C";
	    
	    //mostraListaInt(intList);
	    //mostraListaStr(strList);
	    
	    System.out.println("Enter the number to search for: ");
		int number = scan.nextInt();
	    Search<Integer> searchInt = new Search<Integer>();
	    System.out.println("Procurando...");
	    int elemFound = searchInt.linearSearch(intList, number);
	    if(elemFound != -1){
	    	System.out.println("Numero " + number + " localizado!");
	    	System.out.println("Indice " + elemFound + " = " + intList.get(elemFound));
	    } else {
	    	System.out.println("Numero " + number + " NÃO foi localizado!");
	    }
	    
	}
	
	
	private static void mostraListaInt(List<Integer> elems){
		//Pra cada variavel nome dentro de nomes
		System.out.println("*** Elementos ***");
		for(int n : elems){
			System.out.println(n);
		}		
	}
	private static void mostraListaStr(List<String> elems){
		//Pra cada variavel nome dentro de nomes
		System.out.println("*** Elementos ***");
		for(String s : elems){
			System.out.println(s);
		}		
	}

}
