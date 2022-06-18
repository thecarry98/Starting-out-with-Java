package Algorithm;

import java.util.Scanner;

public class AW1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Y or N ?");
		String choice = keyboard.next();

		if(choice.toUpperCase().equals("Y")) {
			System.out.println("hihi");
			
		}else {
			System.out.println("ok");
		}
		
		System.out.println(choice.toUpperCase());
	}

}
