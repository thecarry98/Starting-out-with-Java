package Challenges;

public class CruiseShip extends Ship{
	private int maxPassengers;
	
	public CruiseShip(String name,String year,int max) {
		super(name,year);
		maxPassengers = max;
	}
	
	public void setMaxPassengers(int max) {
		maxPassengers = max;
	}
	
	public int getMaxPassengers() {
		return maxPassengers;
	}
	
	@Override
	public String toString() {
		String str = "Name : " + nameShip +
				"\nmax passengers : " + maxPassengers;
		return str;
	}
	

}
