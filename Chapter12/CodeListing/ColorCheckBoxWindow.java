package CodeListing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorCheckBoxWindow extends JFrame{

	private JLabel messageLabel;
	private JCheckBox yellow;
	private JCheckBox red;
	private final int width = 300;
	private final int height = 100;
	
	public ColorCheckBoxWindow() {
		setTitle("Color check boxes");
		
		setSize(width, height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		messageLabel = new JLabel("Select the check  boxes to change colors");
		yellow = new JCheckBox("Yellow background");
		red = new JCheckBox("Red foreground");
		
		yellow.addItemListener(new CheckBoxListener());
		red.addItemListener(new CheckBoxListener());
		
		setLayout(new FlowLayout());
		
		add(messageLabel);
		add(yellow);
		add(red);
		
		setVisible(true);
		
	}
	
	private class CheckBoxListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource() == yellow) {
				if(yellow.isSelected()) {
					getContentPane().setBackground(Color.YELLOW);
					yellow.setBackground(Color.yellow);
					red.setBackground(Color.yellow);
				}
				else {
					getContentPane().setBackground(Color.LIGHT_GRAY);
					yellow.setBackground(Color.LIGHT_GRAY);
					red.setBackground(Color.LIGHT_GRAY);
				}
			}
			else if(e.getSource() == red) {
				if(red.isSelected()) {
					messageLabel.setForeground(Color.red);
					yellow.setForeground(Color.red);
					red.setForeground(Color.red);
				}
				else {
					messageLabel.setForeground(Color.black);
					yellow.setForeground(Color.black);
					red.setForeground(Color.black);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new ColorCheckBoxWindow();
	}
}
