package CodeListing;
import javax.swing.*;
import java.awt.*;
public class ToppingPanel extends JPanel{

	public final double CREAM_CHEESE = 0.5;
	public final double BUTTER = 0.25;
	public final double PEACH_JELLY = 0.75;
	public final double BLUEBERRY_JAM = 0.75;
	
	private JCheckBox creamCheese;
	private JCheckBox butter;
	private JCheckBox peachJelly;
	private JCheckBox blueberryJam;
	
	public ToppingPanel() {
		setLayout(new GridLayout(4,1));
		
		creamCheese = new JCheckBox("Cream chesse");
		butter = new JCheckBox("Butter");
		peachJelly = new JCheckBox("Peach jelly");
		blueberryJam = new JCheckBox("Blueberry jam");
		
		setBorder(BorderFactory.createTitledBorder("Toppings"));
		
		add(creamCheese);
		add(butter);
		add(peachJelly);
		add(blueberryJam);
	}
	
	public double getToppingCost() {
		double toppingCost = 0.0;
		
		if(creamCheese.isSelected()) {
			toppingCost += CREAM_CHEESE;
		}
		if(butter.isSelected()) {
			toppingCost += BUTTER;
		}
		if(peachJelly.isSelected()) {
			toppingCost += PEACH_JELLY;
		}
		if(blueberryJam.isSelected()) {
			toppingCost += BLUEBERRY_JAM;
		}
		
		return toppingCost;
	}
}
