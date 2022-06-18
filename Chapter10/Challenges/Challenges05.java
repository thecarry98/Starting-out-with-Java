package Challenges;

import java.util.Scanner;

public class Challenges05 {
	public static void main(String[] args) {
		int ALabScore;
		int missed;
		int EssayScore;
		int finalMissed;
		
		Scanner keyboard = new Scanner(System.in);
		
		CourseGrades grade = new CourseGrades();
		System.out.println("Let's go");
		
		System.out.println("=====================");
		System.out.println("Assigned a lab score : ");
		ALabScore = keyboard.nextInt();
		GradedActivity one = new GradedActivity();
		one.setScore(ALabScore);
		grade.setLab(one);
		
		
		System.out.println("-----");
		System.out.println("How many questions - missed ?");
		missed = keyboard.nextInt();
		PassFailExam two = new PassFailExam(10, missed, 70);
		grade.setPassFailExam(two);
		
		
		System.out.println("-----");
		System.out.println("An essay score : ");
		EssayScore = keyboard.nextInt();
		Essay three = new Essay();
		three.setScore(EssayScore);
		grade.setEssay(three);
		
		System.out.println("-----");
		System.out.println("A final exam : ");
		System.out.println("Questions - missed : ");
		finalMissed = keyboard.nextInt();
		FinalExam four = new FinalExam(50,finalMissed);
		grade.setFinalExam(four);
		
		System.out.println(grade.toString());
		
		
		
	}

}
