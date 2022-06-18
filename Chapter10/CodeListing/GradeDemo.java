package CodeListing;

import javax.swing.JOptionPane;

public class GradeDemo {
	public static void main(String[] args) {
		String input;
		double testScore;
		
		GradedActivity grade = new GradedActivity();
		
		input = JOptionPane.showInputDialog("enter the test score :");
		testScore = Double.parseDouble(input);
		
		grade.setScore(testScore);
		
		JOptionPane.showMessageDialog(null, "the letter grade is  :" + grade.getGrade());
	}

}
