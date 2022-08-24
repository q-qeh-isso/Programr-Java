package AreaPerimeter;

import java.util.Scanner;


public class Square implements Shape{
	
	public double side;

	public Square(Scanner sc){
		System.out.println("Enter the side :");
		this.side = sc.nextDouble();
	}
	@Override
	public double area(){
		return side * side;
	}
	@Override
	public double peri(){
		return 4 * side;
	}
	
}
