package Algorithm;

import java.io.*;
public class AW3 {
	public static void main(String[] args) throws Exception {
		int []array = {
				1,2,3,4,5,6,7,8,9
		};
		int m=3;
		int n;
		int cout = 0;
		try {
			while(cout>=0 && cout<array.length) {
				if(array[cout] == m) {
					m = cout;
				}
				cout++;
			}
			//System.out.println(n);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("hihi");
		}
		
		
	}

}
