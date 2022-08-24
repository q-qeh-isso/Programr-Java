package ExceptionHandling;

class sumException extends Exception{

	public sumException(){
		System.out.println("The number is greater than 100");
	}

	public sumException(String description){
		super(description);
	}
	
	
	
}
