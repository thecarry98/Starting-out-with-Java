package ProgrammingChallenges;

import java.util.Scanner;

public class ProChallenges06 {
	public static void main(String[] args) {
		//có cả bài 7... Retail,CashRegister..
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("so luong ban hang la :");
		int q = keyboard.nextInt();

		RetailItem retail = new RetailItem();
		CashRegister cash = new CashRegister(retail,q);
		System.out.println(retail.getPrice());


		System.out.println("---------------");
		System.out.println("SALES RECEIPT :");
		System.out.println("Unit Price : $" + retail.getPrice());
		System.out.println("Quantity : " + q);
		System.out.println("Subtotal : $" + cash.getSubtotal());
		System.out.println("Sales Tax : $" + cash.getTax());
		System.out.println("Total : $" + cash.getTotal());
		
	}

}
