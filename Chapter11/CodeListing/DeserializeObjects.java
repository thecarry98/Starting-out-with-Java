package CodeListing;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeObjects{
	public static void main(String[] args) throws Exception{
		double balance;
		final int NUM_ITEMS = 3;
		
		FileInputStream inStream = new FileInputStream("object");
		ObjectInputStream obInputFile = new ObjectInputStream(inStream);
		
		BankAccount []accounts = new BankAccount[NUM_ITEMS];
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = (BankAccount)obInputFile.readObject();
		}
		
		obInputFile.close();
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Accounts " + (i+1) + ":" + accounts[i].getBalance());
		}
	}

}
