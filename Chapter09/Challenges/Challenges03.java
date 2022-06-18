package Challenges;

import java.util.Scanner;

public class Challenges03 {
	public static void Capitalizer(String str) {
		String str2 = str;
		for (int i = 0; i < str.length(); i++) {
			if(str2.charAt(i)=='.') {
				char c = str2.charAt(i+1);
				c= Character.toUpperCase(str2.charAt(i+1));	
			}
		}
		System.out.println(str2);
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter the string : ");
		String str = keyboard.nextLine();
		
		Capitalizer(str);
	}

}
