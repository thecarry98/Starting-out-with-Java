package Algorithm;

public class A9Demo implements A9Computable{
	public static void main(String[] args) {
		int a =10;
		A9Computable half = x -> x/2;
		System.out.println(half.compute(a));
	}

}
