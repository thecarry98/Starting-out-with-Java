package CodeListing;

import java.io.*;

public class ReadBinaryFile {
	public static void main(String[] args) throws IOException{
		int number;
		boolean endOfFile = false;
		
		FileInputStream fstream = new FileInputStream("number");
		DataInputStream inputFile = new DataInputStream(fstream);
		
		System.out.println("Reading numbers from the file: ");
		
		while(!endOfFile) {
			try {
				number = inputFile.readInt();
				System.out.print(number+" ");
			} catch (EOFException e) {
				// TODO: handle exception
				endOfFile = true;
			}
		}
		
		System.out.println("\nDone.");
		inputFile.close();
	}

}
