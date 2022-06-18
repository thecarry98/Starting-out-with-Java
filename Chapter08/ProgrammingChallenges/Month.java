package ProgrammingChallenges;

public class Month {
	private int monthNumber;
	private String []monthName = {
			"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Noverber", "December"
	};
	
	public Month() {
		monthNumber =1;
	}
	public Month(int m) {
		if(m<1 || m>12) {
			monthNumber = 1;
		}
		else {
			monthNumber = m;
		}
	}
	
	public Month(String Name) {
		for (int i = 0; i < monthName.length; i++) {
			if(Name.equals(monthName[i])) {
				monthNumber = i+1;
			}
		}
	}
	public void setMonthNumber(int m) {
		if(m<1 || m >12) {
			monthNumber =1;
		}else {
			monthNumber =m;
		}
	}
	
	public int getMonthNumber() {
		return monthNumber;
	}
	
	public String getMonthName() {
		return monthName[monthNumber -1];
	}
	
	public String toString() {
		String str = " Month Name :" + monthName;
		return str;
	}
	
	public boolean equals(Month m) {
		if(monthNumber == m.getMonthNumber()) {
			return true;
		}
		return false;
	}
	public boolean GreatThan(Month m1)
    {
        if (monthNumber > m1.monthNumber) return true;
        else return false;
    }
	
	public boolean LesserThan(Month m1)
	{
	    if (monthNumber < m1.monthNumber) return true;
	    else return false;
	}
	 
	 
	
	

}
