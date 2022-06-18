package Challenges;

import java.util.Scanner;

public class Challenges08 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double money;
		System.out.println("money : ");
		money = keyboard.nextDouble();
		
		PreferredCustomer cus2 = new PreferredCustomer("viet anh", "ha nam", 982323904, 0202020, true, money);
		cus2.setHihi();
		cus2.setPercent();
		System.out.println(cus2.toString());
		System.out.println("6. Money : " + money);
		System.out.println("7. Percent : " + cus2.getPercent()+"%");
	}

}
