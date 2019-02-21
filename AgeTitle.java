package week4;

import java.util.Scanner;

public class AgeTitle {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userAge;
		
		System.out.println("Enter your age:");
		userAge = scnr.nextInt();
		
		if (userAge < 19) {
			System.out.println("Teenager");
		} 
		else if (userAge <= 25) {
			System.out.println("Young Adult");
		}
		else {
			System.out.println("Adult");
		}
	}

}
