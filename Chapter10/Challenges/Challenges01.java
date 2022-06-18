package Challenges;

import java.util.Scanner;

public class Challenges01 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String name;
		String xxx;
		String L = null;
		int hireDate;
		int shift;
		double HourlyPayRate;
		ProductionWorker employee = new ProductionWorker();
		
		System.out.println("Enter the name : ");
		name = keyboard.nextLine();
		employee.setName(name);
		
		System.out.println("Enter the Number ( XXX - L) : ");
		System.out.println("Enter the XXX ( number 0-9 ) ");
		xxx=keyboard.nextLine();
		boolean check1 = true;
		for (int i = 0; i < xxx.length(); i++) {
			if(!Character.isDigit(xxx.charAt(i))) {
				check1=false;
				break;
			}
		}
		if(check1) {
			System.out.println("Enter the L : ( A-M) ");
			L = keyboard.next();
		}else {
			System.out.println("Enter again");
		}
		
		employee.setNumber(xxx, L);
		
		System.out.println("Enter the Hire Date (integer) :");
		hireDate = keyboard.nextInt();
		employee.setDate(hireDate);
		
		System.out.println("Enter the Shift (1 or 2)");
		shift = keyboard.nextInt();
		employee.setShift(shift);
		
		System.out.println("Enter the HourlyPayRate");
		HourlyPayRate = keyboard.nextDouble();
		employee.setHourlyPayRate(HourlyPayRate);
		
		System.out.println("=========================");
		System.out.println("Name :" + employee.getName());
		System.out.println("Number : " + employee.getNumber());
		System.out.println("Hire Date : " +employee.getDate());
		System.out.println("Shift : " + employee.getShift());
		System.out.println("Hourly pay rate : " + employee.getHourlyPayRate());
		
		
	}


}
