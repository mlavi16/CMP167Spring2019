import java.util.Scanner;

public class PatternTwo{
	public static void main(String[] args){
				Scanner scnr = new Scanner(System.in);
		int n;
		int n2;

		System.out.println("Please enter a number 1...9 : ");
		n = scnr.nextInt();
        n2 = n;
        
		for (int i = 0; i < n; i++){
		    for (int j = ((n2*2)-2); j > 0; j--){
		        System.out.print(" ");
		    }
			for (int k = i; k >= 0; k--){
    		    System.out.print(" ");
			    System.out.print(k + 1);  
			}
			System.out.println();
			n2--;

		}

	}
}