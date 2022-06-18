package CodeListing;

public class PassObject {
	public static void DisplayRetangle(Retangle r) {
		System.out.println("Length : " +r.getLength());
		System.out.println("Width : " + r.getWidth());
	}
	public static void main(String[] args) {
		Retangle box = new Retangle(12,5);
		
		DisplayRetangle(box);
	}

}
