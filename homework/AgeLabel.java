import java.util.Scanner;

public class AgeLabel{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		int numDays;
		int numYears;

		System.out.println("Enter an age in number of days :");
		numDays = scnr.nextInt();
		numYears = numDays / 365;

		if (numYears <= 1){
			System.out.println("You are an infant");
		}
		else if (numYears <= 3){
			System.out.println("You are a toddler");
		}
		else if (numYears <= 12){
			System.out.println("You are a child");
		}
		else if (numYears <= 19){
			System.out.println("You are a teenager");
		}
		else if (numYears <= 21){
			System.out.println("You are a young adult");
		}
		else if (numYears <= 50){
			System.out.println("You are an adult");
		}
		else if (numYears <= 65){
			System.out.println("You are middle aged");
		}
		else if (numYears > 65){
			System.out.println("You are a senior citizen");
		}

	}
}