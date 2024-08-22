package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListenrer;
import model.LastButtonModel;

public class LastButtonView extends JFrame {
	private LastButtonModel lastButtonModel;
	private JLabel jLabel;
	public LastButtonView() {
		this.lastButtonModel = new LastButtonModel();
		
		this.init();
		
		this.setVisible(true);
		
	}
	
	public void init() {
		this.setTitle("Last Button");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300, 300);
		
		// jpanel chứa 4 nút bấm chính
		JPanel JPanel_center = new JPanel();
		JPanel_center.setLayout(new GridLayout(2, 2));
		
		
		//tạo font chữ
		Font font = new Font("Arial", Font.BOLD, 20);
		
		// tạo ra cái actionListener
		ActionListener ac = new LastButtonListenrer(this);
		
		// tạo ra 4 nút nhấn chức năng
		JButton JButton_1 = new JButton("1");
		JButton_1.setFont(font);
		JButton_1.addActionListener(ac);
		JButton JButton_2 = new JButton("2");
		JButton_2.setFont(font);
		JButton_2.addActionListener(ac);
		JButton JButton_3 = new JButton("3");
		JButton_3.setFont(font);
		JButton_3.addActionListener(ac);
		JButton JButton_4 = new JButton("4");
		JButton_4.setFont(font);
		JButton_4.addActionListener(ac);
		JPanel_center.add(JButton_1);
		JPanel_center.add(JButton_2);
		JPanel_center.add(JButton_3);
		JPanel_center.add(JButton_4);
		
		//Jpanel chứa dòng thông tin in ra màn hình
		JPanel JPanel_footer = new JPanel();
		JPanel_footer.setLayout(new FlowLayout());
		jLabel = new JLabel("---");
		jLabel.setFont(font);
		JPanel_footer.add(jLabel);
		
		// màn hình chính
		this.setLayout(new BorderLayout());
		this.add(JPanel_center, BorderLayout.CENTER);
		this.add(JPanel_footer, BorderLayout.SOUTH);
		
		
	}
	
	public void Changeto_1() {
		this.lastButtonModel.setValue_1();
		this.jLabel.setText("Last button is " + this.lastButtonModel.getValue());
	}
	public void Changeto_2() {
		this.lastButtonModel.setValue_2();
		this.jLabel.setText("Last button is " + this.lastButtonModel.getValue());
	}
	public void Changeto_3() {
		this.lastButtonModel.setValue_3();
		this.jLabel.setText("Last button is " + this.lastButtonModel.getValue());
	}
	public void Changeto_4() {
		this.lastButtonModel.setValue_4();
		this.jLabel.setText("Last button is " + this.lastButtonModel.getValue());
	}
}
