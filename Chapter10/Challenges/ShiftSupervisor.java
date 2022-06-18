package Challenges;

public class ShiftSupervisor extends Employee {
	private double salary;
	private double bonus;
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalary() {
		return salary;
	}
	public double getBonus() {
		return bonus;
	}
	public double getSum() {
		return salary+bonus;
	}
}
