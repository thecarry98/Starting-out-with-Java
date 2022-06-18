package ProgrammingChallenges;

public class RoomCarpet {
	private RoomDimention dimention;
	private double cost;
	
	public RoomCarpet(RoomDimention dim,double cost) {
		dimention = dim;
		this.cost = cost;
	}
	public double getCost() {
		return cost*dimention.getArea();
	}
	

}
