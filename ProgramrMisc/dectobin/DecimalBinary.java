package dectobin;

public class DecimalBinary {
	
	public static void main(String[] args) {
		
		String hex = "5";
		int num = Integer.parseInt(hex);
		hex = Integer.toBinaryString(num);
		
		System.out.println(hex);
		
	}

}
