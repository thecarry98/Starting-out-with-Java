package Challenges;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Challenges07 extends JFrame{
	private JPanel panelNorth,panelWest,panelCenter,panelEast,panelSouth;
	private JComboBox stylesCombo,sizesCombo;
	private JList ColorsList;
	private JScrollPane pane;
	private JSlider number;
	private JLabel label;
	private JTextField text,textTotal;
	private JLabel imageLabel;
	protected int total =50;
	protected int totalStyles = 0;
	protected int totalSizes = 0;
	protected int totalColors = 0;
	protected int totalNumber = 1;
	

	
	String []StylesArray= {
			"Regular shades : Add $0","Folding shades : Add $10","Roman shades : Add $15"
	};
	
	String []SizesArray	= {
			"25 inches wide : Add $0","27 inches wide : Add $2","32 inches wide : Add $4","40 inches wide : Add$6"
	};
	
	String []ColorsArray = {
			"Natural : Add $5","Blue : Add $0","Teal : Add $0","Red : Add $0","Green : Add $0"
	};
	public Challenges07() {
		setTitle("Shade Desinger");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		buildPanelNorth();
		buildPanelWest();
		buildPanelCenter();
		buildPanelEast();
		buildPanelSouth();
		
		add(panelNorth,BorderLayout.NORTH);
		add(panelWest,BorderLayout.WEST);
		add(panelCenter,BorderLayout.CENTER);
		add(panelEast,BorderLayout.EAST);
		add(panelSouth,BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	
	private void buildPanelNorth() {
		panelNorth = new JPanel();
		imageLabel = new JLabel();
		ImageIcon hihi = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\always.jpg");
		imageLabel.setIcon(hihi);
		
		panelNorth.add(imageLabel);
		pack();
	}
	
	private void buildPanelWest() {
		panelWest = new JPanel();
		panelWest.setBorder(BorderFactory.createTitledBorder("Style"));
		
		stylesCombo = new JComboBox<String>(StylesArray);
		stylesCombo.addActionListener(new totalAction());
		panelWest.add(stylesCombo);
		
	}
	
	private void buildPanelCenter() {
		panelCenter = new JPanel();
		panelCenter.setBorder(BorderFactory.createTitledBorder("Size"));
		
		sizesCombo = new JComboBox<String>(SizesArray);
		sizesCombo.addActionListener(new totalAction());
		
		panelCenter.add(sizesCombo);
	}
	
	private void buildPanelEast() {
		panelEast = new JPanel();
		panelEast.setBorder(BorderFactory.createTitledBorder("Color"));
		
		ColorsList = new JList<String>(ColorsArray);
		ColorsList.setVisibleRowCount(2);
		ColorsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ColorsList.addListSelectionListener(new ListListener());
		pane = new JScrollPane(ColorsList);
		
		panelEast.add(pane);
		
	}
	
	private void buildPanelSouth() {
		panelSouth = new JPanel();
		panelSouth.setBorder(BorderFactory.createTitledBorder("Total"));
		panelSouth.setLayout(new BorderLayout());
		//slider
		number = new JSlider(JSlider.HORIZONTAL,0,100,1);
		number.setMajorTickSpacing(10);
		number.setMinorTickSpacing(1);
		number.setPaintLabels(true);
		number.setPaintTicks(true);
		number.addChangeListener(new SliderListener());
		//truyền hành động vào text
		//text - slider

		panelSouth.add(number,BorderLayout.NORTH);

		
		//label
		label = new JLabel("Calculate");
		panelSouth.add(label,BorderLayout.CENTER);
		
		// text Total
		textTotal = new JTextField("55",10);
		panelSouth.add(textTotal,BorderLayout.SOUTH);
		
	}
	
	private class SliderListener implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			int num = number.getValue();
			totalNumber = num;
			
			textTotal.setText(Integer.toString((total + totalSizes + totalStyles +totalColors)*totalNumber));
		}
		
	}
	
	private class ListListener implements ListSelectionListener{

		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			if(ColorsList.getSelectedIndex()==0) {
				totalColors = 5;
			}else if(ColorsList.getSelectedIndex()==1 || ColorsList.getSelectedIndex()==2 || ColorsList.getSelectedIndex()==3 || ColorsList.getSelectedIndex()==4) {
				totalColors = 0;
			}
			
			
			textTotal.setText(Integer.toString((total + totalSizes + totalStyles +totalColors)*totalNumber));
		}
		
	}
	
	private class totalAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//int totalStyles =0;
			if(stylesCombo.getSelectedIndex()==0) {
				totalStyles = 0;
			}else if(stylesCombo.getSelectedIndex()==1) {
				totalStyles = 10;
			}else if(stylesCombo.getSelectedIndex() ==2) {
				totalStyles =15;
			}
			//total = total +totalStyles;
			textTotal.setText(Integer.toString((total + totalSizes + totalStyles +totalColors)*totalNumber));
			
			//sizes total 
			
			if(sizesCombo.getSelectedIndex()==0) {
				totalSizes = 0;
			}else if(sizesCombo.getSelectedIndex()==1) {
				totalSizes = 2;
			}else if(sizesCombo.getSelectedIndex()==2) {
				totalSizes = 4;
			}else if(sizesCombo.getSelectedIndex()==3) {
				totalSizes=6;
			}
			
			textTotal.setText(Integer.toString((total + totalSizes + totalStyles +totalColors)*totalNumber));
			 
		}
		
	}
	
	public static void main(String[] args) {
		new Challenges07();
	}
	
	
}
