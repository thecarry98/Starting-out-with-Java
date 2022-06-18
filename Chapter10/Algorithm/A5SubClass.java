package Algorithm;

public class A5SubClass extends A5SuperClass {
	private int value;
	public void setValue() {
		value = 10;
	}
	
	@Override
	public int getVa(){
		return value*10;
	}

}
