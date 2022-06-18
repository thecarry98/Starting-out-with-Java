package Challenges;

import java.util.Scanner;

public class Challenges04 {
	public static void main(String[] args) {
		
		int grammar;
		int spelling;
		int correct;
		int content;
		Essay hihi = new Essay();
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("What is Grammar's point : ");
		grammar = keyboard.nextInt();
		hihi.setGrammar(grammar);
		
		System.out.println("What is Spelling's point :");
		spelling = keyboard.nextInt();
		hihi.setSpelling(spelling);
		
		System.out.println("What is Correct's point : ");
		correct = keyboard.nextInt();
		hihi.setCorrect_length(correct);
		
		System.out.println("What is Content's point :");
		content = keyboard.nextInt();
		hihi.setContent(content);
		
		
		hihi.setScore();
		
		System.out.println("===========================");
		System.out.println("Grammar : " + hihi.getGrammar());
		System.out.println("Spelling : " + hihi.getSpelling());
		System.out.println("Correct : " + hihi.getCorrect_length());
		System.out.println("Content : " + hihi.getContent());
		
		System.out.println("----------------------------");
		System.out.println("Score : " + hihi.getScore());
		System.out.println("Letter : " + hihi.getGrade());
		
	}

}
