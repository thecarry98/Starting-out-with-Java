package CodeListing;
import javax.swing.JOptionPane;
public class ReturnObject {
	public static void main(String[] args) {
		BankAccount account;
		account = getAccount();
		
		JOptionPane.showMessageDialog(null, "the account "+account.getBalance());
		System.exit(0);
	}
	
	public static BankAccount getAccount() {
		String input;
		double balance;
		
		input = JOptionPane.showInputDialog("enter the account :");
		balance = Double.parseDouble(input);
		return new BankAccount(balance);
	}
	
}
