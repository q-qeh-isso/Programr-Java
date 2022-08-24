package books;

public abstract class Book {
	
	private String title = "";
	private double price = 0;	

	public Book(String title){
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;		
	}
	
	//public abstract double setPrice();

}
