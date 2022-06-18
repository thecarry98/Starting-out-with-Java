package Challenges;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
public class Challenges02 extends JFrame{

	private JFileChooser file;
	
	public Challenges02() {
		setTitle("Image viewer");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		file = new JFileChooser();
		
		int status = file.showOpenDialog(null);
		if(status == file.APPROVE_OPTION) {
			File filed = file.getSelectedFile();
			String name = filed.getPath();
			JOptionPane.showMessageDialog(null, name);
		}
		
		add(file);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Challenges02();
	}
}
