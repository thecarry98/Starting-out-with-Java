package CodeListing;

public class CompSciStudentDemo {
	public static void main(String[] args) {
		
		CompSciStudent csStudent = new CompSciStudent("Jennifer Haynes","167W234", 2015);
		
		csStudent.setMathHours(12);
		csStudent.setCsHours(20);
		csStudent.setGenEdHours(40);
		
		System.out.println(csStudent);
		System.out.println("----------------------");
		
		System.out.println("Hours remaining : "+ csStudent.getRemainingHours());
	}

}
