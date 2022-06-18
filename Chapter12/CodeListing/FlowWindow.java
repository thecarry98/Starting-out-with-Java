package CodeListing;
import javax.swing.*;
import java.awt.*;

public class FlowWindow extends JFrame{
	private final int width = 500;
	private final int height = 105;
	
	public FlowWindow() {
		setTitle("Flow Layout");
		
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setLayout(new FlowLayout());
		setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		
		add(button1);
		add(button2);
		add(button3);
		
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new FlowWindow();
	}

}
