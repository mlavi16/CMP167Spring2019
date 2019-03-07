package week6;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int n;
		int i = 1;
		int factorial = 1;
		
		System.out.println("Enter a value:");
		n = scnr.nextInt();
		
		while (i <= n) {
			factorial = factorial * i;
			
			i++;
		}
		
		System.out.println(factorial);
	}

}
