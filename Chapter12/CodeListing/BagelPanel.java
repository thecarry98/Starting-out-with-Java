package CodeListing;
import javax.swing.*;
import java.awt.*;

public class BagelPanel extends JPanel{

	public final double white_bagel = 1.25;
	public final double wheat_bagel = 1.50;
	
	private JRadioButton white;
	private JRadioButton wheat;
	
	private ButtonGroup bg;
	
	public BagelPanel() {
		setLayout(new GridLayout(2,1));
		
		white = new JRadioButton("White",true);
		wheat = new JRadioButton("Wheat");
		
		bg = new ButtonGroup();
		bg.add(white);
		bg.add(wheat);
		
		setBorder(BorderFactory.createTitledBorder("Bagel"));
		
		add(white);
		add(wheat);
	}
	
	public double getBagelCost() {
		double bagelCost = 0.0;
		
		if(white.isSelected()) {
			bagelCost = white_bagel;
		}else {
			bagelCost = wheat_bagel;
		}
		
		return bagelCost;
	}
	
	
}
