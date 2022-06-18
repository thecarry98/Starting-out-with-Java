package ProgrammingChallenges;

public class ParkingMeter {
	private int minutesPurchased;
	
	public ParkingMeter(int minutesPurchased) {
		this.minutesPurchased = minutesPurchased;
	}
	
	public ParkingMeter(ParkingMeter carparking) {
		minutesPurchased = carparking.getMinutesPurchased();
	}
	
	public void setMinutesPurchased(int minutesPurchased) {
		this.minutesPurchased = minutesPurchased;
	}
	
	public int getMinutesPurchased() {
		return minutesPurchased;
	}

}
