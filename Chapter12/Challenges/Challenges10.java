package Challenges;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Challenges10 extends JFrame{

	private JLabel label;
	private JTextField text;
	private JButton button;
	private JPanel panel;
	
	private final int width = 100;
	private final int height = 200;
	
	public Challenges10() {
		
		setTitle("Celsus to Fahrenheit");
		
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		label = new JLabel("Celsius ->  Fahrenheit");
		text = new JTextField(10);
		button = new JButton("Convert");
		button.addActionListener(new CalcButtonListener());
		
		panel.add(label);
		panel.add(text);
		panel.add(button);
		
		add(panel);
		setVisible(true);
		
		
	}
	
	private class CalcButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String input = text.getText();
			double C = Double.parseDouble(input);
			
			double F =((double)9/5)*C + 32;
			
			JOptionPane.showMessageDialog(null, "Fahrenheit : " + F);
		}
	}
	
	public static void main(String[] args) {
		new Challenges10();
	}
}
