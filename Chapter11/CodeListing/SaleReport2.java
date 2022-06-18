package CodeListing;

import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;

public class SaleReport2 {
	public static void main(String[] args) {
		String filename = "SalesData.txt";
		int months =0;
		double oneMonth;
		double totalSales = 0;
		double averageSales;
		
		Scanner inputFile = openFile(filename);
		
		while(inputFile == null) {
			filename = JOptionPane.showInputDialog("ERROR :" + filename + "does not exist \n Enter another file name :");
			inputFile = openFile(filename);
			
		}
		
		while(inputFile.hasNext()) {
			try {
				oneMonth = inputFile.nextDouble();
				totalSales += oneMonth;
				
				months++;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Non-number data found in the file \n" + "The invalid record will be skipped.");
				
				inputFile.nextLine();
			}
		}
		inputFile.close();
		
		averageSales = totalSales/months;
		
		JOptionPane.showMessageDialog(null, String.format("number of months : %d\n" + "Total sales : $%,.2f\n" + "Averga sales :@%,.2f",months,totalSales,averageSales));
		System.exit(0);
	}
	
	public static Scanner openFile(String filename) {
		Scanner scan;
		
		try {
			File file = new File(filename);
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			scan = null;
		}
		return scan;
	}

}
