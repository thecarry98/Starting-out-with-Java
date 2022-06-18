package CodeListing;
import java.io.Serializable;
public class BankAccount implements Serializable{
	private double balance;
	
	public BankAccount() {
		balance = 0.0;
	}
	public BankAccount(double starBalance) {
		balance = starBalance;
	}
	public BankAccount(String str) {
		balance = Double.parseDouble(str);
	}
	public void deposit(double amount) {
		balance +=amount;
	}
	public void deposit(String str) {
		balance += Double.parseDouble(str);
	}
	
	public void Withdraw(double amount) {
		balance -= amount;
	}
	public void  Withdraw(String str) {
		balance -= Double.parseDouble(str);
	}
	
	public void setBalance(double b) {
		balance =b;
	}
	
	public void setBalance(String str) {
		balance = Double.parseDouble(str);
	}
	
	public double getBalance() {
		return balance;
	}
	

}
