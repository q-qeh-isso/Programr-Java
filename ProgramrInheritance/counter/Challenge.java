package counter;

/**
 * Write a Java program using inheritance to print the value of Counter.
 * Create a class Counter with class variable 'i' and method called 'increment()'.
 * 
 * Now write a subclass extending Counter class which calls the increment() 
 * function and displays the following output:
 * 
 * i = 3
 * 
 *  
 *
 */

public class Challenge extends Counter {

	public static void main(String[] args) {
		Counter con = new Counter();
		for(int k = 0; k <= 3; k++){			
			if(k == 3){
				con.print();
				break;
			}
			con.increment();
		}
		

	}

}
