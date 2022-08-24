package DeleteChar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteChar {

	public static void main(String[] args) {

		String s = null; 
		char deletechar = 'a';
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a string:"); 	

		try {
			s=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter Character which you want to delete:");
		try {
			deletechar= (char)br.read() ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringBuffer restr=new StringBuffer();
		System.out.println(restr.length());
		for(int i = 0; i<s.length(); i++){
			char temp = s.charAt(i);
			if(temp != deletechar){
				restr.append(temp);
			}
		}

		System.out.println("Result String is:\n"+restr.toString()); 

	}

}
