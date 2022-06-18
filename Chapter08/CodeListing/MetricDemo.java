package CodeListing;

import javax.swing.JOptionPane;

public class MetricDemo {
	public static void main(String[] args) {
		String input;
		double miles;
		double kilo;
		
		input = JOptionPane.showInputDialog("moi nhap so miles :");
		miles = Double.parseDouble(input);
		
		kilo  = Metric.MilesToKm(miles);
		
		JOptionPane.showMessageDialog(null, kilo);
		
		input = JOptionPane.showInputDialog("moi nhap so km: ");
		kilo  = Double.parseDouble(input);
		
		miles = Metric.KmToMiles(kilo);
		
		JOptionPane.showMessageDialog(null, miles);
	}

}
