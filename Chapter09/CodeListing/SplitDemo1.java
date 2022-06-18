package CodeListing;

public class SplitDemo1 {
	public static void main(String[] args) {
		String str = "  one two/three-four.five,six  ";
		str = str.trim();
		System.out.println(str);
		String []tokens = str.split("[/-]");
		
		for(String s : tokens) {
			System.out.println(s);
		}
	}

}
