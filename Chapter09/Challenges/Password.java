package Challenges;

public class Password {
	private String string;
	public Password(String string) {
		this.string = string;
	}
	
	public boolean checkLength() {
		boolean checkLength = false;
		if(string.length() >=6) {
			checkLength = true;
		}
		return checkLength;
	}
	
	public boolean checkCase() {
		boolean checkCase = false;
		int upper = 0;
		for (int i = 0; i < string.length(); i++) {
			if(Character.isUpperCase(string.charAt(i))) {
				upper++;
			}
		}
		
		if(upper > 0 && upper<(string.length()-1)) {
			checkCase = true;
		}
		return checkCase;
	}
	
	public boolean checkNumber() {
		boolean checkNumber= false;
		int number = 0;
		
		for (int i = 0; i < string.length(); i++) {
			if(Character.isDigit(string.charAt(i))){
				number++;
			}
		}
		
		if(number > 0 && number < (string.length()-1)) {
			checkNumber = true;
		}
		
		return checkNumber;
	}

}
