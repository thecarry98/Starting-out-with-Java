
import java.util.Random;

public class Die {
	private int side;
	private int value;
	
	public Die(int numside) {
		side =numside;
		roll();
	}
	
	public void roll() {
		Random rand = new Random();
		value = rand.nextInt(side) + 1;
	}
	
	public int getSide() {
		return side;
	}
	
	public int getValue() {
		return value;
	}

}
