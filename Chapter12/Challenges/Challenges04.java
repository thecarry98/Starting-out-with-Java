package Challenges;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Challenges04 extends JFrame{

	private JLabel label1,label2,label3,label4,label5,label6,label7,label8;
	private JTextField text1,text2,text3,text4,text5,text6,text7,text8;
	private JPanel panel0,panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8;
	private JButton button1,button2,button3;
	
	private final int width = 400;
	private final int height = 350;
	
	public Challenges04() {
		setTitle("Travel Expenses");
		
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel0);
		
		setVisible(true);
		
	}
	
	private void buildPanel() {
		
		button1 = new JButton("The total");
		button2 = new JButton("The total allowed");
		button3 = new JButton("Change");
		
		button1.addActionListener(new CalcButtonListener());
		button2.addActionListener(new CalcButtonListener());

		button3.addActionListener(new CalcButtonListener());

		
		panel0 = new JPanel();
		panel0.setLayout(new GridLayout(4, 3));
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		panel7 = new JPanel();
		panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		
		label1 = new JLabel("Number of days on the trip");
		label2 = new JLabel("Amount of airfare");
		label3 = new JLabel("Amount of car rental fees");
		label4 = new JLabel("Number of miles driven");
		label5 = new JLabel("Amount of parking fees");
		label6 = new JLabel("Amount of taxi charges");
		label7 = new JLabel("Conference or seminar registration fees");
		label8 = new JLabel("Lodging charges, per night");
		JLabel label9 = new JLabel("hihi");
		
		text1 = new JTextField(5);
		text2 = new JTextField(5);
		text3 = new JTextField(5);
		text4 = new JTextField(5);
		text5 = new JTextField(5);
		text6 = new JTextField(5);
		text7 = new JTextField(5);
		text8 = new JTextField(5);
		
		panel1.add(label1);
		panel1.add(text1);
		panel2.add(label2);
		panel2.add(text2);
		panel3.add(label3);
		panel3.add(text3);
		panel4.add(label4);
		panel4.add(text4);
		panel5.add(label5);
		panel5.add(text5);
		panel6.add(label6);
		panel6.add(text6);
		panel7.add(label7);
		panel7.add(text7);
		panel8.add(label8);
		panel8.add(text8);
		panel9.add(label9);
		
		
		panel0.add(panel1);
		panel0.add(panel2);
		panel0.add(panel3);
		panel0.add(panel4);
		panel0.add(panel5);
		panel0.add(panel6);
		panel0.add(panel7);
		panel0.add(panel8);
		panel0.add(panel9);
		
		
		panel0.add(button1);
		panel0.add(button2);
		panel0.add(button3);

	}
	
	private class CalcButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//thôi mệt quá éo làm đâu
			
		}
		
		
	}
	public static void main(String[] args) {
		new Challenges04();
	}
	
	
}
