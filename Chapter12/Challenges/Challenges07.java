package Challenges;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Challenges07 extends JFrame{

	private JLabel label;
	private JTextField minutes;
	private JRadioButton daytime;
	private JRadioButton evening;
	private JRadioButton OffPeak;
	private ButtonGroup group;
	
	private JPanel panel;
	//private JButton calc;
	
	private final int width = 200;
	private final int height = 400;
	
	public Challenges07() {
		setTitle("Long Distance Calls");
		
		setSize(width, height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel() {
		panel = new JPanel();
		label = new JLabel("Enter the minutes ");
		minutes = new JTextField(10);
		group = new ButtonGroup();

		daytime = new JRadioButton("Daytime ($0.07)");
		evening = new JRadioButton("Evening ($0.12)");
		OffPeak = new JRadioButton("Off-Peak ($0.05)");
		
		daytime.addActionListener(new RadioButtonListener());
		evening.addActionListener(new RadioButtonListener());
		OffPeak.addActionListener(new RadioButtonListener());
		group.add(daytime);
		group.add(evening);
		group.add(OffPeak);
		
		panel.add(label);
		panel.add(minutes);
		panel.add(daytime);
		panel.add(evening);
		panel.add(OffPeak);
		//panel.add(group);
	}
	
	private class RadioButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String input = minutes.getText();
			int minutes = Integer.parseInt(input);
			Double money;
			if(e.getSource() == daytime){
				money = minutes*0.07;
				JOptionPane.showMessageDialog(null, "daytime :" + money);
			}else if(e.getSource() == evening) {
				money = minutes*0.12;
				JOptionPane.showMessageDialog(null, "evening : " + money);
			}else if(e.getSource() == OffPeak) {
				money = minutes*0.05;
				JOptionPane.showMessageDialog(null, "Off peak : " + money);
			}
		}
	}
	
	public static void main(String[] args) {
		new Challenges07();
	}
}
