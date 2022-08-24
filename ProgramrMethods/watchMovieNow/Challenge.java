package watchMovieNow;

import java.util.Scanner;

/**
 * You're thinking about going with your friends to a movie. 
 * Write a Java method seeMovie that accepts two parameters: 
 * the cost of a ticket in dollars, and the number of stars the 
 * movie received out of 5. The method should print console output 
 * about how interested you are; print either very interested, 
 * sort-of interested, or not interested, based on the following criteria:
 * 
 * 
 *  -You like bargains. Any movie that costs less than $5.00 is the one 
 *    that you are very much interested in.
 *  -You dislike expensive movies. You are not interested in 
 *    seeing any movie that costs $12.00 or more, unless it 
 *    got 5 stars (and even then, you are only sort of interested).
 *  -You like quality. You are very much interested in seeing 5 
 *    star movies that cost under $12.00.
 *  -You are sort-of interested in seeing movies costing 
 *    between $5.00 - $11.99 that also got between 2-4 stars inclusive.
 *  -You are not interested in seeing any other movies not described 
 *  previously.
 *  
 * Enter cost of ticket in dollars:3
 * Enter stars it received out of 5:2
 * Your level of interest in watching movie:very much interested
 * 
 * Enter cost of ticket in dollars:13
 * Enter stars it received out of 5:5
 * Your level of interest in watching movie:sort of interested
 * 
 * 
 *  
 *
 */

public class Challenge {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter the cost of ticket in dollars:");
		double cost = scanner.nextDouble();
		System.out.println("Enter stars it received out of 5:");
		int stars = scanner.nextInt();	
		
		System.out.println("Your level of interest in watching movie:");
		seeMovie(cost,stars);
		scanner.close();
	}
	
	public static void seeMovie(double cost, int stars){
		
		if(cost<5) System.out.println("very much interested");
		else if(cost<12 && stars == 5) System.out.println("very much interested");
		else if(cost>=12 && stars == 5) System.out.println("sort of interested");
		else if(cost>5 && cost < 12 && stars >=2 && stars <= 4) System.out.println("sort of interested");
		else System.out.println("not interested");

	}

}
