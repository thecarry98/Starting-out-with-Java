package Challenges;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Challenges06 extends JFrame{

	private JMenuBar menuBar;
	private JMenu Menu,Calc;
	private JMenuItem exit;
	//private JMenuItem packages,phones,options;
	private JRadioButtonMenuItem rbPackages1,rbPackages2,rbPackages3,rbPhone1,rbPhone2,rbPhone3;
	private JCheckBoxMenuItem cbOp1,cbOp2;
	private ButtonGroup packagesGroup,phonesGroup;
	private final int width = 200;
	private final int height = 200;
	private JLabel label;
	private JTextField text;
	private JPanel panel;
	
	public Challenges06() {
		setTitle("Cell Phone Packages");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		buildMenuBar();
		add(panel);
		pack();
		setVisible(true);
		
	}
	private void buildPanel() {
		panel = new JPanel();
		label = new JLabel("TOTAL");
		text = new JTextField(10);
		text.setEditable(false);
		label.setPreferredSize(new Dimension(width,height));
		panel.add(label);
		panel.add(text);
	}
	private void buildMenuBar() {
		menuBar = new JMenuBar();
		
		buildMenu();
		buildCalc();
		
		menuBar.add(Menu);
		menuBar.add(Calc);
		
		setJMenuBar(menuBar);
	}
	
	private void buildMenu() {
		Menu = new JMenu("Menu");
		exit = new JMenuItem("Exit");
		exit.addActionListener(new ExitListener());
		exit.setMnemonic(KeyEvent.VK_X);
		
		Menu.add(exit);
	}
	
	private class ExitListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	//build Calc
	
	private void buildCalc() {
		Calc = new JMenu("Calculate");
		
		//set packages
		rbPackages1 = new JRadioButtonMenuItem("300 minutes per month");
		rbPackages1.setToolTipText("$45.00");
		rbPackages1.addActionListener(new totalListener());
		
		rbPackages2 = new JRadioButtonMenuItem("800 minutes per month");
		rbPackages2.setToolTipText("$65.00");
		rbPackages2.addActionListener(new totalListener());

		rbPackages3 = new JRadioButtonMenuItem("1500 minutes per month");
		rbPackages3.setToolTipText("$99.00");
		rbPackages3.addActionListener(new totalListener());

		
		packagesGroup = new ButtonGroup();
		packagesGroup.add(rbPackages1);
		packagesGroup.add(rbPackages2);
		packagesGroup.add(rbPackages3);
		
		// set phones
		
		rbPhone1 = new JRadioButtonMenuItem("Model 100");
		rbPhone1.setToolTipText("$29.95");
		rbPhone1.addActionListener(new totalListener());
		
		rbPhone2 = new JRadioButtonMenuItem("Model 110");
		rbPhone2.setToolTipText("$49.95");
		rbPhone2.addActionListener(new totalListener());

		rbPhone3 = new JRadioButtonMenuItem("Model 200");
		rbPhone3.setToolTipText("$99.95");
		rbPhone3.addActionListener(new totalListener());

		phonesGroup = new ButtonGroup();
		phonesGroup.add(rbPhone1);
		phonesGroup.add(rbPhone2);
		phonesGroup.add(rbPhone3);


		//set options;
		cbOp1 = new JCheckBoxMenuItem("Voice mail");
		cbOp1.addActionListener(new totalListener());
		cbOp2 = new JCheckBoxMenuItem("Text messaging");
		cbOp2.addActionListener(new totalListener());
		
		Calc.add(rbPackages1);
		Calc.add(rbPackages2);
		Calc.add(rbPackages3);
		
		Calc.addSeparator();
		
		Calc.add(rbPhone1);
		Calc.add(rbPhone2);
		Calc.add(rbPhone3);

		Calc.addSeparator();
		
		Calc.add(cbOp1);
		Calc.add(cbOp2);


	}
	
	private class totalListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double total = 0;
			if(rbPackages1.isSelected()) {
				total += 45.00;
				text.setText(Double.toString(total));
			}else if(rbPackages2.isSelected()) {
				total += 65.00;
				text.setText(Double.toString(total));

			}else if(rbPackages3.isSelected()) {
				total += 99.00;
				text.setText(Double.toString(total));
			}
			
			if(rbPhone1.isSelected()) {
				total += 29.95;
				text.setText(Double.toString(total));

			}else if(rbPhone2.isSelected()) {
				total += 49.95;
				text.setText(Double.toString(total));

			}else if(rbPhone3.isSelected()) {
				total += 99.95;
				text.setText(Double.toString(total));

			}
			
			if(cbOp1.isSelected()) {
				total += 5.00;
				text.setText(Double.toString(total));

			}
			if(cbOp2.isSelected()) {
				total += 10.00;
				text.setText(Double.toString(total));

			}
		}
	}
	public static void main(String[] args) {
		new Challenges06();
	}
}