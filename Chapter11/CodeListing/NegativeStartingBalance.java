package CodeListing;

@SuppressWarnings("serial")
public class NegativeStartingBalance extends Exception{
	public NegativeStartingBalance() {
		super("Error : negative starting balance ");
	}
	
	public NegativeStartingBalance(double amount) {
		super("Error : negative starting balance : " + amount);
	}

}
