package CodeListing;

import java.io.*;
import java.util.*;


public class MultiCatch {
	public static void main(String[] args) {
		int number;
		
		try {
			File file = new File("SalesData");
			Scanner inputFile = new Scanner(file);
			
			while(inputFile.hasNext()) {
				number = inputFile.nextInt();
				System.out.println(number);
			}
			
			inputFile.close();
		} catch (FileNotFoundException | InputMismatchException ex) {
			// TODO: handle exception
			System.out.println("Error processing the file.");
		}
	}

}
