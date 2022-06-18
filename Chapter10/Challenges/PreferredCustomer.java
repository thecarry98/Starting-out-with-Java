package Challenges;

public class PreferredCustomer extends Customer{
	
	private double money;
	private int percent;
	public PreferredCustomer(String name, String address, int phoneNumber, int Customer_Number, boolean MailingList, double money) {
		super(name, address, phoneNumber, Customer_Number, MailingList);
		this.money = money;
	}
	
	public void setPercent() {
		if(money >=500 && money <1000) {
			percent = 5;
		}else if(money >=1000 && money<1500) {
			percent = 6;
		}else if(money>=1500 && money < 2000) {
			percent = 7;
		}else if(money >=2000) {
			percent =10;
		}
	}
	
	
	public double getMoney() {
		return money;
	}
	
	public int getPercent() {
		return percent;
	}



}
