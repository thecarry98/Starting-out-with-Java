package Challenges;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Challenges06 extends JFrame{

	private JCheckBox oil;
	private JCheckBox LubeJob;
	private JCheckBox Radiator;
	private JCheckBox trans;
	private JCheckBox inspection;
	private JCheckBox muffler;
	private JCheckBox tire;
	private JLabel label1;
	private JTextField text1;
	private JButton button;
	private JPanel panel;
	
	private final int width = 210;
	private final int height = 400;
	
	public Challenges06() {
		setTitle("Joe's Automotive");
		
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		//pack();
		setVisible(true);
		
	}
	
	private void buildPanel() {
		panel = new JPanel();
		oil = new JCheckBox("Oil change - $26.00");
		LubeJob = new JCheckBox("Lube job - $18.00");
		Radiator = new JCheckBox("Radiator flush - $30.00");
		trans = new JCheckBox("Transmission - $80.00");
		inspection = new JCheckBox("Inspection - $15.00");
		muffler = new JCheckBox("Muffler replacement - $100.00");
		tire = new JCheckBox("Tire rotation - $20.00");
		
		label1 = new JLabel("Enter the other hours ($20 per hour)");
		text1 = new JTextField(10);
		button = new JButton("CALCULATE");
		button.addActionListener(new CalcButtonListener());
		
		panel.add(oil);
		panel.add(LubeJob);
		panel.add(Radiator);
		panel.add(trans);
		panel.add(inspection);
		panel.add(muffler);
		panel.add(tire);
		panel.add(label1);
		panel.add(text1);
		panel.add(button);
		
		
	}
	
	private class CalcButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double total = 0;
			if(oil.isSelected())
				total +=26;
			if(LubeJob.isSelected())
				total +=18;
			if(Radiator.isSelected())
				total +=30;
			if(trans.isSelected())
				total +=80;
			if(inspection.isSelected())
				total +=15;
			if(muffler.isSelected())
				total +=100;
			if(tire.isSelected())
				total +=20;
			
			String input = text1.getText();
			int hour = Integer.parseInt(input);
			total += hour*20;
			
			JOptionPane.showMessageDialog(null, "The total : " + total);
		}
		
	}
	
	public static void main(String[] args) {
		new Challenges06();
	}
}


