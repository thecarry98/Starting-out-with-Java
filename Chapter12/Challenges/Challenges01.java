package Challenges;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Challenges01 extends JFrame{

	private final int width = 300;
	private final int height = 250;
	private JPanel panel;
	private JTextField text1;
	private JTextField text2;
	private JButton button;
	private JLabel label1;
	private JLabel label2;
	
	public Challenges01() {
		setTitle("Retail Price Calculator");
		
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label1 = new JLabel("Enter wholesale cost : ");
		text1 = new JTextField(10);
		label2 = new JLabel("Enter the percentage : ");
		text2 = new JTextField(10);
		button = new JButton("Calculate");
		panel = new JPanel();
		button.addActionListener(new CalcButtonListener());
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(button);
		add(panel);
		
		setVisible(true);
	}
	
	private class CalcButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String input1;
			String input2;
			double fi;
			double cost;
			double percent;
			
			input1 = text1.getText();
			cost = Double.parseDouble(input1);
			
			input2 = text2.getText();
			percent = Double.parseDouble(input2);
			
			fi = cost + cost*((double)percent/100);
			
			JOptionPane.showMessageDialog(null, fi);
			
			
			
		}
	}
	public static void main(String[] args) {
		new Challenges01();
	}
	
}
