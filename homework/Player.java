import java.util.Scanner;

public class Player{
	//private ?????
	int[] jerseyNum = new int[5];
	int[] playerRating = new int[5];
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		Player player = new Player();
		char input;

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter player " + (i+1) + "'s jersey number: ");
			jerseyNum[i] = scnr.nextInt();
			System.out.println("Enter player " + (i+1) + "'s rating: ");
			playerRating[i] = scnr.nextInt();
		}
		do {
			player.showMenu();
			input = scnr.next().charAt(0);
			switch (input){
				case 'o':
					player.outputRoster();
					break;
				case 'u':
					player.updatePlayerRating();
					break;
				case 'a':
					player.outputPlayersAboveRating();
					break;
			}
		} while (input != 'q');




	}
	public void showMenu(){
		System.out.println("MENU");
		//FIXME
	}
	public void outputRoster(){
		//FILLME
	}
	public void updatePlayerRating(){

	}
	public void outputPlayersAboveRating(){

	}
}