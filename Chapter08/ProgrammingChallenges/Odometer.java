package ProgrammingChallenges;

public class Odometer {
	private final int maxOdo = 999999;
	private final int MPG = 24;
	private FuelGause fuel;
	private int mileage;
	private int startMileage;
	
	public Odometer(int mileage,FuelGause fuel) {
		this.startMileage = mileage;
		this.mileage = mileage;
		this.fuel = fuel;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void IncrementMiles() {
		if(mileage < 999999) {
			mileage ++;
		}else {
			mileage =0;
		}
		
		int a = mileage - startMileage;
		if(a%MPG==0) {
			fuel.DecrementFuel();
		}
	}
	

}
