package CodeListing;

public class CourseDemo {
	
	public static void main(String[] args) {
		Instructor myInstructor = new Instructor("Krame" , "Shawn", " RH3010");
		
		TextBook myTextBook =  new TextBook("Starting out with java", "viet", "anh");
		
		Course myCourse = new Course("vietanh", myInstructor,myTextBook);
		
		System.out.println(myCourse);
		System.out.println("-------");
		
		System.out.println(myCourse.getInstructor());
		System.out.println("====================");
		System.out.println(myInstructor);
	}
}
