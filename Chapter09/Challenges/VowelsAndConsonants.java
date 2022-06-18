package Challenges;

public class VowelsAndConsonants {
	private String str ;
	public VowelsAndConsonants(String str) {
		this.str = str;
	}
	
	public int getVowels() {
		int v = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) =='o' || str.charAt(i)=='e' ||str.charAt(i) == 'a' ||str.charAt(i)=='i'||str.charAt(i)=='u') {
				v++;
			}
		}
		return v;
	}
	
	public int getConsonants() {
		VowelsAndConsonants one = new VowelsAndConsonants(str);
		int empty =0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
				empty++;
			}
		}
		return str.length()-empty-one.getVowels();
	}
	
	
	

}
