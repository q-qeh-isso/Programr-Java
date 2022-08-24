package AreaPerimeter;

import java.util.Scanner;

public class Rec implements Shape{
	
	public double length;
	public double width;

	public Rec(Scanner sc){
		System.out.println("Enter the length :");
		this.length = sc.nextDouble();
		System.out.println("Enter the width :");
		this.width = sc.nextDouble();
	}
	@Override
	public double area(){
		return length * width;
	}
	@Override
	public double peri(){
		return (2 * length) + (2 * width);
	}
	
}
