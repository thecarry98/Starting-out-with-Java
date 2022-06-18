package ProgrammingChallenges;

public class LandTract {
	private double length;
	private double width;
	private double area;
	
	public LandTract(double length,double width) {
		this.length = length;
		this.width = width;
	}
	public double getArea() {
		area = length*width;
		return area;
	}
	
	public String toString() {
		String str = " \nthe length : " + length + "\n the width :" + width + "\nthe area :" + area;
		return str;
	}

}
