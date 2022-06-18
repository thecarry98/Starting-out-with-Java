package ProgrammingChallenges;

public class RoomDimention {
	private double length;
	private double width;
	
	public RoomDimention(double length,double width) {
		this.length = length;
		this.width = width;
	}
	public double getArea() {
		return length*width;
	}

}
