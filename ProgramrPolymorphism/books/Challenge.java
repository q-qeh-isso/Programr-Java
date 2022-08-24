package books;

/**
 * Create an abstract class called Book. Include a String field for the 
 * book's title and a double field for the book's price. 
 * Within the class, include a constructor that requires the 
 * book title and two get methods: one that returns the title 
 * and one that returns the price. Also include an abstract 
 * method named setPrice(). Create two child classes of Book: 
 * Fiction and NonFiction. Within the constructors for 
 * the Fiction and NonFiction classes, call setPrice 
 * so all Fiction Books cost $24.99 and all Non Fiction Books cost $37.99. 
 * 
 * A main class Challenge creates an array (size : 2) of Book variables 
 * to store references to objects of each concrete class. For each book, 
 * display the string representation as shown below.
 * 
 * Examples:
 * Title of fiction book:
 * Harry Potter
 * Title of non fiction book:
 * Calculus
 * Title-Harry Potter Cost-$24.99
 * Title-Calculus Cost-$37.99
 * 
 * Title of fiction book:
 * Schooled in Revenge
 * Title of non fiction book:
 * Biostatistics
 * Title-Schooled in Revenge Cost-$24.99
 * Title-Biostatistics Cost-$37.99
 * 
 *  
 *
 */

public class Challenge {

	public static void main(String[] args) {
		
		Fiction fiction = new Fiction("Harry Potter");
		NonFiction nonFiction = new NonFiction("Cauculus");
		
		System.out.println("Title of fiction book:");
		System.out.println(fiction.getTitle());
		System.out.println("Title of non fiction book:");
		System.out.println(nonFiction.getTitle());
		System.out.println("Title-"+fiction.getTitle()+"-$"+fiction.getPrice());
		System.out.println("Title-"+nonFiction.getTitle()+"-$"+nonFiction.getPrice());
		//Book[] books = new Book[2];
		
	}

}
