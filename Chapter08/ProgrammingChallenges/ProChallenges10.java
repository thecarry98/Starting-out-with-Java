package ProgrammingChallenges;

import java.util.Scanner;

public class ProChallenges10 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("ban da do day xe : co 15 gallon");
		System.out.println("so odometer ban dau la :");
		int startOdo = keyboard.nextInt();
		
		FuelGause fuel = new FuelGause(15);
		Odometer odo = new Odometer(startOdo,fuel);
		
		System.out.println("START----");
		while(fuel.getGallons() !=0) {
			System.out.println("-------------------------------------");
			odo.IncrementMiles();
			System.out.println("so odo tren xe la : " + odo.getMileage());
			System.out.println("so mile da di la : " + (odo.getMileage()-startOdo));
			System.out.println("gallon con lai la : " + fuel.getGallons());
			
		}
	}

}
