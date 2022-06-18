package ProgrammingChallenges;

import java.util.Scanner;

public class ProChallenges01 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Area area = new Area();
		
		System.out.println("enter the radius of circle :");
		System.out.println("the area of circle : " + area.areaOfCircle(keyboard.nextDouble()));
		
		System.out.println("-----------------");
		System.out.println("enter the width of retangle :");
		double width = keyboard.nextDouble();
		System.out.println("enter the length of retangle :");
		double length = keyboard.nextDouble();
		
		System.out.println("the area of retangle :" + area.areaOfRetangle(width, length));
		
		System.out.println("-------------");
		System.out.println("enter the radius of cylinder :");
		double r = keyboard.nextDouble();
		System.out.println("enter the height of cylinder :" );
		double h = keyboard.nextDouble();
		
		System.out.println("the area of cylinder : " + area.areaOfCylinder(r, h));
	}

}
