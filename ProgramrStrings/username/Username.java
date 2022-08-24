package username;

import java.util.Scanner;

/**
 * Complete the program below by adding code that will 
 * accept user "admin" as username (case in-sensitive) 
 * and print out "Username accepted" in case it is "admin", 
 * else it will print "Invalid username".
 * 
 * Examples:
 * Input:
 * Enter username:
 * Admin
 * Output:
 * Username accepted
 * 
 * Input:
 * Enter username:
 * test
 * Output:
 * Invalid username
 * 
 *  
 *
 */

public class Username {
	public static void main(String args[]){  

		Scanner sc = new Scanner(System.in); 

		System.out.print("Enter username: "); 
		String input = sc.next(); 


		String upperInput = input.toUpperCase();
		if(upperInput.equals("ADMIN")){
			System.out.println("Username accepted");
		} else {
			System.out.println("Invalid username");
		} 
	} 
}
