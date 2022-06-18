package CodeListing;

import java.util.Scanner;

public class PassFailExamDemo {
	
	public static void main(String[] args) {
		int questions;
		int missed;
		double minPassing;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many questions : ");
		questions = keyboard.nextInt();
		
		System.out.println("How many questions - missed :");
		missed = keyboard.nextInt();
		
		System.out.println("what is th minimum ");
		minPassing = keyboard.nextDouble();
		
		PassFailExam exam = new PassFailExam(questions,missed,minPassing);
		
		System.out.println("Each question counts " + exam.getPointsEach() + " points ");
		
		System.out.println("The exam score is " + exam.getScore());
		
		System.out.println("The exam grade is " + exam.getGrade());
	}

}
