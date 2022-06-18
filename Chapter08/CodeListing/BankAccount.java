package CodeListing;

public class BankAccount {
	private double balance;
	
	public BankAccount(double b) {
		balance = b;
	}
	
	
	public void setBalance(double b) {
		balance =b;
	}
	public void deposit(double amount) {
		balance +=amount;
	}
	
	public double getBalance() {
		return balance;	
	}
	
	

}
