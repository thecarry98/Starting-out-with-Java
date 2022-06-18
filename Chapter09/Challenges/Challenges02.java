package Challenges;

import java.util.Scanner;

public class Challenges02 {
	public static int WordCounter(String str) {
		String[]array = str.split(" ");
		
		return array.length;
	}
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("moi nhap chuoi : ");
		String str = keyboard.nextLine();
		
		System.out.println("so luong tu trong chuoi la : " + WordCounter(str));
	}

}
