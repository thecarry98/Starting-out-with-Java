package Challenges;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Challenges04 extends JFrame{

	private JComboBox decksCB,truckCB,wheelsCB;
	private JCheckBox check1,check2,check3,check4;
	private JButton calc;
	private JLabel label1,label2,label3;
	private JTextField text1,text2,text3;
	private JPanel decksPanel,truckPanel,wheelsPanel,miscellaneousPanel,totalPanel;
	private JPanel panelEast,panelWest,panelCenter,panelNorth;
	
	String []decksArray= {
			"The Master Thrasher $60","The Dictator $45","The Street King $50"
	};
	
	String []truckArray = {
			"7.75 inch axle $35","8 inch axle $40","8.5 inch axle $45"
	};
	
	String []wheelsArray = {
			"51 mm $20","55 mm $22","58 mm $24","61 mm $28"
	};
	
	
	public Challenges04() {
		setTitle("Welcome to Skate Shop");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(5,1));
		buildPanel();
		buildTotalPanel();
		
		add(decksPanel);
		add(truckPanel);
		add(wheelsPanel);
		add(miscellaneousPanel);
		add(totalPanel);

		
		pack();
		setVisible(true);
	}
	
	private void buildPanel() {
		// decksPanel
		decksPanel = new JPanel();
		decksPanel.setBorder(BorderFactory.createTitledBorder("Decks"));
		
		decksCB = new JComboBox<String>(decksArray);
		decksPanel.add(decksCB);
		
		// truck Panel
		truckPanel = new JPanel();
		truckPanel.setBorder(BorderFactory.createTitledBorder("Truck Assemblies"));
		
		truckCB = new JComboBox<String>(truckArray);
		truckPanel.add(truckCB);
		
		//wheels Panel
		
		wheelsPanel = new JPanel();
		wheelsPanel.setBorder(BorderFactory.createTitledBorder("Wheesl"));
		
		wheelsCB = new JComboBox<String>(wheelsArray);
		wheelsPanel.add(wheelsCB);
		
		//miscellaneous panel
		
		miscellaneousPanel = new JPanel();
		miscellaneousPanel.setBorder(BorderFactory.createTitledBorder("Miscellaneous"));
		
		// add check box to miscelaneous
		check1 = new JCheckBox("Grip tape : $10");
		check2 = new JCheckBox("Bearings : $30");
		check3 = new JCheckBox("Riser pads : $2");
		check4 = new JCheckBox("Nuts & bolts kit : $3");
		
		miscellaneousPanel.add(check1);
		miscellaneousPanel.add(check2);
		miscellaneousPanel.add(check3);
		miscellaneousPanel.add(check4);
		

	}
	
	private void buildTotalPanel() {
		
		// total panel
		totalPanel = new JPanel();
		totalPanel.setBorder(BorderFactory.createTitledBorder("Total"));
		totalPanel.setLayout(new BorderLayout());

		
		  //subtotal - total panel 
		panelEast = new JPanel();
		label1 = new JLabel("The Subtotal"); 
		text1 = new JTextField(10); 
		text1.setEditable(false); 

		panelEast.add(label1); 
		panelEast.add(text1); 
		totalPanel.add(panelEast, BorderLayout.EAST);

		
		  // amount of sales tax 
		panelCenter = new JPanel();
		label2 = new JLabel("The amount of sale tax"); 
		text2 = new JTextField(10); 
		text2.setEditable(false); 
		panelCenter.add(label2); 
		panelCenter.add(text2);
		  
		totalPanel.add(panelCenter,BorderLayout.CENTER);
		  
		  //total of the order
		panelWest = new JPanel();
		label3 = new JLabel("The total of the order"); 
		text3 = new JTextField(10);
		text3.setEditable(false);  
		panelWest.add(label3);
		panelWest.add(text3);
		  
		totalPanel.add(panelWest,BorderLayout.WEST);
		  
		  
		  // North panel 
		calc = new JButton("Calculate"); 
		calc.addActionListener(new actionButtonListener());
	    panelNorth = new JPanel(); 
		panelNorth.add(calc);
		  
		totalPanel.add(panelNorth,BorderLayout.NORTH);

		 
	}
	
	private class actionButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int []decksPrice = {
					60,45,50
			};
			int []truckPrice = {
					35,40,45
			};
			int []wheelsPrice = {
					20,22,24,28
			};
			
			int []misPrice = {
					10,30,2,3
			};
			
			int order = 3;
			
			int subtotal = 0;
			
			int decksChoose = decksCB.getSelectedIndex();
			int truckChoose = truckCB.getSelectedIndex();
			int wheelsChoose = wheelsCB.getSelectedIndex();
			
			subtotal = decksPrice[decksChoose]+ truckPrice[truckChoose] + wheelsPrice[wheelsChoose];
			
			if(check1.isSelected()) {
				subtotal += misPrice[0];
				order +=1;
			}
			if(check2.isSelected()) {
				subtotal +=misPrice[1];
				order+=1;

			}
			if(check3.isSelected()) {
				subtotal +=misPrice[2];
				order+=1;

			}
			if(check4.isSelected()) {
				subtotal +=misPrice[3];
				order+=1;

			}
			double amount = subtotal - (0.06 * subtotal);
			text1.setText(Integer.toString(subtotal));
			text2.setText(Double.toString(amount));
			text3.setText(Integer.toString(order));

			
			
		}
	}
	
	public static void main(String[] args) {
		new Challenges04();
	}
	
}
