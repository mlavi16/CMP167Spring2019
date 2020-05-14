package week6;

import java.util.Scanner;

public class Maya {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double n;
		double i = 1;
		double sum = 0;
		double avg;
		
		System.out.println("Enter in a value for \'n\':");
		n = scnr.nextDouble();
		
		while (i <= n) {
			sum += i;
			i++;
			
		}
		avg = sum / n;
		
		System.out.println(avg);

	}

}
