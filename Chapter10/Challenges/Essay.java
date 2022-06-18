package Challenges;

public class Essay extends GradedActivity{
	private int Grammar;
	private int Spelling;
	private int Correct_length;
	private int Content;
	
	public Essay() {
	}
	public void setGrammar(int g) {
		Grammar = g;
	}
	public void setSpelling(int s) {
		Spelling = s;
	}
	public void setCorrect_length(int cor) {
		Correct_length = cor;
	}
	public void setContent(int c) {
		Content = c;
	}
	
	public int getGrammar() {
		return Grammar;
	}
	
	public int getSpelling() {
		return Spelling;
	}
	
	public int getCorrect_length() {
		return Correct_length;
	}
	
	public int getContent() {
		return Content;
	}
	
	public void setScore() {
		score = Grammar + Spelling + Correct_length + Content;
	}

}
