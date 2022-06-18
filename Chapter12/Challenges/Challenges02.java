package Challenges;
import javax.swing.*;

import java.awt.event.*;

public class Challenges02 extends JFrame{

	private JPanel panel;
	private JLabel label;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JTextField text;
	private final int width = 250;
	private final int height = 200;
	
	public Challenges02() {
		setTitle("Monthly Sales Tax");
		
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		setVisible(true);
	}
	
	public void buildPanel() {
		panel = new JPanel();
		
		label = new JLabel("The total sales for the month :");
		
		text = new JTextField(10);
		
		button1 = new JButton("The amount of country sales tax");
		button2 = new JButton("The amount of state sales tax");
		button3 = new JButton("The total sales tax");
		
		button1.addActionListener(new CalcButtonListener());
		button2.addActionListener(new CalcButtonListener());
		button3.addActionListener(new CalcButtonListener());
		
		panel.add(label);
		panel.add(text);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
	}
	
	private class CalcButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String input;
			input = text.getText();
			double amount = Double.parseDouble(input);
			double tax;
			if(e.getSource() == button1) {
				tax = (0.02*amount);
				JOptionPane.showMessageDialog(null, "The amount of contry sales tax : " + tax);
			}
			else if(e.getSource() == button2) {
				tax = (0.04*amount);
				JOptionPane.showMessageDialog(null, "The amount of state sales tax : " + tax );
			}
			else if(e.getSource() == button3) {
				tax = (0.06*amount);
				JOptionPane.showMessageDialog(null, "The total sales tax : " + tax);
			}
			JOptionPane.showMessageDialog(null, "THANK YOU ! ");
			
		}
	}
	
	public static void main(String[] args) {
		new Challenges02();
	}
}
