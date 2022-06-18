package ProgrammingChallenges;

import java.util.Scanner;

public class ProChallenges04 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter the lengh 1: ");
		double length1 = keyboard.nextDouble();
		
		System.out.println("enter the width 1 :");
		double width1 = keyboard.nextDouble();
		
		LandTract area1 = new LandTract(length1,width1);
		System.out.println("the area of land 1 :" + area1.getArea());
		
		System.out.println("--------------------------");

		
		System.out.println("enter the lengh 2: ");
		double length2 = keyboard.nextDouble();
		
		System.out.println("enter the width 2 :");
		double width2 = keyboard.nextDouble();
		
		LandTract area2 = new LandTract(length2,width2);
		
		System.out.println("the area of land 2 :" + area2.getArea());
		
		System.out.println("--------------------------");
		if(area1.getArea()==area2.getArea()) {
			System.out.println("equal");
		}
		else {
			System.out.println("NOT equal");
		}
	}


}
