package login;

import java.util.Scanner;

/**
 * Suppose we have a database composed of two fields or columns (arrays), 
 * the first field is for the username (user[]) and the other one is for 
 * the password(pass[]) .
 * 
 * This is how it looks like:
 * user[0] = �John� ;
 * user[1] =�Bob�;
 * user[2]=�ArnoldSchwarzenegger� ;
 * 
 * And their passwords correspond with their indexes.
 * pass[0] = �123�;
 * pass[1] = �456�;
 * pass[2] = �theterminator�;
 * 
 * Then if one of them had successfully login, the output should be:
 * Enter username: John
 * Enter password: 123 //(no need to encrypt LOL)
 * Hello John!  
 * 
 * But if not, "Incorrect Login!" &am
 * 
 *  
 *
 */

public class Login {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		String[] user = new String[3];
		String[] pass = new String[3];
		
		user[0] = "John";
		user[1] = "Bob";
		user[2] = "ArnoldSchwarzenegger";
		pass[0] = "123";
		pass[1] = "456";
		pass[2] = "theterminator";
		
		System.out.print("Enter username: ");		
		String username = scanner.nextLine();
		System.out.print("Enter password: ");		
		String password = scanner.nextLine();
		
		boolean isLogged = false;
		for (int i = 0; i < user.length; i++) {
			if(username.equals(user[i]) && password.equals(pass[i])) {
				isLogged = true;
				break;
			}
		}
		
		if(isLogged){
			System.out.println("Hello " + username + "!");
		} else {
			System.out.println("Incorrect Login!");
		}
		
		
		
	}

}
