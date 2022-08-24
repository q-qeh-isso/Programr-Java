package strings;

import java.util.Scanner;

public class TesteSurname {
	
	
	public static String names[]={"harry","michael","will","tom","jackie"};    
    public static String surnames[]={"potter","jackson","smith","cruise","chan"};    

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String name;   
		System.out.println("Enter the name:");
		name=sc.next();


		System.out.println("Full name of the celebraty is:");
		/*write down your logic*/
		for(int i = 0; i<names.length; i++){
			if(name.equals(names[i])){
				name = names[i] + " " + surnames[i];
				//System.out.println("setou name para = " + names[i]);
				//System.out.println("setou name para = " + surnames[i]);
			}
		}
		//System.out.println("setou name para = " + name);
		System.out.println(name);

	}

}
