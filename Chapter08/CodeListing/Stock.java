package CodeListing;

public class Stock {
	private String symbol;
	private double sharePrice;
	
	public Stock(String s,double sh){
		symbol = s;
		sharePrice = sh;
	}
	public Stock(Stock a) {
		symbol = a.symbol;
		sharePrice = a.sharePrice;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public double getSharePrice() {
		return sharePrice;
	}
	
	public String toString() {
		String tr = " symbol " + symbol + "sharePrice :" + sharePrice;
		return tr;	
	}
	
	public boolean check(Stock ob2) {
		boolean status;
		if(symbol.equals(ob2.symbol)&&sharePrice ==ob2.sharePrice) {
			status =true;
		}else
		{
			status =false;
		}
		return status;
	}
	
	public 	Stock copy() {
		Stock copyCompany = new Stock (symbol,sharePrice);
		return copyCompany;
	}

}
