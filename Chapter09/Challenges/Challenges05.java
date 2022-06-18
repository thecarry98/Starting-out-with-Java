package Challenges;

import java.util.Scanner;

public class Challenges05 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter the password");
		String string = keyboard.nextLine();
		
		Password check = new Password(string);
		while(!check.checkLength() || !check.checkCase() ||!check.checkNumber()) {
			System.out.println("Please enter the string : ");
			string = keyboard.nextLine();
		}
		
		if(check.checkLength() &&check.checkCase()&&check.checkNumber()) {
			System.out.println("Thank you ! ");
		}
		
		
	}

}
