package Algorithm;

import java.util.Scanner;

public class AW7 {
	public static void main(String[] args) {
		//StringBuilder strb = new StringBuilder();
		Scanner keyboard= new Scanner(System.in);
		System.out.println("enter the String : ");
		String str= keyboard.nextLine();
	
		for (int i = 0; i < str.length(); i++) {
			//char c = str.charAt(i);
			if(str.charAt(i)== 't') {
				str.charAt(i) = Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(str);

	}

}
