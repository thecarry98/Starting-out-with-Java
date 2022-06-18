package CodeListing;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class TempConverter extends JFrame{

	private JLabel label1,label2;
	private JTextField fahTemp;
	private JTextField celTemp;
	private JPanel fpanel;
	private JPanel cpanel;
	
	private JPanel sliderPanel;
	private JSlider slider;
	
	public TempConverter() {
		setTitle("Temperatures");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label1 = new JLabel("Fahrenheit :");
		label2 = new JLabel("Celsius :");
		
		fahTemp = new JTextField("32.0",10);
		fahTemp.setEditable(false);
		
		celTemp = new JTextField("0.0",10);
		celTemp.setEditable(false);
		
		slider = new JSlider(JSlider.HORIZONTAL,0,100,0);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		slider.addChangeListener(new SliderListener());
		
		fpanel = new JPanel();
		fpanel.add(label1);
		fpanel.add(fahTemp);
		
		cpanel = new JPanel();
		cpanel.add(label2);
		cpanel.add(celTemp);
		
		sliderPanel = new JPanel();
		sliderPanel.add(slider);
		
		setLayout(new GridLayout(3,1));
		
		add(fpanel);
		add(cpanel);
		add(sliderPanel);
		
		pack();
		setVisible(true);
	}
	
	
	private class SliderListener implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
			double fah , cel;
			
			cel = slider.getValue();
			
			fah = (9.0/5.0)*cel +32.0;
			
			celTemp.setText(Double.toString(cel));
			
			fahTemp.setText(String.format("%.1f", fah));
		}
	}
	
	public static void main(String[] args) {
		new TempConverter();
	}
}
