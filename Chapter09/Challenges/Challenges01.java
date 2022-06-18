package Challenges;

import java.util.Scanner;

public class Challenges01 {
	public static void backward(String str) {
		
		
		char[]array = str.toCharArray();
		//int i =0;
		//int j =array.length-1;
		
		/*
		 * for (int i = 0; i < array.length; i++) { for (int j = array.length-1 ; j >=0;
		 * j--) { if(i<j) { char c = ' '; c = array[i]; array[i]= array[j]; array[j]= c;
		 * } } } for(char c : array) { System.out.print(c); }
		 */
		int i =0;
		int j = array.length -1;
		do {
			char tg = ' ';
			tg = array[i];
			array[i] = array[j];
			array[j] = tg;
			
			i++;
			j--;
		}while(i<j);
		
		for(char c :array) {
			System.out.print(c);
		}
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String str = keyboard.nextLine();
		
		backward(str);
		//System.out.println(str);
	}
	

}
