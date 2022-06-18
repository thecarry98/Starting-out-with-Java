package ProgrammingChallenges;

import java.util.Scanner;

import Challenges.Die;

public class ProChallenges11 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int diem1;
		int diem2;
		Die die = new Die(5);
		Player player1 = new Player(die);
		Player player2 = new Player(die);
		
		System.out.println("START ");
		System.out.println("--------------------");
		
		System.out.println("nguoi choi thu nhat :");
		for (int i = 0; i < 10; i++) {
			player1.roll();
			System.out.println("lan " + (i+1) + " : " + player1.getVALUE());
		}
		System.out.println("so diem con la la : " + player1.getPlayer());
		
		System.out.println("nguoi choi thu hai :");
		for (int i = 0; i < 10; i++) {
			player2.roll();
			System.out.println("lan " + (i+1) + " : " + player2.getVALUE());
		}
		System.out.println("so diem con la la : " + player2.getPlayer());
		
		System.out.println("=====================");
		if(player1.getPlayer() >player2.getPlayer()) {
			System.out.println("nguoi choi thu hai win");
		}else if(player1.getPlayer()< player2.getPlayer()) {
			System.out.println("nguoi choi thu nhat win ");
		}else {
			System.out.println("hai nguoi choi hoa nhau");
		}
		
		System.out.println("hello");

	}

}
