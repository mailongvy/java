package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class vidu_gridlayout extends JFrame {
	public vidu_gridlayout() {
		this.setTitle("Vi Du Grid layout");
		this.setSize(600, 400);
		
		// tự động căn giữa
		this.setLocationRelativeTo(null);
		
		//set layout
		// Flow layout
		GridLayout gl = new GridLayout();
		GridLayout gl_1 = new GridLayout(4, 4);
		GridLayout gl_2 = new GridLayout(4, 4, 25, 25);

		
//		this.setLayout(gl);
//		this.setLayout(gl_2);
		this.setLayout(gl_2);
		
		
		// tạo button
//		JButton jButton_1 = new JButton("1");
//		JButton jButton_2 = new JButton("2");
//		JButton jButton_3 = new JButton("3");
		
		
		for (int i = 0; i < 16; i++) {
			JButton jButton = new JButton(i + "");
			this.add(jButton);
		}
		
		
		
		
		
		// add cac thanh phan vao frame
//		this.add(jButton_1);
//		this.add(jButton_2);
//		this.add(jButton_3);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new vidu_gridlayout();
		
	}
}
