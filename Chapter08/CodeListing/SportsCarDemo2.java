package CodeListing;

public class SportsCarDemo2 {
	public static void main(String[] args) {
		SportsCar yourCar =  new SportsCar(CarType.FERRARI,CarColor.BLACK,20000);
		
		
		switch(yourCar.getMake()) {
		case FERRARI :
			System.out.println("Your car was made in Italy"	);
			break;
		case JAGUAR :
			System.out.println("Your car was made in England");
			break;
		case PORSCHE :
			System.out.println("Your car was made in Germany");
			break;
			
		default :
			System.out.println("con me may dua tao a");
		}
	}

}
