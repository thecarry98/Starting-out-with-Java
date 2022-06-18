package ProgrammingChallenges;

import java.util.Scanner;

public class ProChallenges09 {
	public static void main(String[] args) {
		int choise;
		do{
			choise = getMenu();
			if(choise ==1) {
				CalculateCircle();
			}else if(choise ==2){
				CalculateRetangle();
			}else if(choise ==3) {
				CalculateTriangle();
			}else if(choise ==4){
				System.out.println("Thank you !");
			}
		}while(choise !=4);
		
	}
	
	public static int getMenu() {
		int choise;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("=====================");
		System.out.println("Geometry Calculator :");
		System.out.println("1. Calculate the Area of Circle	");
		System.out.println("2. Calculate the Area of Retangle");
		System.out.println("3. Calculate the Area of Triangle");
		System.out.println("4. Quit");
		
		System.out.println("Enter your choise (1-4) : ");
		choise = keyboard.nextInt();

		while(choise <1 || choise >4) {
			System.out.println("Please again (1-4) :");
			choise = keyboard.nextInt();
		}
		return choise;
	}
	
	public static void CalculateCircle() {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the radius (>0):");
		double radius = keyboard.nextDouble();
		while(radius <= 0) {
			System.out.println("enter again :");
			radius = keyboard.nextDouble();
		}
		
		System.out.println("The area of Circle : " + Geometry.AreaOfTheCircle(radius));
		System.out.println("Du ma met vl ");
	}
	
	public static void CalculateRetangle() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length(>0) :");
		double length = keyboard.nextDouble();
		while(length <=0) {
			System.out.println("please again :");
			length = keyboard.nextDouble();
		}
		
		System.out.println("Please enter the width ( > 0)");
		double width = keyboard.nextDouble();
		while(width <=0) {
			System.out.println("please again :");
			width = keyboard.nextDouble();
		}
		
		System.out.println("------------------------------");
		System.out.println("The Area of The Retangle :" + Geometry.AreaOfTheRetangle(length, width));
		
		System.out.println("thoi tha em di");
	}
	
	public static void CalculateTriangle() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the base :(>0)");
		double base = keyboard.nextDouble();
		while(base <=0) {
			System.out.println("please again :");
			base = keyboard.nextDouble();
		}
		System.out.println("enter the height (>0):");
		double height = keyboard.nextDouble();
		while(height <=0) {
			System.out.println("please again :");
			height = keyboard.nextDouble();
		}
		System.out.println("-----------------------");
		System.out.println("The area of Triangle :" + Geometry.AreaOfTheTriangle(base, height));
	}

}
