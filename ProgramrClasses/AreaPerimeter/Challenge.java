package AreaPerimeter;

import java.util.Scanner;

/**
 * Write a java program that uses an interface named Shape-
 * having functions double area() and double peri(). 
 * Use this interface to find the area and perimeter of 
 * circle, rectangle or square as per the choice of user.
 * 
 * Examples:
 * Menu
 * 1. Circle
 * 2. Rectangle
 * 3. Square
 * Enter your choice :1
 * Enter the radius :3.5
 * Area of Circle is :38.465
 * Perimeter of Circle is :21.98
 * 
 * Menu
 * 1. Circle
 * 2. Rectangle
 * 3. Square
 * Enter your choice :2
 * Enter the length :4
 * Enter the width :2
 * Area of Rectangle is :8
 * Perimeter of Rectangle is :12
 * 
 * Menu
 * 1. Circle
 * 2. Rectangle
 * 3. Square
 * Enter your choice :4
 * Enter the side :2.2
 * Area of Square is :4.840000000000001
 * Perimeter of Square is :8.8 * 
 * 
 *  
 *
 */

public class Challenge {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double area,peri;
		System.out.print("Menu-\n1. Circle\n2. Rectangle\n3. Square\nEnter your choice :");
		int ch=sc.nextInt();

		switch(ch){
		case 1:
			Circle circ=new Circle(sc);
			area = circ.area();
			peri=circ.peri();
			System.out.print("Area of Circle is :"+area+"\nPerimeter of Circle is :"+peri);
			break;
		case 2:
			Rec rec=new Rec(sc);
			area = rec.area();
			peri=rec.peri();
			System.out.print("Area of Rectangle is :"+area+"\nPerimeter of Rectangle is :"+peri);
			break;
		case 3:
			Square sqr=new Square(sc);
			area = sqr.area();
			peri=sqr.peri();
			System.out.print("Area of Square is :"+area+"\nPerimeter of Square is :"+peri);
			break;
		default:
			System.out.print("Wrong choice");
		}
	}
}
