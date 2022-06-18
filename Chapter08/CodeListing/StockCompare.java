package CodeListing;

public class StockCompare {
	public static void main(String[] args) {
		Stock company1 = new Stock("ABC",6.62);
		Stock company2 = new Stock("ABC",6.62);
		
		
		if(company1.check(company2)) {
			System.out.println("is the same");
		}else {
			System.out.println("is difference");
		}
		
		String a = "hihi";
		String b = "hihi";
		
		if(a.equals(b)) {
			System.out.println("kaka");
		}
	}
	

}
