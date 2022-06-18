package CodeListing;

public class Instructor {
	private String lastName;
	private String firstName;
	private String officeNumber;
	
	public Instructor(String lName,String fName,String oNum) {
		lastName = lName;
		firstName = fName;
		officeNumber = oNum;
	}
	
	public Instructor(Instructor object) {
		lastName = object.lastName;
		firstName = object.firstName;
		officeNumber = object.officeNumber;
	}
	
	public void set(String lName,String fName,String oNum) {
		lastName = lName;
		firstName = fName;
		officeNumber = oNum;
	}
	
	public String toString() {
		String tr = "last name : " + lastName + " \nfirst name : " + firstName + " \noffice number :" + officeNumber;
		return tr;
	}
	
	

}
 