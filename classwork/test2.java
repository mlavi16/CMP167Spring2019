/*
 * Author: Maya Lavi
 * Created: 2.7.19
 * Description: This program finds the average of three numbers
 */


package mayaWeek2;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		double avg;
		
		System.out.println("Input any three numbers to find their average:");
		num1 = scnr.nextDouble();
		num2 = scnr.nextDouble();
		num3 = scnr.nextDouble();
		avg = (num1 + num2 + num3)/3;
		System.out.println("Your average is: " + avg);
	}
}
