package CodeListing;

public class TextBook {
	private String title;
	private String author;
	private String publisher;
	
	public TextBook(String title,String a,String p) {
		this.title = title;
		author = a;
		publisher = p;
	}
	
	public TextBook(TextBook ob) {
		title = ob.title;
		author = ob.author;
		publisher = ob.publisher;
	}
	public TextBook(String ti,String a) {
		this(ti,a," ");
	}
	
	public void setTextBook(String t , String a, String p) {
		title = t;
		author = a;
		publisher = p;
	}
	
	public String toString() {
		String str = "\ntitle : " + title + "\n author :" + author + "\npublisher : " + publisher;
		return str;
	}

}
