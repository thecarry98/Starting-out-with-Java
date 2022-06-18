package Algorithm;

import java.util.Scanner;

public class AW5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter the string : ");
		String str = keyboard.nextLine();
		str = str.toUpperCase();
		if(str.endsWith(".COM")) {
			System.out.println("hihi");
		}else {
			System.out.println("kiki");
		}
	}

}
