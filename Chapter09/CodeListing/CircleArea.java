package CodeListing;

import java.util.Scanner;

public class CircleArea {
	
	public static void main(String[] args) {
		double radius;
		double area;
		String input;
		char choice; 
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.println("Enter the circle 's radius : ");
			radius = keyboard.nextDouble();
			
			area = Math.PI*radius*radius;
			
			System.out.printf("the area is %.2f.\n",area);
			
			System.out.println("Do you want to do this again ? (Y or N) : ");
			input = keyboard.nextLine();
			choice = input.charAt(0);
		}while(Character.toUpperCase(choice) == 'Y');
	}


}
