public class PromptBank {

	String [] questions;
	String [] statements;
	
	public PromptBank(){
		questions = new String[3];
		statements = new String[3];
	}

	public void populateStatementsArray(){
		statements[0] = "Tell me more about BLANK1 and BLANK2";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
	}
	public void populateQuestionsArray(){
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";		
	}	  
	public String getRandomStatementTrunk(){
		int randNum = (int) Math.floor(Math.random() * 3);
		return statements[randNum];
		//=fill in the method so it randomly selects the statement template
		//from the questions array ... hint use Math.random() to get the random index
		//so you can replace BLANK1 and BLANK2 with the appropriate words
	}
	public String getRandomQuestionTrunk(){
		int randNum = (int) Math.floor(Math.random() * 3);
		return questions[randNum];
	}
	
	
	
}