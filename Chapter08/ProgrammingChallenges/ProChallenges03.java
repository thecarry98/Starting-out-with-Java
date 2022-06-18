package ProgrammingChallenges;

import java.util.Scanner;

public class ProChallenges03 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter the length :");
		double length = keyboard.nextDouble();
		System.out.println("enter the width :");
		double width = keyboard.nextDouble();
		System.out.println("enter the cost per square feet");
		double cost = keyboard.nextDouble();
		
		RoomDimention area = new RoomDimention(length,width);
		RoomCarpet costhihi = new RoomCarpet(area,cost);
		
		System.out.println("total of cost :" + costhihi.getCost());
	}

}
