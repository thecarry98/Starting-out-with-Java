package Challenges;

public class ProductionWorker extends Employee{
	private int Shift;
	private double HourlyPayRate;
	
	public void setShift(int a) {
		Shift =a;
	}
	public void setHourlyPayRate(double pay) {
		HourlyPayRate = pay;
	}
	
	public int getShift() {
		return Shift;
	}
	public double getHourlyPayRate() {
		return HourlyPayRate;
	}
}
