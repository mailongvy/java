package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class vidu_flowlayout extends JFrame {
	public vidu_flowlayout() {
		this.setTitle("Vi Du Flow layout");
		this.setSize(600, 400);
		
		// tự động căn giữa
		this.setLocationRelativeTo(null);
		
		//set layout
		// Flow layout
		FlowLayout fl = new FlowLayout();
		FlowLayout fl_1 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout fl_2 = new FlowLayout(FlowLayout.CENTER, 50, 50);

		
//		this.setLayout(fl);
//		this.setLayout(fl_1);
		this.setLayout(fl_2);
		
		// tạo button
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		// add cac thanh phan vao frame
		this.add(jButton_1);
		this.add(jButton_2);
		this.add(jButton_3);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new vidu_flowlayout();
		
	}
}
