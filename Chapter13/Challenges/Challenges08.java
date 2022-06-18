package Challenges;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Challenges08 extends JFrame{

	private JPanel panelNorth,panelWest,panelCenter,panelEast,panelSouth;
	private JCheckBox workShop1,workShop2,workShop3,workShop4;
	
	private JRadioButton personRadio,studentRadio,dinnerRadio;
	private ButtonGroup feeGroup;
	private JTextField totalText;
	private JLabel label;
	
	public Challenges08() {
		setTitle("Conference Registration System");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		buildPanelNorth();
		buildPanelWest();
		buildPanelCenter();
		buildPanelEast();
		buildPanelSouth();
		
		add(panelNorth,BorderLayout.NORTH);
		add(panelWest,BorderLayout.WEST);
		add(panelCenter,BorderLayout.CENTER);
		add(panelEast,BorderLayout.EAST);
		add(panelSouth,BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	private void buildPanelNorth() {
		panelNorth = new JPanel();
		label = new JLabel();
		ImageIcon hihi = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\welcome.jpg");
		label.setIcon(hihi);
		
		panelNorth.add(label);
		pack();
	}
	
	private void buildPanelWest() {
		panelWest = new JPanel();
		panelWest.setBorder(BorderFactory.createTitledBorder("Fee"));
		
		//button
		personRadio = new JRadioButton("Person : $895",true);
		personRadio.addActionListener(new action());
		studentRadio = new JRadioButton("Student :$495");
		studentRadio.addActionListener(new action());
		
		feeGroup = new ButtonGroup();
		feeGroup.add(personRadio);
		feeGroup.add(studentRadio);
		
		panelWest.add(personRadio);
		panelWest.add(studentRadio);
	}
	
	private void buildPanelCenter() {
		panelCenter = new JPanel();
		panelCenter.setBorder(BorderFactory.createTitledBorder("Dinner"));
		
		//radio button
		
		dinnerRadio = new JRadioButton("Dinner : $30",true);
		dinnerRadio.addActionListener(new action());
		dinnerRadio.setEnabled(false);
		panelCenter.add(dinnerRadio);
	}
	
	private void buildPanelEast() {
		panelEast = new JPanel();
		panelEast.setBorder(BorderFactory.createTitledBorder("Workshop"));
		
		//add work shop
		workShop1 = new JCheckBox("Introduction to E-commerce : $295",true);
		workShop1.addActionListener(new action());
		workShop2 = new JCheckBox("The Future of the Web : $295",true);
		workShop2.addActionListener(new action());

		workShop3 = new JCheckBox("Advanced Java Programming : $395",true);
		workShop3.addActionListener(new action());

		workShop4 = new JCheckBox("Network Security : $395",true);
		workShop4.addActionListener(new action());

		
		panelEast.add(workShop1);
		panelEast.add(workShop2);
		panelEast.add(workShop3);
		panelEast.add(workShop4);

	}
	
	private void buildPanelSouth() {
		panelSouth = new JPanel();
		panelSouth.setBorder(BorderFactory.createTitledBorder("Total"));
		
		//add text field
		totalText = new JTextField("$2305",10);
		totalText.setEditable(false);
		
		panelSouth.add(totalText);
	}
	
	private class action implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// fee radio
			int total =30;
			if(personRadio.isSelected()) {
				total += 895;
			} else if(studentRadio.isSelected()) {
				total += 495;
			}
			
			totalText.setText("$"+Integer.toString(total));
			
			//workshop
			if(workShop1.isSelected())
				total += 295;
			if(workShop2.isSelected())
				total += 295;
			if(workShop3.isSelected())
				total += 395;
			if(workShop4.isSelected())
				total += 395;
			
			totalText.setText("$"+Integer.toString(total));
		}
	}
	
	public static void main(String[] args) {
		new Challenges08();
	}
}
