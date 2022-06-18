package CodeListing;

public class Subclass3 extends Superclass3{
	@Override
	public void showValue(int arg) {
		
		super.showValue(arg);
		System.out.println("SUBCLASS : "  + "The int argument was : "+ arg);
		
	}
	
	public void showValue(double arg) {
		System.out.println("SUBCLASS : " + "The double argument was " + arg);
	}
	
	public void showValue(String arg) {
		System.out.println("subclass : " + arg);
	}

}
