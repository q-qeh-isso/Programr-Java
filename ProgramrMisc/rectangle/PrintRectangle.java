package rectangle;

public class PrintRectangle {
	
	public static void main(String[] args) {
		int width = 10;
		int height = 5;
		String blank = "";
		for(int s = 0; s<width-2; s++){
			blank += " ";
		}		
		for(int i = 1; i<=width; i++){
			System.out.print("*");						
		}
			System.out.println();
		for(int i = 1; i<=height-2; i++){
			System.out.println("*" + blank + "*");
		}
		for(int i = 1; i<=width; i++){
			System.out.print("*");						
		}
	}

}
