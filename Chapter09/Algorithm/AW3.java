package Algorithm;

import java.util.Scanner;

public class AW3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter the string :");
		String str = keyboard.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
			
		}
		
		System.out.println("so cac chu so xuat hien la : " + count);
	}

}
