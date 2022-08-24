package maxLengthString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a method maxLength that takes an ArrayList of 5 Strings 
 * as a parameter and that returns the length of the longest 
 * string in the list. If your method is passed an empty list, 
 * it should return 0.
 * 
 * Examples:
 * Enter 5 Strings to store in arraylist:
 * pr
 * ogr
 * amr
 * node
 * s
 * Length of longest string in arraylist:4
 * 
 * Enter 5 Strings to store in arraylist:
 * hello
 * world
 * programr
 * java
 * php
 * Length of longest string in arraylist:8
 * 
 *  
 *
 */

public class TesteMaxLength {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	ArrayList<String> al = new ArrayList<String>();
		System.out.println("Enter 5 strings to insert to the ArrayList: ");
		int c = 5;
		while (c-- > 0) {
			// To add an element to the ArrayList
			al.add(scanner.nextLine());
		}
	    
	    //mostraListaStr(al);
	    System.out.println("Length of longest string in arraylist:" + maxLength(al));
	}
	
	private static int maxLength(ArrayList<String> list) {
		int lenElem = Integer.MIN_VALUE;
		String currElem = "";
		
		for (int i=0; i < list.size(); i++) {
			currElem = list.get(i);
			if(currElem.length() > lenElem){
				lenElem = currElem.length();
			}
        }
        return lenElem;
	}

	private static void mostraListaStr(List<String> elems){
		System.out.println("*** Elementos ***");
		for(String s : elems){
			System.out.println(s);
		}		
	}

}
