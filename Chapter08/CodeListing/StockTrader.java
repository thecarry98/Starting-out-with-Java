package CodeListing;

import java.util.Scanner;

public class StockTrader {
	public static void main(String[] args) {
		int sharesToBuy;
		
		Stock xyzCompany = new Stock("XYZ", 9.62);
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("XYZ stock is currently : "  + xyzCompany.getSharePrice());
		
		System.out.println("how many shares do you want to buy : ");
		sharesToBuy = keyboard.nextInt();
		
		StockPurchase buy = new StockPurchase(xyzCompany,sharesToBuy);
		
		System.out.println("cost: " + buy.getCost());
	}

}
