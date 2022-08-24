package strings;

public class TesteString1 {

	public static void main(String[] args) {
		String str = "Testando";
		//System.out.println(str.charAt(1));
		//System.out.println(teste(str,str.length()-1));
		System.out.println(str.substring(str.length()-1,str.length()));
	}
	
	private static char teste(String str, int i){
		return str.charAt(i);
	}

}
