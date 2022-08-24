package areaCircle;

public class Circle extends CircleShape {

	private double area;   

	public double area() {   
		return radius * radius * 3.14;   
	}   

	public String getDisplayText() { 
		///{ Write your code here   
		return String.valueOf(area());



		///}          
	}

}
