package Algorithm;

import java.util.Scanner;

public class AW10 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter the number : ");
		int i = keyboard.nextInt();
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toOctalString(i));
	}

}
