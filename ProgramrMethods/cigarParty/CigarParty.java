package cigarParty;

import java.util.Scanner;

/**
 * When squirrels get together for a party, they like to have cigars. 
 * A squirrel party is successful when the number of cigars is 
 * between 40 and 60, inclusive. Unless it is the weekend, 
 * in which case there is no upper bound on the number of cigars. 
 * Return true if the party with the given values is successful, 
 * or false otherwise. 
 * 
 * Enter number of cigars:
 * 60
 * Is it a weekend?Enter (true/false):
 * true
 * Party successful:true
 * 
 * Enter number of cigars:
 * 40
 * Is it a weekend?Enter (true/false):
 * false
 * Party successful:true
 * 
 *  
 *
 */

public class CigarParty {
	
	public static void main(String[] args) {
		
		int cigars = 0;
		boolean isWeekend = false;
		boolean success = false;
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter number of cigars:");
		cigars = scanner.nextInt();
		System.out.println("Is it a weekend? Enter (true/false):");
		isWeekend = scanner.nextBoolean();

		success=cigarParty(cigars,isWeekend);
		System.out.println("party successful:"+success);
		
	}
	
	public static boolean cigarParty(int cigars, boolean isWeekend){
		if(isWeekend && cigars >= 40) return true;
		if(cigars >= 40 && cigars <= 60) return true;
		
		return false;
	}


}
