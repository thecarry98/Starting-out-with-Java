package CodeListing;
import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
public class ListWindow extends JFrame{

	
	private JPanel monthPanel;
	private JPanel selectedMonthPanel;
	private JList<String> monthList;
	private JScrollPane scorllPane;
	private JTextField selectedMonth;
	private JLabel label;
	
	private String[]months = {
			"January","February","March","April","May","June","July","August","September","October","Novemver","December"
	};
	
	public ListWindow() {
		setTitle("List Demo");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		buildMonthPanel();
		buildSelectedMonthPanel();
		
		add(monthPanel, BorderLayout.CENTER);
		add(selectedMonthPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	private void buildMonthPanel() {
		monthPanel = new JPanel();
		
		monthList = new JList<String>(months);
		
		monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		monthList.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		
		monthList.addListSelectionListener(new ListListener());
		
		monthList.setVisibleRowCount(5);
		scorllPane = new JScrollPane(monthList);
		//monthPanel.add(monthList);
		monthPanel.add(scorllPane);
	}
	
	private void buildSelectedMonthPanel() {
		selectedMonthPanel = new JPanel();
		
		label = new JLabel("You selected :");
		
		selectedMonth = new JTextField(10);
		
		selectedMonth.setEditable(false);
		
		selectedMonthPanel.add(label);
		selectedMonthPanel.add(selectedMonth);
	}
	
	private class ListListener implements ListSelectionListener{
		public void valueChanged(ListSelectionEvent e) {
			String selection = (String)monthList.getSelectedValue();
			
			selectedMonth.setText(selection);
		}
	}
	
	public static void main(String[] args) {
		new ListWindow();
	}
}
