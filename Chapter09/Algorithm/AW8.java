package Algorithm;

public class AW8 {
	public static void main(String[] args) {
		String str = "cookies>milk>fudge:cake:ice cream";
		
		String[]tokens = str.split("[>:]");
		
		for(String tr : tokens) {
			System.out.println(tr );
		}
	}

}
