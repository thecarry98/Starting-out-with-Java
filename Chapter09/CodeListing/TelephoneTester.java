package CodeListing;

import java.util.Scanner;

public class TelephoneTester {
	public static void main(String[] args) {
		
		String phoneNumber;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter an unformatted telephone number : ");
		
		phoneNumber = keyboard.nextLine();
		
		System.out.println("Formatted : " + Telephone.format(phoneNumber));
		
		System.out.println("Enter a telephone number formatted as");
		System.out.println("(XXX)XXX-XXXX : ");
		
		phoneNumber = keyboard.nextLine();
		
		System.out.println("Unformatted : " + Telephone.unformat(phoneNumber));
	}

}
