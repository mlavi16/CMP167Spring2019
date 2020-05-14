/*
 * Area.java
 * Maya Lavi
 * 3.12.19
 * This program implements area functions/methods
 */

import java.util.Scanner;

public class Area {
	/* 
	 * getRectArea: int 
	 * Parameters: int width, int length
	 * Calculate: rect area
	 */
	public static int getRectArea(int width, int length) {
		return width * length;	
	}
	/* 
	 * getCircleArea: double 
	 * Parameters: int radius
	 * Calculate: circle area
	 */
	public static double getCircleArea(int radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	/* 
	 * getTritArea: int 
	 * Parameters: int base, int height
	 * Calculate: tri area
	 */
	public static int getTriArea(int base, int height) {
		return base * height / 2;
	}
	
	
	public static void rectArea() {
		/*
		 * rectArea: void
		 * inputs: width and length
		 * process: area = width * length
		 * output: area
		 */
		Scanner scnr = new Scanner(System.in);
		double width;
		double length;
		double area;
		//input
		System.out.println("Enter width: ");
		width = scnr.nextDouble();
		System.out.println("Enter length: ");
		length = scnr.nextDouble();
		//process/calculation
		area = width * length;
		//output
		System.out.println("Area of rectangle is: " + area);
	}
	public static void circleArea() {
		/*
		 * circleArea: void
		 * inputs: radius
		 * process: area = PI * radius^2
		 * output: area
		 */
		Scanner scnr = new Scanner(System.in);
		double radius;
		double area;
		//input
		System.out.println("Enter radius: ");
		radius = scnr.nextDouble();
		//process/calculation
		area = Math.PI * Math.pow(radius, 2);
		//output
		System.out.println("Area of circle is: " + area);
	}
	public static void triArea() {
		/*
		 * triArea: void
		 * inputs: height and base
		 * process: area = base * height * (1/2)
		 * output: area
		 */
		Scanner scnr = new Scanner(System.in);
		double height;
		double base;
		double area;
		//inputs
		System.out.println("Enter height: ");
		height = scnr.nextDouble();
		System.out.println("Enter base length: ");
		base = scnr.nextDouble();
		//process/calculations
		area = (base * height) / 2;
		//output
		System.out.println("Area of triangle is: " + area);
		
		
		
	}
	
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter width and length for rectangle: ");
		int width = scnr.nextInt();
		int length = scnr.nextInt();
		int rectArea = getRectArea(width, length);
		System.out.println("Area of rectangle: " + rectArea);
		
		System.out.println("Enter radius for circle: ");
		int radius = scnr.nextInt();
		double circArea = getCircleArea(radius);
		System.out.println("Area of circle: " + circArea);
		
		System.out.println("Enter base and height of triangle: ");
		int base = scnr.nextInt();
		int height = scnr.nextInt();
		int triArea = getTriArea(base, height);
		System.out.println("Area of triangle: " + triArea);
		
	}

}