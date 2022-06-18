package CodeListing;

public class Course {
	private String courseName;
	private Instructor instructor;
	private TextBook textbook;
	
	public Course(String na, Instructor ins,TextBook tb) {
		courseName = na;
		instructor = new Instructor(ins);
		textbook = new TextBook(tb);
	}
	
	public String getName() {
		return courseName;
	}
	
	public Instructor getInstructor() {
		return new Instructor(instructor);
	}
	
	public TextBook getTextBook() {
		return new TextBook(textbook);
	}
	
	public String toString() {
		String str = "Course Name :" + courseName + 
				"\n Instructor Information \n: " + instructor + 
				"\n TextBook Information : 	" + textbook;
		
		return str;
	}

}
