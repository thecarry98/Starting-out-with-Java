
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Challenges09 extends JFrame{
	private JPanel panelWest,panelEast,panelSouth;
	private JLabel labelWest,labelEast,labelSouth;
	
	private JButton rollTheDice;
	private Die roll1,roll2;
	
	private ImageIcon image1 = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\1.jpg");
	private ImageIcon image2 = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\2.jpg");
	private ImageIcon image3 = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\3.jpg");
	private ImageIcon image4 = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\4.jpg");
	private ImageIcon image5 = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\5.jpg");
	private ImageIcon image6 = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\6.jpg");
	public Challenges09() {
		setTitle("Dice Simulator");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		buildPanelImages();
		buildPanelSouth();
		add(panelWest,BorderLayout.WEST);
		add(panelEast,BorderLayout.EAST);
		add(panelSouth,BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	
	private void buildPanelImages() {
		panelWest = new JPanel();
		panelWest.setBorder(BorderFactory.createTitledBorder("First"));
		labelWest = new JLabel();
		labelWest.setIcon(image1);
		panelEast = new JPanel();
		panelEast.setBorder(BorderFactory.createTitledBorder("Second"));
		labelEast = new JLabel();
		labelEast.setIcon(image1);
		
		//ImageIcon image1 = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\1.jpg");
		//ImageIcon image2 = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\2.jpg");
		//ImageIcon image3 = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\3.jpg");
		//ImageIcon image4 = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\4.jpg");
		//ImageIcon image5 = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\5.jpg");
		//ImageIcon image6 = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\6.jpg");
		
		panelWest.add(labelWest);
		panelEast.add(labelEast);

	}
	
	private void buildPanelSouth() {
		rollTheDice = new JButton("Roll the Dice");
		panelSouth = new JPanel();
		rollTheDice.addActionListener(new actionButtonListener());
		panelSouth.add(rollTheDice);
	}
	
	private class actionButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			roll1 = new Die(6);
			roll2 = new Die(6);
			roll1.roll();
			roll2.roll();
			
			if(roll1.getValue()==1)
				labelWest.setIcon(image1);
			else if(roll1.getValue()==2)
				labelWest.setIcon(image2);
			else if(roll1.getValue()==3)
				labelWest.setIcon(image3);
			else if(roll1.getValue()==4)
				labelWest.setIcon(image4);
			else if(roll1.getValue()==5)
				labelWest.setIcon(image5);
			else if(roll1.getValue()==6)
				labelWest.setIcon(image6);
			
			if(roll2.getValue()==1)
				labelEast.setIcon(image1);
			else if(roll2.getValue()==2)
				labelEast.setIcon(image2);
			else if(roll2.getValue()==3)
				labelEast.setIcon(image3);
			else if(roll2.getValue()==4)
				labelEast.setIcon(image4);
			else if(roll2.getValue()==5)
				labelEast.setIcon(image5);
			else if(roll2.getValue()==6)
				labelEast.setIcon(image6);
			
			pack();
		}
	}
	
	public static void main(String[] args) {
		new Challenges09();
	}
	
	
	
}
