package CodeListing;

public class CompSciStudent extends Student{
	private final int MATH_HOURS = 20;
	private final int CS_HOURS = 40;
	private final int GEN_ED_HOURS = 60;
	
	private int mathHours;
	private int csHours;
	private int genEdHours;
	
	public CompSciStudent(String n, String id, int year) {
		super(n,id,year);
	}
	
	public void setMathHours(int math) {
		mathHours  = math;
	}
	
	public void setCsHours(int cs) {
		csHours = cs;
	}
	
	public void setGenEdHours(int genEd) {
		genEdHours = genEd;
	}
	
	

	@Override
	public int getRemainingHours() {
		// TODO Auto-generated method stub
		
		int reqHours;
		int remainingHours;
		
		reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
		
		remainingHours = reqHours - (mathHours +csHours + genEdHours);
		return remainingHours;
	}
	
	@Override
	public String toString() {
		String str;
		
		str = super.toString() + "\nMajor : Computer Science" + 
		"\nMath Hours Taken :" + mathHours + "\n Computer Science Hours Taken : " + csHours + 
		"\nGeneral ED Hours Taken : " + genEdHours;
		
		return str;
	}

}
