package ProgrammingChallenges;

import Challenges.Die;

public class Player {
	private int player = 50;
	
	private Die die;
	
	public Player(Die die) {
		//this.player = player;
		this.die = die;
	}
	
	public void roll() {
		die.roll();
		player = player-die.getValue();
	}
	public int getVALUE() {
		return die.getValue();
	}

	public int getPlayer() {
		return player;
	}


}
