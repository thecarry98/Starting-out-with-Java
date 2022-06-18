package CodeListing;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class ColorWindow extends JFrame{
	private JLabel messageLabel;
	private JButton button;
	private JTextField text;
	private JButton redButton;
	private JButton blueButton;
	private JButton yellowButton;
	private JPanel panel;
	private final int width = 300;
	private final int height = 125;
	
	public ColorWindow() {
		setTitle("Colors");
		
		setSize(width, height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		messageLabel = new JLabel("Click a button to select a color : ");
		
		redButton = new JButton("RED");
		blueButton = new JButton("BLUE");
		yellowButton = new JButton("YELLOW");
		
		redButton.addActionListener(new RedButtonListener());
		blueButton.addActionListener(new BlueButtonListener());
		yellowButton.addActionListener(new YellowButtonListener());
		text = new JTextField(10);
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(redButton);
		panel.add(blueButton);
		panel.add(yellowButton);
		panel.add(text);
		//getContentPane().setBackground(Color.BLUE);
		add(panel);
		
		setVisible(true);
	}
	
	private class RedButtonListener implements ActionListener, java.awt.event.ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			panel.setBackground(Color.RED);
			messageLabel.setBackground(Color.BLUE);
		}
		
	}
	
	private class BlueButtonListener implements ActionListener, java.awt.event.ActionListener{
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.BLUE);
			//getContentPane().setBackground(Color.BLUE);
			messageLabel.setBackground(Color.YELLOW);
		}
	}
	
	private class YellowButtonListener implements ActionListener, java.awt.event.ActionListener{
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.YELLOW);
			messageLabel.setBackground(Color.BLACK);
		}
	}
	
	public static void main(String[] args) {
		new ColorWindow();
	}
	

}
