package CodeListing;

import java.util.Scanner;

public class CubeDemo {
	public static void main(String[] args) {
		double length;
		double height;
		double width;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter the dimentions :");
		System.out.println("Length : ");
		length = keyboard.nextDouble();
		
		System.out.println("Height: ");
		height = keyboard.nextDouble();
		
		System.out.println("Width : ");
		width = keyboard.nextDouble();
		
		Cube myCube = new Cube(length,width,height);
		
		System.out.println("Here are the cube's properties. ");
		System.out.println("Length : " + myCube.getLength());
		
		System.out.println("Width : " + myCube.getWidth());
		System.out.println("Height : " + myCube.getHeight());
		System.out.println("Base Area : " + myCube.getArea());
		System.out.println("Surface Area : " + myCube.getSurfaceArea());
		System.out.println("Volume :" + myCube.getVolume());
	}

}
