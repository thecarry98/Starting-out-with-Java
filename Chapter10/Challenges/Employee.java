package Challenges;

public class Employee {
	private String EmployeeName;
	private String EmployeeNumber;
	private int HireDate;
	
	public void setName(String name ) {
		EmployeeName = name;
	}
	public void setNumber(String xxx, String n) {
		EmployeeNumber = xxx + "-"+ n;
	}
	public void setDate(int HireDate) {
		this.HireDate = HireDate;
	}
	
	public String getName() {
		return EmployeeName;
	}
	public String getNumber() {
		return EmployeeNumber;
	}
	public int getDate() {
		return HireDate;
	}
	

}
