package Algorithm;

import java.util.Scanner;

public class AW4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter the String :");
		String str = keyboard.nextLine();
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				count++;
			}
			
		}
		System.out.println("so chu thuong xuat hien la : " + count);
	}

}
