package CodeListing;

import javax.swing.JOptionPane;

public class FinalExamDemo {
	public static void main(String[] args) {
		String input;
		int questions;
		int missed;
		
		input = JOptionPane.showInputDialog("How many questions on the final exam");
		questions = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("How many questiosn MISSED");
		missed = Integer.parseInt(input);
		
		FinalExam exam = new FinalExam(questions,missed);
		
		JOptionPane.showMessageDialog(null, "Each questions counts" + exam.getPointsEach() + "points \nHte exam score is :" + exam.getScore()
		+ "\nThe exam grade is : " + exam.getGrade());
		
		System.exit(0);
	}	

}
