package Algorithm;

import java.util.Scanner;

public class AW2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter the string : ");
		String str = keyboard.nextLine();
		/*
		 * int count=0; char c; for (int i = 0; i < str.length(); i++) { c =
		 * str.charAt(i); if(c == ' ') { count++; } }
		 */
		char c;
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if(Character.isWhitespace(c)) {
				count++;
			}
		}
		System.out.println("so khoang trong la : " + count);
	}

}
