package CodeListing;
import java.awt.event.*;
import javax.swing.*;
public class KiloConverter extends JFrame{
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField kiloTextField;
	private JButton calcButton;
	private final int width  = 510;
	private final int height = 100;
	
	public KiloConverter() {
		setTitle("Kilometer Converter");
		
		setSize(width,height);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		
		setVisible(true);
	}
	
	private void buildPanel() {
		messageLabel = new JLabel("Enter a distance in kilometers");
		kiloTextField = new JTextField(10);
		calcButton = new JButton("Calculate");
		
		calcButton.addActionListener( new CalcButtonListener());
		panel = new JPanel();
		
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(calcButton);
		
		
		
	}
	
	private class CalcButtonListener implements ActionListener, java.awt.event.ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			final double CONVERSION = 0.6214;
			String input;
			double miles;
			
			input = kiloTextField.getText();
			
			miles = Double.parseDouble(input)*CONVERSION;
			
			JOptionPane.showMessageDialog(null, input + "kilometter is " + miles + "miles ");
			
			
		}

	}
	
	public static void main(String []args) {
		new KiloConverter();
	}

}
