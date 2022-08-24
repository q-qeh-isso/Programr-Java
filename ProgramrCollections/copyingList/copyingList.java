package copyingList;

import java.util.ArrayList;

/**
 * Write a program that creates an ArrayList of Integers. 
 * It should put ten random numbers from 1 to 100 in the ArrayList. 
 * It should copy all the elements of that ArrayList into 
 * another ArrayList of the same size. Then display the contents of 
 * both ArrayLists as in the sample output.
 * 
 * Create an ArrayList of Integers
 * Fill the ArrayList with ten random numbers (1-100)
 * Copy each value from the ArrayList into another ArrayList of the same capacity
 * Change the last value in the first ArrayList to a -7
 * Display the contents of both ArrayLists
 * 
 * 
 * Input
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 9
 * Output
 * 1 2 3 4 5 6 7 8 9 -7
 * 1 2 3 4 5 6 7 8 9 9
 * 
 * Input
 * 2
 * 2
 * 2
 * 2
 * 2
 * 2
 * 2
 * 2
 * 2
 * 2
 * Output
 * 2 2 2 2 2 2 2 2 2 -7
 * 2 2 2 2 2 2 2 2 2 2
 * 
 *  
 *
 */

public class copyingList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(4);
		list1.add(7);
		list1.add(15);
		list1.add(2);
		list1.add(35);		
		//shallow copy.. copy data e not by reference!
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1);		
		list1.set(list2.size()-1,-7);
		
		System.out.println("ArrayList 1:" + print(list1));
    	System.out.println("ArrayList 2:" + print(list2));		
		
	}
	private static String print(ArrayList<Integer> a) {
    	String ret = "";
		for (int i = 0; i < a.size(); i++) {
			ret += a.get(i) + " ";
		}
        return ret;
	
}

}
