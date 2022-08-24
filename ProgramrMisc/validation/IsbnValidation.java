package validation;

public class IsbnValidation {
	
	public static void main(String[] args) {
		
		String input = "8535902775";
		//String[] inputParts = input.split("");
		char[] inputParts = input.toCharArray();
		boolean isValid = false;
		
		int[] elems = new int[inputParts.length];		
		for(int i = 0; i<inputParts.length; i++){
			//elems[i] =  Integer.parseInt(inputParts[i]);
			elems[i] = Character.getNumericValue(inputParts[i]);
		}
		//showArray(elems);
		int soma = 0;
		for(int i = 1; i<=elems.length; i++){
			soma += i*elems[elems.length-i];
		}
		//System.out.println();
		//System.out.println("Elems Len: "+elems.length);
		//System.out.println("Soma: "+soma);
		if(soma%11 == 0) isValid = true;

		if(isValid) System.out.println("Valid");
		else System.out.println("Not Valid");
		
		
	}

	private static void showArray(int[] arr) {
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}


}
