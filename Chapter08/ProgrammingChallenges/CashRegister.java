package ProgrammingChallenges;

public class CashRegister {
	
	private RetailItem retail;
	private int quantity;
	private double Subtotal;
	
	private final double tax = 3.00;
	public CashRegister(RetailItem retai, int m) {
		retail = new RetailItem(retai);
		quantity = m;
	}
	
	public double getSubtotal() {
		Subtotal = quantity*retail.getPrice();
		return Subtotal;
	}
	
	public double getTax() {
		return tax;
	}
	public double getTotal() {
		return tax+Subtotal;
		
	}
	

}
