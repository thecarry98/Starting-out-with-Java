package Challenges;

public class Ship {
	protected String nameShip;
	protected String yearOfShip;
	
	public Ship(String name, String year) {
		nameShip = name;
		yearOfShip = year;
	}
	
	public void setNameShip(String name) {
		nameShip = name;
	}
	
	public void setYearOfShip(String year) {
		yearOfShip = year;
	}
	
	public String getNameShip() {
		return nameShip;
	}
	
	public String getYearOfShip() {
		return yearOfShip;
	}
	
	public String toString() {
		String str = "1. Name of Ship : " + nameShip +
				"\n2. Year of Ship : " + yearOfShip;
		
		return str;
	}

}
