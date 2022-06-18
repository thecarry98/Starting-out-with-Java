package CodeListing;

public class StaticDemo {
	public static void main(String[] args) {
		int objectCount;
		int count;
		
		Countable one = new Countable();
		Countable two = new Countable();
		Countable three = new Countable();
		
		
		objectCount = three.getInstanceCount();
		count = two.getCount();
		System.out.println(objectCount);
		System.out.println(count);
		
	}
}
