package CodeListing;

public class Retangle {
	private double length;
	private double width;
	
	public Retangle(double l,double w) {
		length = l;
		width = w;
	}
	
	public void setLength(double l) {
		length = l;
	}
	public void setWidth(double w) {
		width = w;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return length*width;
	}

}
