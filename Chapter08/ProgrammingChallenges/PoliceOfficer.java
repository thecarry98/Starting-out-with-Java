package ProgrammingChallenges;

public class PoliceOfficer {
	private String policeOfficersName;
	private String policeBadgeNumber;
	
	private ParkedCar car;
	private ParkingMeter park;
	private ParkingTicket ob;
	
	public PoliceOfficer(String policeOfficersName, String policeBadgeNumber) {
		this.policeBadgeNumber = policeBadgeNumber;
		this.policeOfficersName = policeOfficersName;
	}
	
	public boolean issue(ParkingTicket ob) {
		if(!ob.check()) {
			return true;
		}
		return false;
	}
	
	//mệt quá thôi éo làm đâu
	
	

}
