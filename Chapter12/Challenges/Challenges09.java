package Challenges;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Challenges09 extends JFrame{

	private JLabel gallons;
	private JLabel miles;
	private JTextField ga;
	private JTextField mi;
	
	private JButton calc;
	private JPanel panel;
	
	private final int width = 200;
	private final int height = 300;
	
	public Challenges09() {
		setTitle("MPG Calculator");
		
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gallons = new JLabel("Enter number of gallons");
		miles = new JLabel("Enter number of miles");
		panel = new JPanel();

		
		ga = new JTextField(10);
		mi = new JTextField(10);
		calc = new JButton("Calculate MPG");
		calc.addActionListener(new CalcButtonListener());
		
		panel.add(gallons);
		panel.add(ga);
		panel.add(miles);
		panel.add(mi);
		panel.add(calc);		
		add(panel);
		
		setVisible(true);
	}
	
	private class CalcButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String input1 = ga.getText();
			String input2 = mi.getText();
			
			double gallons = Double.parseDouble(input1);
			double miles  = Double.parseDouble(input2);
			
			double MPG = (double)miles/gallons;
			if(e.getSource()==calc)
				JOptionPane.showMessageDialog(null, "MPG : " + MPG);
		}
	}
	
	public static void main(String[] args) {
		new Challenges09();
	}
}
