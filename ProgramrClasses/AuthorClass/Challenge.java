package AuthorClass;

import java.util.Scanner;
/**
 * Make a author class. Ask for string name, email, and book name. 
 * Then print out his name, email, book name
 * 
 * Examples:
 * Input: John
 * johnjay@gmail.com
 * Heaven Glory
 * Output:
 * John
 * johnjay@gmail.com
 * Heaven Glory
 * 
 * Input: Rina
 * rina@msn.com
 * Super Fly
 * Output:
 * Rina
 * rina@msn.com
 * Super Fly
 * 
 *  
 *
 */

public class Challenge {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);      
		Author aut;    

		System.out.println("Enter name:");
		String somename = scanner.nextLine();   

		System.out.println("Enter email:");   
		String semail = scanner.nextLine();

		System.out.println("Enter book name:");  
		String sbook = scanner.nextLine();   

		aut = new Author(somename, semail, sbook);

		System.out.println(aut.name+"\n"+aut.email+"\n"+aut.book);

	}

}
