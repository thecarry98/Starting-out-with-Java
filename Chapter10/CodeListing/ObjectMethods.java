package CodeListing;

public class ObjectMethods {
	public static void main(String[] args) {
		
		PassFailExam exam1 = new PassFailExam(0, 0, 0);
		PassFailExam exam2 = new PassFailExam(0, 0, 0);
		
		System.out.println(exam1);
		System.out.println(exam2);
		
		if(exam1.equals(exam2)) {
			System.out.println("They are the same. ");
		}else {
			System.out.println("The are NOT the same.");
		}
	}

}
