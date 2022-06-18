package Challenges;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class Challenges03 extends JFrame{

	
	private JLabel label;
	private JTextField text;
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	
	private final int width = 200;
	private final int height = 200;
	public Challenges03() {
		setTitle("Property Tax");
		
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		
		setVisible(true);
	}
	
	private void buildPanel() {
		label = new JLabel("The actual value of a property ");
		text = new JTextField(10);
		button1 = new JButton("Assessment value");
		button2 = new JButton("Property Tax");
		button1.addActionListener(new CalcButtonListener());
		button2.addActionListener(new CalcButtonListener());
		panel = new JPanel();
		
		panel.setBackground(Color.blue);
		panel.add(label);
		panel.add(text);
		panel.add(button1);
		panel.add(button2);
		
	}
	
	private class CalcButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String input = text.getText();
			double value = Double.parseDouble(input);
			double Avalue = 0.6*value;
			
			if(e.getSource() == button1) {
				JOptionPane.showMessageDialog(null, "The assessment value : " + Avalue);
			}
			else if(e.getSource() == button2) {
				double hihi = (double)(0.64/100)*Avalue;
				JOptionPane.showMessageDialog(null, "The Property tax : " + hihi);
			}
			
			JOptionPane.showMessageDialog(null, "THANK YOU ! ");
		}
	}
	
	public static void main(String[] args) {
		new Challenges03();
	}
}
