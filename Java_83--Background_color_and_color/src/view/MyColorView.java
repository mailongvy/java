package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorListener;
import model.MyColorModel;

public class MyColorView extends JFrame {
	MyColorModel MyColorModel;
	private JLabel jLabel_value;
	
	
	public MyColorView() {
		this.MyColorModel = new MyColorModel();
		this.init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("My Color");
		
		this.setSize(800, 600);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// tạo jpanel để chứa cái text để thay đổi màu
		Font font_text = new Font("Arial", Font.BOLD, 80);
		JPanel JPanel_center = new JPanel();
		JPanel_center.setLayout(new BorderLayout());
		this.jLabel_value = new JLabel("TEXT", JLabel.CENTER);
		this.jLabel_value.setFont(font_text);
		JPanel_center.add(jLabel_value);
		
		// tạo japnel chứa các nút thay đổi màu
		// hai hàng hàng 1: là các màu thay đổi màu chữ gồm xanh vàng đỏ
		// hàng 2: là các màu thay đổi màu nền gồm xanh vàng đỏ
		JPanel JPanel_color = new JPanel();
		JPanel_color.setLayout(new GridLayout(2, 3));
		//Tạo các nút chứa các màu để thay đổi
		// 1: các nút điều chỉnh màu sắc cho text
		ActionListener ac = new MyColorListener(this);
		Font font = new Font("Arial", Font.BOLD, 14);
		JButton JButton_text_red = new JButton("Red text");
		JButton_text_red.setFont(font);
		JButton_text_red.setForeground(Color.red);
		JButton_text_red.addActionListener(ac);
		
		JButton JButton_text_yellow = new JButton("Yellow text");
		JButton_text_yellow.setFont(font);
		JButton_text_yellow.setForeground(Color.yellow);
		JButton_text_yellow.addActionListener(ac);
		
		JButton JButton_text_green = new JButton("Green text");
		JButton_text_green.setFont(font);
		JButton_text_green.setForeground(Color.green);
		JButton_text_green.addActionListener(ac);
		//2: các nút điều chỉnh màu cho background
		JButton JButton_background_red = new JButton("Red background");
		JButton_background_red.setFont(font);
		JButton_background_red.setBackground(Color.red);
		JButton_background_red.addActionListener(ac);
		
		JButton JButton_background_yellow = new JButton("Yellow background");
		JButton_background_yellow.setFont(font);
		JButton_background_yellow.setBackground(Color.yellow);
		JButton_background_yellow.addActionListener(ac);
		
		JButton JButton_background_green = new JButton("Green background");
		JButton_background_green.setFont(font);
		JButton_background_green.setBackground(Color.green);
		JButton_background_green.addActionListener(ac);
		
		
		JPanel_color.add(JButton_text_red);
		JPanel_color.add(JButton_text_yellow);
		JPanel_color.add(JButton_text_green);
		JPanel_color.add(JButton_background_red);
		JPanel_color.add(JButton_background_yellow);
		JPanel_color.add(JButton_background_green);
		
		// add các panel vao view chính
		this.setLayout(new BorderLayout());
		this.add(JPanel_center, BorderLayout.NORTH);
		this.add(JPanel_color, BorderLayout.CENTER);
		
	}
	
	public void ChangeTextColor(Color c) {
		this.jLabel_value.setForeground(c);
	}
	
	public void ChangeBackground(Color c) {
		this.jLabel_value.setBackground(c);
		this.jLabel_value.setOpaque(true);
	}
	
}
