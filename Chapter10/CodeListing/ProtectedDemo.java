package CodeListing;

import javax.swing.JOptionPane;

public class ProtectedDemo {
	
	public static void main(String[] args) {
		String input;
		int questions;
		int missed;
		
		input = JOptionPane.showInputDialog("How many question : ? ");
		questions = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("How many questions - missed : " );
		missed = Integer.parseInt(input);
		
		FinalExam2 exam = new FinalExam2(questions, missed);
		
		JOptionPane.showMessageDialog(null, "Each questions counts " + exam.getPointsEach() + " points \nThe exam score is " + exam.getScore() + "\n The exam grade is " + exam.getGrade());
		
		System.exit(0);
	}

}
