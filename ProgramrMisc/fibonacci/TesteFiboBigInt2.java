package fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class TesteFiboBigInt2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número de termos: ");
		int num = scan.nextInt();
		
		BigInteger[] fbArr = new BigInteger[num];
		for(int i = 0; i<fbArr.length; i++){
			if(i == 0){
				fbArr[i] = BigInteger.ZERO;
			} else if(i <= 2){
				fbArr[i] = BigInteger.ONE;
			} else {
				fbArr[i] = fbArr[i-2].add(fbArr[i-1]);
			}
		}

		for(int i = 0; i<fbArr.length; i++){
			System.out.println(fbArr[i]);
		}
	}

}
