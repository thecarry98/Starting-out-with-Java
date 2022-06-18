package Challenges;

public class CargoShip extends Ship{
	private int capacity;  //suc chua hang hoa
	
	public CargoShip(String name, String year, int capa) {
		super(name, year);
		capacity = capa;
	}
	
	public void setCapacity(int capa) {
		capacity = capa;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	@Override
	public String toString() {
		String str = " Name : " + nameShip +
				"\nCapacity : " +capacity;
		
		return str;
	}

}
