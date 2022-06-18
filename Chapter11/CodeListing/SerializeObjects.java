package CodeListing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeObjects {
	public static void main(String[] args) throws IOException{
		double balance;
		final int NUM_ITEMS = 3;
		
		Scanner keyboard = new Scanner(System.in);
		
		BankAccount[] accounts = new BankAccount[NUM_ITEMS];
		
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Enter the balance for account " + (i+1) + " : ");
			balance = keyboard.nextDouble();
			accounts[i] = new BankAccount(balance);
			
		}
		
		FileOutputStream outStream = new FileOutputStream("object");
		
		ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
		
		for (int i = 0; i < accounts.length; i++) {
			objectOutputFile.writeObject(accounts[i]);
		}
		
		objectOutputFile.close();
		
		System.out.println("the serialized objects were written..");
	}

}
