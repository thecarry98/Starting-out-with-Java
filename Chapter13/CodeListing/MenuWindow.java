package CodeListing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuWindow extends JFrame{

	private JLabel messageLabel;
	private final int width = 400;
	private final int height = 200;
	
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu textMenu;
	private JMenuItem exitItem;
	private JRadioButtonMenuItem blackItem;
	private JRadioButtonMenuItem redItem;
	private JRadioButtonMenuItem blueItem;
	private JCheckBoxMenuItem visibleItem;
	
	public MenuWindow() {
		setTitle("Example Menu System");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		messageLabel = new JLabel("Use the text menu to change my color and make me invisible", SwingConstants.CENTER);
		
		messageLabel.setPreferredSize(new Dimension(width,height));
		
		messageLabel.setForeground(Color.black);
		
		add(messageLabel);
		buildMenuBar();
		
		pack();
		setVisible(true);
	}
	
	private void buildMenuBar() {
		menuBar = new JMenuBar();	
		
		buildFieldMenu();
		buildTextMenu();
		
		menuBar.add(fileMenu);
		menuBar.add(textMenu);
		
		setJMenuBar(menuBar);
	}
	
	private void buildFieldMenu() {
		exitItem = new JMenuItem("Exit");
		exitItem.setMnemonic(KeyEvent.VK_X);
		exitItem.setToolTipText("Alt + X");
		
		exitItem.addActionListener(new ExitListener());
		
		fileMenu = new JMenu("File");
		
		fileMenu.setMnemonic(KeyEvent.VK_F);
		fileMenu.setToolTipText("Alt + F");
		
		fileMenu.add(exitItem);
	}
	
	private void buildTextMenu() {
		blackItem = new JRadioButtonMenuItem("Black",true);
		
		blackItem.setMnemonic(KeyEvent.VK_B);
		blackItem.setToolTipText("Alt + B");
		
		blackItem.addActionListener(new ColorListener());
		
		redItem = new JRadioButtonMenuItem("Red");
		redItem.setMnemonic(KeyEvent.VK_R);
		redItem.setToolTipText("Alt + R");
		redItem.addActionListener(new ColorListener());
		
		blueItem = new JRadioButtonMenuItem("Blue");
		blueItem.setMnemonic(KeyEvent.VK_U);
		blueItem.setToolTipText("Alt + U");
		blueItem.addActionListener(new ColorListener());
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(blackItem);
		group.add(redItem);
		group.add(blueItem);
		
		visibleItem = new JCheckBoxMenuItem("Visible",true);
		visibleItem.setMnemonic(KeyEvent.VK_V);
		visibleItem.addActionListener(new VisibleListener());
		
		textMenu = new JMenu("Text");
		textMenu.setMnemonic(KeyEvent.VK_T);
		textMenu.setToolTipText("Alt + T");
		
		textMenu.add(blackItem);
		textMenu.add(redItem);
		textMenu.add(blueItem);
		textMenu.addSeparator(); //thanh ph�n c�ch
		textMenu.add(visibleItem);
	}
	
	private class ExitListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	private class ColorListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(blackItem.isSelected()) {
				messageLabel.setForeground(Color.black);
			}
			else if(redItem.isSelected()) {
				messageLabel.setForeground(Color.red);
			}
			else if (blueItem.isSelected()) {
				messageLabel.setForeground(Color.blue);
			}
		}
	}
	
	private class VisibleListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(visibleItem.isSelected()) {
				messageLabel.setVisible(true);
			}
			else {
				messageLabel.setVisible(false);
			}
		}
	}
	
	
	public static void main(String[] args) {
		new MenuWindow();
	}
}
