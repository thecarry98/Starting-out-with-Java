package CodeListing;

public class AccountTest {
	public static void main(String[] args) {
		try {
			BankAccount acc = new BankAccount(-100.0);
		} catch (NegativeStartingBalance e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
