package Challenges;

import java.util.Scanner;

public class Challenges07 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("moi nhap so : ");
		double x = keyboard.nextDouble();
		System.out.println(thousand(x));
		System.out.println(hundred(x));
		
	}
	
	public static int thousand(double x) {
		int a = (int)x/1000;
		return a;	
	}
	
	public static int hundred(double x) {
		int xx = thousand(x)*1000;
		x = x-xx;
		int b = (int)x/100;
		return b;
	}
	
	public static String hienthi(int a) {
		String hihi;
		if(a ==1) {
			hihi = "one";
		}else if(a==2) {
			hihi = "two";
		}else if(a==3) {
			hihi = "three";
		}else if(a==4) {
			hihi = "four";
		}else if(a==5) {
			hihi = "five";
		}else if(a==6) {
			hihi = "six";
		}else if(a==7) {
			hihi = "seven";
		}else if(a==8) {
			hihi = "eight";
		}else if(a==9) {
			hihi = "nine";
		}else {
			hihi = " ";
		}
		
		return hihi;
	}
	
	public static String hienthihangchuc(int c) {
		String hangchuc;
		if(c == 1) {
			hangchuc = "ten";
		}else if(c==2) {
			hangchuc = "twenty";
		}else if(c==3) {
			hangchuc = "thirty";
		}else if(c==4) {
			hangchuc = "fourty";
		}else if(c==5) {
			hangchuc = "fifty";
		}else if(c==6) {
			hangchuc = "sixty";
		}else if(c==7) {
			hangchuc = "seventy";
		}else if(c==8) {
			hangchuc = "eightty";
		}else if(c==9) {
			hangchuc = "ninety";
		}else {
			hangchuc = " ";
		}
		
		return hangchuc;
	}
	
	public static String hangchucmuoi(int cd) {
		String h = " ";
		if(cd==11) {
			h = "eleven";
		}else if (cd ==12){
			h = "twelve";
		}else if (cd ==13){
			h = "thirteen";
		}else if(cd ==14) {
			h = "fourteen";
		}else if(cd ==15) {
			h = "fifteen";
		}else if(cd ==16) {
			h = "sixteen";
		}else if(cd ==17) {
			h = "seventeen";
		}else if(cd == 18) {
			h = "eighteen";
		}else if(cd == 19) {
			h = "nineteen";
		}
		
		return h;
	}

}
