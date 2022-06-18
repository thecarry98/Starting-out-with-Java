package CodeListing;
import javax.swing.*;
public class SimpleWindow extends JFrame{
	
	
	public SimpleWindow() {
		final int WIDTH = 350;
		final int HEIGHT = 250;
		
		setSize(WIDTH,HEIGHT);
		
		setTitle("A Simple Window 2");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}

}
