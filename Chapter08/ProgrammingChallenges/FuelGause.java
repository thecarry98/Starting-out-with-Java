package ProgrammingChallenges;

public class FuelGause {
	private final int maxGallons = 15;
	private int gallons;
	
	public FuelGause() {
		gallons =0;
	}
	
	public FuelGause(int gallons) {
		if(gallons<=15) {
			this.gallons = gallons;
		}
		else {
			this.gallons = maxGallons;
		}
	}
	
	public int getGallons(){
		return gallons;
	}
	
	public void IncrementFuel() {
		if(gallons <15) {
			gallons ++;
		}else{
			System.out.println("full");
		}
	}
	
	public void DecrementFuel() {
		if(gallons > 0) {
			gallons--;
		}else {
			System.out.println("empty fuel :");
		}
	}
	
	

}
