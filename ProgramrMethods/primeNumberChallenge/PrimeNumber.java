package primeNumberChallenge;

/**
 * A number is prime if is isn't evenly divisible by anything except for
 *  1 and itself. Print out all the numbers from 2 to 20, and mark each 
 *  prime number with a "<". You need to complete the "isPrime" method.
 *  Printing prime number from 2 to 20:
 *  2 <
 *  3 <
 *  4
 *  5 <
 *  6
 *  7 <
 *  8
 *  9
 *  10
 *  11 < 
 *  12
 *  13 <
 *  14
 *  15
 *  16
 *  17 <
 *  18
 *  19 <
 *  20

 * 
 *  
 *
 */

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Printing prime number from 2 to 20:" );
		for(int number = 2; number<=20; number++){

			if(isPrime(number)){
				System.out.println(number+" <");
			}else{
				System.out.println(number);
			}

		}
	}

	public static boolean isPrime(int number){
		int count = 0;
		for(int i = 1; i<=number; i++){
			if(number%i == 0) count++;
		}
		if(count == 2) return true;

		return false;
	}

}
