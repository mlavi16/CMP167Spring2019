import java.util.Scanner;

public class FirstLoop{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		int num = 1;

		while (num <= 30){
			//num = odd
			if ((num % 2) == 1){
				System.out.printf("%d is an odd number\n", num);
			}
			//num is even
			else{
				System.out.printf("%d is an even number\n", num);
			}
			//num is a multiple of 3
			if ((num % 3) == 0){
				System.out.printf("%d is divisible by 3\n", num);
			}
			//num is a multiple of 5
			if ((num % 5) == 0){
				System.out.printf("%d is divisible by 5\n", num);
			}
			if ((num % 7) == 0){
				System.out.printf("%d is divisible by 7\n", num);
			}
			if ((num % 9) == 0){
				System.out.printf("%d is divisible by 9\n", num);
			}

			num ++;
		}


	}
}