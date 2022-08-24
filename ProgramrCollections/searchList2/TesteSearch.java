package searchList2;

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
	    System.out.println("Enter the number to search for: ");
		int searchNum = scan.nextInt();
	    //int searchNum = 5;
	    		
	    ArrayList<String> strList = new ArrayList<String>();
	    strList.add("a");
	    strList.add("b");
	    strList.add("c");
	    strList.add("d");
	    System.out.println("Enter the letter to search for: ");
		String searchWord = scan.next();
	    //String searchWord = "D";
	    
	    //mostraListaInt(intList);
	    //mostraListaStr(strList);	
	    
	    Search searchInt = new Search();
	    System.out.println("Procurando...");
	    
	    int intFound = searchInt.linearSearch(intList, searchNum);
	    if(intFound != -1){
	    	System.out.println("Numero " + searchNum + " localizado!");
	    	System.out.println("Indice " + intFound + " = " + intList.get(intFound));
	    } else {
	    	System.out.println("Numero " + searchNum + " NÃO foi localizado!");
	    }
	    
	    int strFound = searchInt.linearSearch(strList, searchWord);
	    if(strFound != -1){
	    	System.out.println("Letra " + searchWord + " localizada!");
	    	System.out.println("Indice " + strFound + " = " + strList.get(strFound));
	    } else {
	    	System.out.println("Letra " + searchWord + " NÃO foi localizada!");
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
