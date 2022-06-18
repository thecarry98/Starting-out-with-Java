package Challenges;

public class SavingsAccount extends BankAccount{
	private boolean active;
	
	public SavingsAccount(double balance,double anInterestRate) {
		super(balance, anInterestRate);
		if(balance<25) {
			active = false;
		}else{
			active = true;
		}
	}
	
	public void withdraw(double money) {
		if(active = true) {
			super.withdraw(money);
		}else {
			System.out.println("Not active");
		}
		
	}
	
	public void deposit(double money) {
		super.deposits(money);
		if(balance>25) {
			active = true;
		}else {
			active = false;
		}
	}
	
	public void monthlyProcess() {
		if(numberOfWithdrawals >4) {
			MonthlyServiceCharge += numberOfWithdrawals -4;
		}else {
			super.monthlyProcess();
		}
		
		if(balance<25) {
			active = false;
		}
	}
	
	

}
