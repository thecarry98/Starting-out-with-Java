package CodeListing;

public class ObjectCopy {
	public static void main(String[] args) {
		Stock company1 = new Stock("abc",9.8);
		Stock company2;
		company2 = company1.copy();
		
		System.out.println("company 1 :" + company1);
		System.out.println("company 2 :"+ company2);
		
		if(company1==company2) {
			System.out.println("the same ");
		}
		else {
			System.out.println("is different");
		}
		
		Stock com3 = new Stock(company1);
		System.out.println(com3);
	}

}
