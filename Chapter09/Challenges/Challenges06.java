package Challenges;

import java.util.Scanner;

public class Challenges06 {
	public static void main(String[] args) {
		String []name = {
				"Harrison, Rose","James, Jean","Smith, William","Smith, Brad"
		};
		int []phoneNumber = {
				5552234,5559098,5551785,5559224
		};
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first name :");
		String first = keyboard.nextLine();
		
		for (int i = 0; i < phoneNumber.length; i++) {
			if(name[i].startsWith(first)) {
				System.out.println(name[i] + " :  " + phoneNumber[i]);
			}
		}
	}

}
