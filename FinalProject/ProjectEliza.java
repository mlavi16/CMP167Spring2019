import java.util.Scanner;

public class ProjectEliza{

	Scanner scnr;
	PromptBank prompts;
	String[] blanks = {"blank1", "blank2"};

	public static void main(String[] args){
		ProjectEliza eliza = new ProjectEliza();
		eliza.runProgram();
	}	
	
	public void runProgram(){
		scnr = new Scanner(System.in);
		prompts = new PromptBank();
		prompts.populateStatementsArray();
		prompts.populateQuestionsArray();

		char lastChar;
		boolean doAgain = true;
		
		while (doAgain){
			introduction();
			while (true){
				lastChar = findBlanks();
				if (lastChar != '\n') {
					askQuestionsOrStatements(lastChar);
				}
				else {
					System.out.println("Do you want to run the session again?");
					if (scnr.nextLine().equalsIgnoreCase("No")){
						System.out.println("Goodbye, until next time");
						doAgain = false;
						break;
					}
					else {
						break;
					}

				}
			}
		}

	}
	public void introduction(){
		String name;
		System.out.println("Hello, my name is Eliza. What is your name?");
		name = scnr.nextLine();
		System.out.println("Hello, " + name + ". Tell me what is on your mind today in 1 sentence.");

	}
	public char findBlanks(){
		String blank1 = "";
		String blank2 = "";
		String input;
		char currChar;
		int i = 0;
		int word2Length = 0;
		char lastChar;

		input = scnr.nextLine();
			if (input.equalsIgnoreCase("exit")){
				return '\n';
			}
		lastChar = input.charAt(input.length() - 1);
		currChar = input.charAt(i);
		while (!Character.isWhitespace(currChar) && i < input.length()){
			currChar = input.charAt(i);
			if ((currChar == '!') || (currChar == '?') || (currChar == '.')){
				i++;
				break;
			}
			if (!Character.isWhitespace(currChar) && i < input.length()){
				blank1 += currChar; 
				i++;
			}
		}
		blanks[0] = blank1;
		
		if (i == input.length()){
			blanks[1] = blank1;
			return lastChar;
		}
		
		i = input.length() - 1;
		currChar = input.charAt(i);
		while (!Character.isWhitespace(currChar)){
			i--;
			currChar = input.charAt(i);
			word2Length++;
		}
		i += 1;
		currChar = input.charAt(i);
		
		for(int x = 0; x < word2Length; x++){
			currChar = input.charAt(i);
			if ((currChar == '!') || (currChar == '?') || (currChar == '.')){
				break;
			}
			blank2 += currChar;
			i++;
		}
		blanks[1] = blank2;
		return lastChar;
	}
	public void askQuestionsOrStatements(char lastChar){
		String sentence = "";
		if (lastChar == '!'){
			System.out.print("WOW! Dramatic! ");
		}
		if (lastChar == '?'){
			sentence = prompts.getRandomQuestionTrunk();
		}
		else {
			sentence = prompts.getRandomStatementTrunk();
		}
		sentence = sentence.replaceAll("BLANK1", blanks[0]);
		sentence = sentence.replaceAll("BLANK2", blanks[1]);
		System.out.println(sentence);
	}
}