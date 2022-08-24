package vowels;

import java.util.Scanner;

public class ConsonantsVowels {
	
	public static void main(String[] args) {
		
		String line; 
        int number_of_vowels,uc,lc,uv,lv;
        uc=lc=uv=lv=0;
        System.out.println("Enter your sentence :");
        Scanner br = new Scanner(System.in);
        
        line=br.nextLine();
        //write your logic here
        char[] lineCh = line.toCharArray();
        for(int i = 0; i<lineCh.length; i++){
        	if(Character.isLowerCase(lineCh[i])){
            	if(lineCh[i] == 'a' || lineCh[i] == 'e' || lineCh[i] == 'i' || lineCh[i] == 'o' || lineCh[i] == 'u'){
            		lv++;
            	} else {
            		lc++;
            	}            	
        	} else if(Character.isUpperCase(lineCh[i])){
        		if(lineCh[i] == 'A' || lineCh[i] == 'E' || lineCh[i] == 'I' || lineCh[i] == 'O' || lineCh[i] == 'U'){
            		uv++;
            	} else {
            		uc++;
            	} 
        	}
        }

        //end 
       //Printing the output.
        System.out.println("Uppercase Consonants = "+ uc + ".") ;
        System.out.println("Lowercase Consonants = "+lc + ".");
        System.out.println("Uppercase Vowels = "+ uv + ".");
        System.out.println("Lowercase Vowels = "+ lv + ".");
        number_of_vowels=uv+lv;
        System.out.println("Number of vowels = "+ number_of_vowels);
		
	}

}
