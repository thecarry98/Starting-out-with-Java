package Algorithm;

public class AW1Circle {
	private double radius;
	private double area;
	
	public AW1Circle(double r) {
		radius =r;
	}
	public double getArea() {
		area = Math.PI*radius*radius;
		return area;
	}
	public double getRadius() {
		return radius;
	}
	//a
	public String toString() {
		String str = "the radius :" + radius + " Area :" + area;
		return str;
	}
	
	//b
	public boolean equals(AW1Circle ob) {
		if(radius== ob.getRadius()) {
			return true;
		}
		return false;
	}
	
	//c
	public boolean equalsArea(AW1Circle ob) {
		if(area > ob.getArea()) {
			return true;
		}
		return false;
	}
	

}
