package Challenges;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Challenges08 extends JFrame{

	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	private JPanel panel;
	private final int width = 100;
	private final int height = 200;
	
	public Challenges08() {
		setTitle("Latin Translator");
		
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel() {
		button1 = new JButton("sinister");
		button2 = new JButton("dexter");
		button3 = new JButton("medium");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Latin"));
		button1.setForeground(Color.red);
		button2.setForeground(Color.green);
		button3.setForeground(Color.blue);
		
		button1.addActionListener(new CalcButtonListener());
		button2.addActionListener(new CalcButtonListener());
		button3.addActionListener(new CalcButtonListener());
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		
	}
	
	private class CalcButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button1) {
				JOptionPane.showMessageDialog(null, "left");
			}else if(e.getSource()==button2) {
				JOptionPane.showMessageDialog(null, "right");
			}else if(e.getSource()==button3) {
				JOptionPane.showMessageDialog(null, "center");
			}
		}
	}
	
	public static void main(String[] args) {
		new Challenges08();
	}
}
