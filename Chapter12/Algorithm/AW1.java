package Algorithm;
import java.awt.Color;

import javax.swing.*;
public class AW1 extends JFrame{

	private final int width = 500;
	private final int height = 250;
	private JPanel panel;
	public AW1() {
		setTitle("Algorithm 1 ");
		setSize(width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setForeground(Color.red);
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AW1();
	}
}
