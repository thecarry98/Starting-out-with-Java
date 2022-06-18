package Challenges;

import java.util.Scanner;

public class Challenges07 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		String address;
		int phoneNumber;
		int customerNumber;
		int w;
		boolean wants;
		
		System.out.println("Enter the customer's name : ");
		name = keyboard.nextLine();
		
		System.out.println("Enter the address :");
		address = keyboard.nextLine();
		
		System.out.println("Enter the phone number :");
		phoneNumber = keyboard.nextInt();
		
		System.out.println("Enter the customer's number :");
		customerNumber = keyboard.nextInt();
		
		do {
		System.out.println("Do you wish to be on a mailing list \n1 : YES \n2 : NO");
		w = keyboard.nextInt();
		}while(w!=1 && w!=2);
		
		if(w==1) {
			wants = true;
		}else {
			wants = false;
		}
		
		Customer cus1 = new Customer(name,address,phoneNumber,customerNumber,wants);
		cus1.setHihi();
		System.out.println(cus1.toString());
		
		
	}

}
