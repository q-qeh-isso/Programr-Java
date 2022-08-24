package toString;

import java.util.Scanner; 

/**
 * Write a Java program to print the values by 
 * overriding toString() method
 * 
 * Example:
 * Input:
 * Enter the name:
 * Test
 * Enter the age:
 * 25
 * Output:
 * Name=>Test and Age=>25
 * 
 *  
 *
 */

public class Challenge { 
	///{ Write your code here  
	String name;
	String age;

	public Challenge(String name, String age){
		this.name = name;
		this.age = age;
	}

	///}           

	public static void main(String[] args) {  
		Scanner scanner = new Scanner(System.in);  

		System.out.print("Enter the name:");  
		String name = scanner.next();  
		System.out.print("Enter the age:");  
		String age = scanner.next();  

		Challenge test = new Challenge(name, age);  
		System.out.println(test);  

	}  

	@Override
	public String toString() {  
		return ("Name=>" + name + " and " + "Age=>" + age);  
	}  
}  

