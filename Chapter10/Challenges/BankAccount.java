package Challenges;

public abstract class BankAccount {
	protected double balance;
	protected double numberOfDeposits;
	protected int numberOfWithdrawals=0;
	protected double AnnualInterestRate;
	protected double MonthlyServiceCharge;
	
	public BankAccount(double balance, double AnnualInterestRate) {
		this.balance = balance;
		this.AnnualInterestRate = AnnualInterestRate;
	}
	
	public void deposits(double money) {
		balance = balance+money;
		numberOfDeposits = numberOfDeposits+money;
	}
	
	public void withdraw(double money) {
		balance = balance - money;
		numberOfWithdrawals=numberOfWithdrawals+1;
	}
	
	public void calcInterest() {
		double monthlyInterestRate = AnnualInterestRate/12;
		double moneyInterest = balance*monthlyInterestRate;
		balance = balance + moneyInterest;
	}
	
	public void monthlyProcess() {
		calcInterest();
		numberOfWithdrawals=0;
		numberOfDeposits=0;
		MonthlyServiceCharge=0;
	}

}
