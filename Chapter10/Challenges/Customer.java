package Challenges;

public class Customer extends Person{
	private int Customer_Number;
	private boolean MailingList;
	private String hihi;
	public void setHihi() {
		if(MailingList = true) {
			hihi = " YES";
		}else {
			hihi = "NO";
		}
	}
	
	public Customer(String name, String address, int phoneNumber, int Customer_Number, boolean MailingList) {
		super(name,address,phoneNumber);
		this.Customer_Number = Customer_Number;
		this.MailingList = MailingList;
	}
	
	public void setCustomer_Number(int number) {
		Customer_Number = number;
	}
	public int getCustomer_Number() {
		return Customer_Number;
	}
	
	
	public String toString() {
		String str = "1. Name : " + name + 
				"\n2. Address : " + address + 
				"\n3. Phone Number : "+ phoneNumber+
				"\n4. Customer's Number : " +Customer_Number+
				"\n5. To be on a mailing list : " + hihi;
		
		return str;
	}

}
