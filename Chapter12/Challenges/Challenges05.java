package Challenges;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Challenges05 extends JFrame{

	private JLabel label1,label2,label3,label4;
	private JTextField text1,text2,text3,text4;
	private JButton button1,button2,button3,button4,button5,button6;
	private JPanel panel,panel1,panel2,panel3;
	
	private final int width = 500;
	private final int height = 500;
	
	public Challenges05() {
		setTitle("Theater Revenue");
		
		setSize(width, height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		pack();
		setVisible(true);
	}
	
	private void buildPanel() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel1 = new JPanel();
		panel1.setSize(100, 300);
		panel2 = new JPanel();
		panel2.setSize(100,300);
		panel3 = new JPanel();

		panel1.setBorder(BorderFactory.createTitledBorder("Adult"));
		panel2.setBorder(BorderFactory.createTitledBorder("Child"));
		
		label1 = new JLabel("Price");
		label2 = new JLabel("Number");
		label3 = new JLabel("Price");
		label4 = new JLabel("Number");
		text1 = new JTextField(10);
		text2 = new JTextField(10);
		text3 = new JTextField(10);
		text4 = new JTextField(10);

		
		button1 = new JButton("Gross revenue");
		button2 = new JButton("Net revenue");
		button3 = new JButton("Gross revenue");
		button4 = new JButton("Net revenue");
		button5 = new JButton("Total gross revenue");
		button6 = new JButton("Total net revenue");
		
		button1.addActionListener(new CalcButtonListener());
		button2.addActionListener(new CalcButtonListener());
		button3.addActionListener(new CalcButtonListener());
		button4.addActionListener(new CalcButtonListener());
		button5.addActionListener(new CalcButtonListener());
		button6.addActionListener(new CalcButtonListener());

		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label2);
		panel1.add(text2);
		panel1.add(button1);
		panel1.add(button2);
		
		panel2.add(label3);
		panel2.add(text3);
		panel2.add(label4);
		panel2.add(text4);
		panel2.add(button3);
		panel2.add(button4);
		
		panel3.add(button5);
		panel3.add(button6);
		
		
		panel.add(panel1, BorderLayout.WEST);
		panel.add(panel2, BorderLayout.EAST);
		panel.add(panel3, BorderLayout.SOUTH);

	}
	
	private class CalcButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String input1,input2,input3,input4;
			double price1,price2;
			int number1,number2;
			input1 = text1.getText();
			input2 = text2.getText();
			input3 = text3.getText();
			input4 = text4.getText();
			
			price1 = Double.parseDouble(input1);
			price2 = Double.parseDouble(input3);
			number1 = Integer.parseInt(input2);
			number2 = Integer.parseInt(input4);
			
			double gross1 = price1*number1;
			double net1 = 0.8*gross1;
			
			double gross2 = price2*number2;
			double net2 = 0.8*gross2;
			
			// TODO Auto-generated method stub
			if(e.getSource()==button1) {
				JOptionPane.showMessageDialog(null, " adult - The gross revenue : " + gross1);
			}
			else if(e.getSource() == button2) {
				JOptionPane.showMessageDialog(null, "adult - The net revenue : " + net1);
			}
			else if(e.getSource() == button3) {
				JOptionPane.showMessageDialog(null, "child - The gross revenue  : " + gross2);
			}
			else if(e.getSource() == button4) {
				JOptionPane.showMessageDialog(null, "child - The net revenue : " + net2);
			}
			else if(e.getSource() == button5) {
				JOptionPane.showMessageDialog(null, "The total gorss : " + (gross1+gross2));
			}
			else if(e.getSource() == button6) {
				JOptionPane.showMessageDialog(null, "The total net : " + (net1+net2));
			}
		}
	}
	
	public static void main(String[] args) {
		new Challenges05();
	}
	
	
}
