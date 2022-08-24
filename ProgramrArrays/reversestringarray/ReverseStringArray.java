package reversestringarray;

import java.util.Scanner;

public class ReverseStringArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str="";
		System.out.print("Enter a string:");
		str=scanner.nextLine();

		
		char[] ch = str.toCharArray();			
		for (int i = 0; i<ch.length/2; i++) {
			char curr = ch[i];
			char last = ch[ch.length-1-i];
			ch[i] = last;
			ch[ch.length-1-i] = curr;
		}
		System.out.print(ch);
		
		/*char[] arr = str.toCharArray();
		int len = arr.length;
		char curr = ' ';
		char last = ' ';
		for (int i = 0; i<len/2; i++) {
			curr = arr[i];
			last = arr[len-1-i];
			arr[i] = last;
			arr[len-1-i] = curr;
		}
		for(char c : arr){
			System.out.print(c);
		}*/
		
		/*char[] ch = str.toCharArray();
		String[] newStr = new String[str.length()];		
		int temp = 0;
		for (int i = ch.length-1; i>=0; i--) {
			newStr[temp] = String.valueOf( ch[i] );
			temp++;
		}
		for(String s : newStr){
			System.out.print(s);
		}*/
	}

}
