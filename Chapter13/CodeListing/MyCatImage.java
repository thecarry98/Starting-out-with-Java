package CodeListing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyCatImage extends JFrame{

	private JPanel imagePanel;
	private JPanel buttonPanel;
	private JLabel imageLabel;
	private JButton button;
	
	public MyCatImage() {
		setTitle("My cat");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		buildImagePanel();
		buildButtonPanel();
		
		add(imagePanel,BorderLayout.CENTER);
		add(buttonPanel,BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	private void buildImagePanel() {
		imagePanel = new JPanel();
		
		imageLabel = new JLabel("Click the button to see an image of my cat");
		
		imagePanel.add(imageLabel);
	}
	
	private void buildButtonPanel() {
		ImageIcon smileyImage;
		
		buttonPanel = new JPanel();
		
		smileyImage = new ImageIcon("Smiley.gif");
		
		button = new JButton("Get Image");
		
		button.setIcon(smileyImage);
		button.setToolTipText("hihi");
		button.setMnemonic(KeyEvent.VK_G);
		
		button.addActionListener(new ButtonListener());
		
		buttonPanel.add(button);
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ImageIcon cat = new ImageIcon("C:\\Users\\Viet Anh\\Desktop\\abc\\always.jpg");
			
			imageLabel.setIcon(cat);
			
			imageLabel.setText(null);
			
			pack();
		}
	}
	
	public static void main(String[] args) {
		new MyCatImage();
	}
}
