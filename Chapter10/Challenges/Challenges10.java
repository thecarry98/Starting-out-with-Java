package Challenges;

public class Challenges10 {
	public static void main(String[] args) {
		
		Ship []hihi = new Ship[3];
		
		hihi[0] = new Ship("Viet Anh 1 ", "1998");
		hihi[1] = new CruiseShip("Viet Anh 2", "1998", 100);
		hihi[2] = new CargoShip("Viet Anh 3", "1998",20000);
		
		System.out.println(hihi[0].toString());
		System.out.println("----------------");
		System.out.println(hihi[1].toString());
		System.out.println("----------------");
		System.out.println(hihi[2].toString());
	}

}
