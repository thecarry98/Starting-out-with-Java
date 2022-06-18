package ProgrammingChallenges;

public class RetailItem {
	private String Description;
	private int unitsOnhand;
	private double Price;
	
	public RetailItem() {
		Description = "";
		unitsOnhand = 0;
		Price = 10.00;
	}


	
	  public RetailItem(RetailItem ob) 
	  { 
		  Description = ob.getDescription();
		  unitsOnhand = ob.getUnitsOnhand(); 
		  Price = ob.getPrice(); 
		  
	  }
	 
	/*
	 * public RetailItem(RetailItem ob) {
	 * 
	 * }
	 */

	
	public void setDescription(String des) {
		Description = des;
	}
	public void setUnitsOnhand(int unit) {
		unitsOnhand = unit;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	public String getDescription() {
		return Description;
	}
	public int getUnitsOnhand() {
		return unitsOnhand;
	}
	public double getPrice() {
		return Price;
	}
	
	
	

}
