package Challenges;

import java.util.Scanner;

public class Challenges08 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("moi nhap cuoi cac so cach nhau boi dau phay : ");
		String str = keyboard.nextLine();
		System.out.println(sum(str));
	}

	
	public static double sum(String str){
		String []tokens = str.split(",");
		double []token = new double[tokens.length];
		double sum=0;
		for (int i = 0; i < tokens.length; i++) {
			/*
			 * token[i] = Double.parseDouble(tokens[i]); sum +=token[i];
			 */
			
			token[i]= Double.valueOf(tokens[i]);
			sum +=token[i];
		}
		return sum;
	}

}
