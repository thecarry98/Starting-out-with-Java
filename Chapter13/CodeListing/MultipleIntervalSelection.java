package CodeListing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MultipleIntervalSelection extends JFrame{

	private JPanel monthPanel;
	private JPanel selectedMonthPanel;
	private JPanel buttonPanel;
	
	private JList monthList;
	private JList selectedMonthList;
	
	private JScrollPane pane1;
	private JScrollPane pane2;
	
	private JButton button;
	
	private String[]months = {
			"January","February","March","April","May","June","July","August","September","October","Novemver","December"
			};
	
	public MultipleIntervalSelection() {
		setTitle("List Demo");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		buildMonthPanel();
		buildSelectedMonthPanel();
		buildButtonPanel();
		
		add(monthPanel, BorderLayout.NORTH);
		add(selectedMonthPanel ,BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	private void buildMonthPanel() {
		monthPanel = new JPanel();
		monthList = new JList(months);
		
		monthList.setVisibleRowCount(5);
		
		monthList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		pane1 = new JScrollPane(monthList);
		
		monthPanel.add(pane1);
		
	}
	
	private void buildSelectedMonthPanel() {
		selectedMonthPanel = new JPanel();
		
		selectedMonthList = new JList();
		
		selectedMonthList.setVisibleRowCount(1);
		
		pane2 = new JScrollPane(selectedMonthList);
		selectedMonthPanel.add(pane2);
	}
	
	
	private void buildButtonPanel() {
		buttonPanel = new JPanel();
		
		button = new JButton("Get Selections");
		
		button.addActionListener(new ButtonListener());
		
		buttonPanel.add(button);
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object[]selections = monthList.getSelectedValues();
			
			selectedMonthList.setListData(selections);
		}
	}
	
	public static void main(String[] args) {
		new MultipleIntervalSelection();
	}
	
}
