package strings;

public class TestePalindrome {
	
	public static void main(String[] args) {
		String strn = "malayalam ";
		String strReverse = "";
        /*for(int i = 0; i<strn.length(); i++){
        	if(strn.substring(strn.length()-i-1).equals(" ")){
                continue;
            }
            strReverse += strn.substring(strn.length()-i-1, strn.length()-i);            
        }*/
		for(int i = strn.length()-1; i>=0; i--){
			/*if(strn.charAt(i) == ' '){
				continue;
			}*/
            strReverse += strn.charAt(i);
        }
        System.out.println("Normal string:  " + strn);
        System.out.println("Reverse string: " + strReverse);
        
        if(strReverse.equals(strn)) {
            System.out.print("palindrome");
        } else {
            System.out.print("not a palindrome");
        }
	}

}
