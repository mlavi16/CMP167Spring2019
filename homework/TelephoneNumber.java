import java.util.Scanner;

public class TelephoneNumber{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		String phoneNumber;
		int i;
		char currChar;
		int maxLength = 7;
		int strLength = 0;
		boolean printDash = true;


		System.out.println("Please enter a telephone number using letters : ");
		phoneNumber = scnr.nextLine();
		for (i = 0; i < phoneNumber.length(); i++){
			currChar = phoneNumber.charAt(i);

			if ((strLength == 3) && printDash){
				System.out.print('-');
				printDash = false;
			}

			if (currChar >= '0' && currChar <= '9'){
				System.out.print(currChar);
				strLength++;
			}
			else if ( ((currChar >= 'a') && (currChar <= 'c')) || ((currChar >= 'A') && (currChar <= 'C')) ){
				System.out.print('2');
				strLength++;
			}
			else if ( ((currChar >= 'd') && (currChar <= 'f')) || ((currChar >= 'D') && (currChar <= 'F')) ){
				System.out.print('3');
				strLength++;
			}
			else if ( ((currChar >= 'g') && (currChar <= 'i')) || ((currChar >= 'G') && (currChar <= 'I')) ){
				System.out.print('4');
				strLength++;
			}
			else if ( ((currChar >= 'j') && (currChar <= 'l')) || ((currChar >= 'J') && (currChar <= 'L')) ){
				System.out.print('5');
				strLength++;
			}
			else if ( ((currChar >= 'm') && (currChar <= 'o')) || ((currChar >= 'M') && (currChar <= 'O')) ){
				System.out.print('6');
				strLength++;
			}
			else if ( ((currChar >= 'p') && (currChar <= 's')) || ((currChar >= 'P') && (currChar <= 'S')) ){
				System.out.print('7');
				strLength++;
			}
			else if ( ((currChar >= 't') && (currChar <= 'v')) || ((currChar >= 'T') && (currChar <= 'V')) ){
				System.out.print('8');
				strLength++;
			}
			else if ( ((currChar >= 'w') && (currChar <= 'z')) || ((currChar >= 'W') && (currChar <= 'Z')) ){
				System.out.print('9');
				strLength++;
			}
			//stop after 7 letters
			if (strLength == maxLength){
			    break;
			}
		}
		System.out.println();

	}
}