package Algorithm;
import javax.swing.*;
import java.awt.*;
public class AW23 extends JFrame{

	private JList list;
	private JScrollPane pane;
	
	String []hihi = {
			"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
	};
	public AW23() {
		setTitle("Algorithm 2 ,3 ");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		list = new JList(hihi);
		list.setVisibleRowCount(3);
		pane = new JScrollPane(list);
		
		
		add(pane);
		pack();
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AW23();
	}
}
