package CodeListing;

public class DvdMovie implements RetailItem{
	private String title;
	private int runningTime;
	private double retailPrice;
	
	public DvdMovie(String title, int runningTime, double retailPrice) {
		this.title = title;
		this.retailPrice = retailPrice;
		this.runningTime = runningTime;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getRunningTime() {
		return runningTime;
	}
	
	public double getRetailPrice() {
		return retailPrice;
	}

}
