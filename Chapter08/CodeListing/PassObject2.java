package CodeListing;

public class PassObject2 {
	public static void ChangeRetangle(Retangle r) {
		r.setLength(0.0);
		r.setWidth(0.0);
	}
	public static void main(String[] args) {
		final int a = 5;
		Retangle box = new Retangle(12.0, 5.0);
		System.out.println(box.getLength() + "----" + box.getWidth());
		
		ChangeRetangle(box);
		System.out.println(box.getLength() + " ----" + box.getWidth());
	}

}
