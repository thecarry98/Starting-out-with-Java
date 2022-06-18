package Challenges;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Challenges03 extends JFrame{

	private JComboBox dorm,meal;
	private JPanel panel1,panel2,panel3;
	private JTextField textDisplay;
	private JButton button;
	//private JLabel display;
	
	String []dormitories = {
			"Allen Hall ($1500)","Pike Hall ($1600)","Farthing Hall ($1200)","University Suites ($1800)"
	};
	
	String []mealPlan = {
			"7 meals per week($560)","14 meals per week ($1095)","Ulimited meals ($1500)"
	};
	
	public Challenges03() {
		setTitle("Dorm and Meal Plan Calculator");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(1,3));
		buildPanel();
		add(panel1);
		add(panel2);
		add(panel3);
		pack();
		setVisible(true);
	}
	
	private void buildPanel() {
		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder("Dormitories"));
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createTitledBorder("Meal Plans"));
		
		//combo box
		dorm = new JComboBox<String>(dormitories);
		meal = new JComboBox<String>(mealPlan);
		
		panel1.add(dorm);
		panel2.add(meal);
		
		
		//panel3
		
		panel3 = new JPanel();
		panel3.setBorder(BorderFactory.createTitledBorder("hihi"));
		button = new JButton("Calculate");
		button.addActionListener(new actionButtonListener());
		textDisplay = new JTextField("Total charges",10);
		textDisplay.setEditable(false);
		panel3.add(button);
		panel3.add(textDisplay);
		//panel3.add(button);
		
	}
	
	private class actionButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int []dormPrice = {
					1500,1600,1200,1800
			};
			
			int []mealPrice = {
					560,1095,1500
			};
			int d = dorm.getSelectedIndex();
			int m = meal.getSelectedIndex();
			
			textDisplay.setText(Integer.toString(dormPrice[d]+mealPrice[m]));
		}
	}
	
	public static void main(String[] args) {
		new Challenges03();
	}
}
