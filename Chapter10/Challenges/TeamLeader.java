package Challenges;

public class TeamLeader extends ProductionWorker{
	private int HourOfTraining;
	private double monthlyBonus;
	private int Hour_attend;
	
	public void setHourOfTraining(int hour) {
		HourOfTraining = hour;
	}
	public void setMonthlyBonus(double bonus) {
		monthlyBonus = bonus;
	}
	public void setHour_attend(int hour) {
		Hour_attend = hour;
	}
	
	public int getHourOfTraining() {
		return HourOfTraining;
	}
	
	public double getMonthlyBonus() {
		return monthlyBonus;
	}
	public int getHour_attend() {
		return Hour_attend;
	}
	
	
	

}
