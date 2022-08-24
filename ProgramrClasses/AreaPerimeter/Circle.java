package AreaPerimeter;

import java.util.Scanner;

public class Circle implements Shape{
	
	public double radius;

	public Circle(Scanner sc){
		System.out.println("Enter the radius :");
		this.radius = sc.nextDouble();
	}
	@Override
	public double area(){
		return 3.14 * (radius*radius);
	}
	@Override
	public double peri(){
		return 2 * 3.14 * radius;
	}
	
}
