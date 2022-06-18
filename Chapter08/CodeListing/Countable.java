package CodeListing;

public class Countable {
	private static int instanceCount =0;
	private int count =0;
	public Countable() {
		instanceCount++;
		count++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
	public int getCount() {
		return count;
	}

}
