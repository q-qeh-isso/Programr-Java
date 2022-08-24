package copyingTeste;

import java.util.ArrayList;
import java.util.List;

public class CopyingArrayList {
	
	public static void main(String[] args){
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("hello");
		list1.add("world");
		list1.add("programr");
		list1.add("java");
		list1.add("php");
		
		System.out.println("*** list1 : " + list1);
		//mostraLista(list1);
		System.out.println();
		
		ArrayList<String> list2 = list1;
		System.out.println("*** list2 : " + list2);
		//mostraLista(list2);
		System.out.println();
		
		
		System.out.println("alterando indice 1 para = banana");
		list2.set(1,"banana");
		
		System.out.println("*** list2 : " + list1);
		//mostraLista(list2);
		System.out.println();
		
		System.out.println("*** list1 : " + list1);
		//list1.forEach(x -> System.out.println(x));
		//mostraLista(list1);
		System.out.println();
		
		

		
	}
	
	private static void mostraLista(List<String> elems){
		//Pra cada variavel nome dentro de nomes
		//System.out.println("*** Elementos ***");
		for(String str : elems){
			System.out.println(str);
		}		
	}

}
