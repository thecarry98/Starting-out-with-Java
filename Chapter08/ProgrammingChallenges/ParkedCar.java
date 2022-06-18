package ProgrammingChallenges;

public class ParkedCar {
	private String make,model,color,licenseNumber;
	private int minutes;
	
	public ParkedCar(String make,String model,String color,String licenseNumber,int minutes) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.minutes = minutes;
	}
	public ParkedCar(ParkedCar car) {
		make = car.getMake();
		model = car.getModel();
		color = car.getModel();
		licenseNumber = car.getLicenseNumber();
		minutes = car.getMinutes();
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color= color;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public String getMake() {
		return make;
	}
	public String getColor() {
		return color;
	}
	public String getModel() {
		return model;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public int getMinutes() {
		return minutes;
	}

}
