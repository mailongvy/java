package view;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class DrawExample extends JFrame {

	public DrawExample() throws HeadlessException {
		this.setTitle("Draw Example");
		
		this.setSize(500, 500);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		
		JPanelDraw JPanelDraw = new JPanelDraw();
		this.setLayout(new BorderLayout());
		this.add(JPanelDraw, BorderLayout.CENTER);
		
		
		
		
		this.setVisible(true);
	}
	
}
