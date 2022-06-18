package Challenges;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Challenges01 extends JFrame{

	private JSlider slider;
	private JPanel panel1,panel2,panel3;
	
	private JLabel label1,label2,label3;
	private JTextField text1,text2;
	
	public Challenges01() {
		setTitle("Scrollable Tax Calculate");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setLayout(new GridLayout(3,1));
		buildPanel();
		add(panel1);
		add(panel2);
		add(panel3);
		pack();
		setVisible(true);
	}
	
	private void buildPanel() {
		text1 = new JTextField(10);
		label1 = new JLabel("Enter the amount");
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		panel1.add(label1);
		panel1.add(text1);
		
		slider = new JSlider(JSlider.HORIZONTAL,0,10,0);
		slider.setMajorTickSpacing(1);
		//slider.setMinorTickSpacing();
		
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(new SliderListener());
		label2 = new JLabel("Tax Rate");
		panel2 = new JPanel();
		//panel2.add(slider);
		panel2.add(label2);
		panel2.add(slider);
		
		//panel3
		
		panel3 = new JPanel();
		label3 = new JLabel("Amount the sale tax");
		text2 = new JTextField("0",10);
		text2.setEditable(false);
		
		panel3.add(label3);
		panel3.add(text2);
	}
	private class SliderListener implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			int tax = slider.getValue();
			double amount = Double.parseDouble(text1.getText());
			
			double a = amount - ((double)tax/100)*amount;
			
			text2.setText(String.format("%.1f", a));
			
			
		}
	}
	
	
	public static void main(String[] args) {
		new Challenges01();
	}
	
	
}
