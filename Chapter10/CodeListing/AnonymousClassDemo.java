package CodeListing;

import java.util.Scanner;

public class AnonymousClassDemo {
	public static void main(String[] args) {
		int num;
		Scanner keyboard = new Scanner(System.in);
		
		IntCalculator square = new IntCalculator() {
			@Override
			public int calculate(int number) {
				// TODO Auto-generated method stub
				return number*number;
			}};
		
		System.out.println("Enter an integer number : ");
		num = keyboard.nextInt();
		
		System.out.println("The sqare is " + square.calculate(num));
	}

}
