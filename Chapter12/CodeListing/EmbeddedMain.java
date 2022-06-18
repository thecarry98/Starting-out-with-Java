package CodeListing;

import javax.swing.*;
public class EmbeddedMain extends JFrame{
	final int width = 350;
	final int height = 250;
	
	public EmbeddedMain() {
		setTitle("A simple window 3");
		
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		EmbeddedMain em = new EmbeddedMain();
	}

}
