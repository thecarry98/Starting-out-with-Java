package Algorithm;

public abstract class A3ClassB {
	private int m;
	protected int n;
	
	public void setM(int m) {
		this.m = m;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	public int getM() {
		return m;
	}
	public int getN() {
		return n;
	}
	
	public abstract double calc();
	

}
