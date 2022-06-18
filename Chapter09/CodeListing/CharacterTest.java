package CodeListing;
import javax.swing.JOptionPane;
public class CharacterTest {
	public static void main(String[] args) {
		String input;
		input = JOptionPane.showInputDialog("Enter any single character");
		char ch = input.charAt(1);
		System.out.println(ch);
		
		if(Character.isDigit(ch)) {
			JOptionPane.showMessageDialog(null, "is a digit");
		}
		
		if(Character.isLetter(ch)) {
			JOptionPane.showMessageDialog(null, "is letter");
		}
		
		if(Character.isLetterOrDigit(ch)) {
			JOptionPane.showMessageDialog(null, "is letter or digit");
		}
		
		if(Character.isLowerCase(ch)) {
			JOptionPane.showMessageDialog(null, "is lower case");
		}
		
		if(Character.isUpperCase(ch)) {
			JOptionPane.showMessageDialog(null, "is upper case");
		}
		
		if(Character.isSpaceChar(ch)) {
			JOptionPane.showMessageDialog(null, "is space char");
		}
		
		if(Character.isWhitespace(ch)) {
			JOptionPane.showMessageDialog(null, "is white space");
		}
	}

}
