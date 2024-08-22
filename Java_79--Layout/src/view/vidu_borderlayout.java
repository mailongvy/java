package view;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.border.Border;

public class vidu_borderlayout extends JFrame {
	public vidu_borderlayout() {
		this.setTitle("Vi Du Flow layout");
		this.setSize(600, 400);
		
		// tự động căn giữa
		this.setLocationRelativeTo(null);
		
		//set layout
		// Flow layout
		BorderLayout bl = new BorderLayout();
		BorderLayout bl_1 = new BorderLayout(50, 50);

		this.setLayout(bl);
		
		// tạo button
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		// add cac thanh phan vao frame
		this.add(jButton_1, BorderLayout.NORTH);
		this.add(jButton_2, BorderLayout.SOUTH);
		this.add(jButton_3, BorderLayout.WEST);
		this.add(jButton_4, BorderLayout.EAST);
		this.add(jButton_5, BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new vidu_borderlayout();
		
	}
}
