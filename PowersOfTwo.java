package week6;
import java.util.Scanner;
public class PowersOfTwo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int power = 1;
		int n;
		
		System.out.println("Please enter value of n");
		n = scnr.nextInt();
		
		for (int i = 2; i <= n; i++) {
			System.out.println(power);
			power = power*2;
		}

	}

}
