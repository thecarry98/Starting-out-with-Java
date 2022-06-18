package CodeListing;

public class SportsCar {
	private CarType make;
	private CarColor color;
	private double price;	
	
	public SportsCar(CarType m, CarColor c, double p) {
		make = m;
		color = c;
		price = p ;
	}
	
	public CarType getMake() {
		return make;
	}
	
	public CarColor getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		String str = String.format(make + " " + color + " " + price);
		return str;
	}

}
