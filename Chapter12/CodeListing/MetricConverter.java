package CodeListing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MetricConverter extends JFrame{

	private JPanel panel;
	private JLabel messageLabel;
	private JTextField text;
	private JRadioButton mile;
	private JRadioButton feet;
	private JRadioButton inches;
	private ButtonGroup radioButtonGroup;
	private final int width = 400;
	private final int height = 200;
	
	public MetricConverter() {
		setTitle("Metric converter");
		
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		
		setVisible(true);
		
	}
	
	private void buildPanel() {
		messageLabel = new JLabel("Enter a distance in kilometers ");
		text = new JTextField(10);
		
		mile = new JRadioButton("Converter to miles");
		feet = new JRadioButton("Converter to feet");
		inches = new JRadioButton("Converter to inches");
		
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(mile);
		radioButtonGroup.add(feet);
		radioButtonGroup.add(inches);
		
		mile.addActionListener(new RadioButtonListener());
		feet.addActionListener(new RadioButtonListener());
		inches.addActionListener(new RadioButtonListener());
		
		panel = new JPanel();
		panel.add(messageLabel);
		//panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		//panel.setBorder(BorderFactory.createTitledBorder("Choices"));
		//panel.setBorder(BorderFactory.createLineBorder(Color.green, 1));
		//panel.setBorder(BorderFactory.createTitledBorder("Choices"));
		panel.add(text);
		panel.add(mile);
		panel.add(feet);
		panel.add(inches);
		
		
		
	}
	
	private class RadioButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String input;
			String convertTo = "";
			double result = 0.0;
			
			
			input = text.getText();
			
			if(e.getSource() == mile) {
				convertTo = "miles";
				result = Double.parseDouble(input)*0.6214;
			}else if(e.getSource()==feet){
				convertTo = "feet";
				result = Double.parseDouble(input)*3281.0;
			}else if(e.getSource()==inches) {
				convertTo = "inches";
				result = Double.parseDouble(input)*39370.0;
			}
			
			JOptionPane.showMessageDialog(null, input + "kilometer is " + result + convertTo);
		}
	}
	
	public static void main(String[] args) {
		new MetricConverter();
	}
}
