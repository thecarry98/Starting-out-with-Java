package ProgrammingChallenges;

public class ParkingTicket {
	private ParkedCar Car;
	private ParkingMeter CarParking;
	
	private int theAmountOfTheFine;
	
	public ParkingTicket(ParkedCar car,ParkingMeter carparking) {
		Car = new ParkedCar(car);
		CarParking = new ParkingMeter(carparking);
	}
	
	public boolean check() {
		if(Car.getMinutes()- CarParking.getMinutesPurchased() > 0) {
			return true;
		}
		return false;
	}
	
	public void setTheAmountOfTheFine() {
		int m = Car.getMinutes()- CarParking.getMinutesPurchased();
		if(m <=0) {
			theAmountOfTheFine = 25;
		}else {
			int n = m%CarParking.getMinutesPurchased();
			theAmountOfTheFine = 25 +(n+1)*10;
		}
	}
	public int getTheAmountOfTheFine() {
		return theAmountOfTheFine;
	}
	

}
