package Challenges;

import java.util.Scanner;

public class 
Challenges04 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		char choice ;
		do {
			System.out.println("Please enter the string ");
			String str = keyboard.nextLine();
			
			Menu();
			System.out.println("Your choice is : ");
			String c = keyboard.nextLine();
			choice = c.charAt(0);
			
			VowelsAndConsonants con = new VowelsAndConsonants(str);
			switch(choice){
			case 'a':
			case 'A':
				System.out.println("the number of the vowels : " + con.getVowels());
				break;
			case'b':
			case'B':
				System.out.println("the number of the vowels : " + con.getConsonants());
				break;
			case 'c':
			case'C':
				System.out.println("the both of the vowels and consonants :" + (con.getVowels() + con.getConsonants()));
				break;
			case'd':
			case'D':
				System.out.println("Enter the string :" );
				str = keyboard.nextLine();
			case'e':
			case'E':
				System.exit(0);
				break;
				default:
				System.out.println("thank you !");
			}
				
		}while (choice !='e' ||choice !='E');
	}
	
	public static void Menu() {
		System.out.println("a. Count the number of the vowels in the string ");
		System.out.println("b. Count the number of the consonants in the string ");
		System.out.println("c. Count both the vowels and consonants in the string ");
		System.out.println("d. Enter aother string ");
		System.out.println("e. Exit the program ");
	}
	
	
}
