package CodeListing;

public class Rectangle {
	private double length;
	private double width;
	
	/*
	 * public void setLength(double len) { length = len; }
	 * 
	 * public void setWidth(double w) { width = w; }
	 */
	public Rectangle(double len,double w) {
		length = len;
		width = w;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	public double getArea() {
		double area = length*width;
		return area;
	}

}
