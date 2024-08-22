package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorActionListener;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame {
	private MiniCalculatorModel MiniCalculatorModel;
	JTextField JTextfield_first_value;
	JTextField JTextfield_second_value;
	JTextField JTextfield_answer;
	
	public MiniCalculatorView() {
		this.MiniCalculatorModel = new MiniCalculatorModel();
		this.init();
		
		this.setVisible(true);
		
		
	}
	
	public void init() {
		this.setTitle("Mini Calculator");
		
		this.setSize(300, 300);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		// các label hiện trên màn hình hướng dẫn nhập vào ô trống
		Font font_1 = new Font("Arial", Font.BOLD, 14);
		JLabel JLabel_first_value = new JLabel("First value:", JLabel.CENTER);
		JLabel_first_value.setFont(font_1);
		JLabel JLabel_second_value = new JLabel("Second value:", JLabel.CENTER);
		JLabel_second_value.setFont(font_1);
		JLabel JLabel_answer = new JLabel("Answer:", JLabel.CENTER);
		JLabel_answer.setFont(font_1);
		
		// sử dụng JTextfield dùng để nhập các text
		JTextfield_first_value = new JTextField(20);
		JTextfield_first_value.setFont(font_1);
		JTextfield_second_value = new JTextField(20);
		JTextfield_second_value.setFont(font_1);
		JTextfield_answer = new JTextField(20);
		JTextfield_answer.setFont(font_1);
		// jpanel chứa các label và textfield nhâp và xuất dữ liệu
		JPanel JPanel_input_output = new JPanel();
		JPanel_input_output.setLayout(new GridLayout(3, 2));
		JPanel_input_output.add(JLabel_first_value);
		JPanel_input_output.add(JTextfield_first_value);
		JPanel_input_output.add(JLabel_second_value);
		JPanel_input_output.add(JTextfield_second_value);
		JPanel_input_output.add(JLabel_answer);
		JPanel_input_output.add(JTextfield_answer);
		
		this.setLayout(new BorderLayout());
		this.add(JPanel_input_output, BorderLayout.CENTER);
		
		// tạo ra miniactionlistener để xử lí các nút bấm
		ActionListener ac = new MiniCalculatorActionListener(this);
		// phần các nút nhấn dấu cộng trừ nhân chia
		JButton JButton_plus = new JButton("+");
		JButton_plus.setFont(font_1);
		JButton_plus.addActionListener(ac);
		JButton jButton_minus = new JButton("-");
		jButton_minus.setFont(font_1);
		jButton_minus.addActionListener(ac);
		JButton JButton_multiply = new JButton("*");
		JButton_multiply.setFont(font_1);
		JButton_multiply.addActionListener(ac);
		JButton JButton_divide = new JButton("/");
		JButton_divide.setFont(font_1);
		JButton_divide.addActionListener(ac);
		JButton JButton_pow = new JButton("^");
		JButton_pow.setFont(font_1);
		JButton_pow.addActionListener(ac);
		JButton JButton_mod = new JButton("%");
		JButton_mod.setFont(font_1);
		JButton_mod.addActionListener(ac);
		
		//tạo ta một jpanel chứa tất cả các button
		JPanel jPanel_Button = new JPanel();
		jPanel_Button.setLayout(new GridLayout(2, 3));
		jPanel_Button.add(JButton_plus);
		jPanel_Button.add(jButton_minus);
		jPanel_Button.add(JButton_multiply);
		jPanel_Button.add(JButton_divide);
		jPanel_Button.add(JButton_pow);
		jPanel_Button.add(JButton_mod);
		
		// thêm cái jpanel này vào view chính
		this.add(jPanel_Button, BorderLayout.SOUTH);
		
		
		
		
	}

	public void Plus() {
		double firstvalue = Double.valueOf(JTextfield_first_value.getText());
		double secondvalue = Double.valueOf(JTextfield_second_value.getText());
		this.MiniCalculatorModel.setFirst_value(firstvalue);
		this.MiniCalculatorModel.setSecond_value(secondvalue);
		this.MiniCalculatorModel.Plus();
		this.JTextfield_answer.setText(this.MiniCalculatorModel.getAnswer() + "");
	}
	
	public void Minus() {
		double firstvalue = Double.valueOf(JTextfield_first_value.getText());
		double secondvalue = Double.valueOf(JTextfield_second_value.getText());
		this.MiniCalculatorModel.setFirst_value(firstvalue);
		this.MiniCalculatorModel.setSecond_value(secondvalue);
		this.MiniCalculatorModel.Minus();
		this.JTextfield_answer.setText(this.MiniCalculatorModel.getAnswer() + "");
	}
	
	public void Multiply() {
		double firstvalue = Double.valueOf(JTextfield_first_value.getText());
		double secondvalue = Double.valueOf(JTextfield_second_value.getText());
		this.MiniCalculatorModel.setFirst_value(firstvalue);
		this.MiniCalculatorModel.setSecond_value(secondvalue);
		this.MiniCalculatorModel.Multiply();
		this.JTextfield_answer.setText(this.MiniCalculatorModel.getAnswer() + "");
	}
	
	public void Divide() {
		double firstvalue = Double.valueOf(JTextfield_first_value.getText());
		double secondvalue = Double.valueOf(JTextfield_second_value.getText());
		this.MiniCalculatorModel.setFirst_value(firstvalue);
		this.MiniCalculatorModel.setSecond_value(secondvalue);
		this.MiniCalculatorModel.Divide();
		this.JTextfield_answer.setText(this.MiniCalculatorModel.getAnswer() + "");
	}
	
	public void Pow() {
		double firstvalue = Double.valueOf(JTextfield_first_value.getText());
		double secondvalue = Double.valueOf(JTextfield_second_value.getText());
		this.MiniCalculatorModel.setFirst_value(firstvalue);
		this.MiniCalculatorModel.setSecond_value(secondvalue);
		this.MiniCalculatorModel.Pow();
		this.JTextfield_answer.setText(this.MiniCalculatorModel.getAnswer() + "");
	}
	
	public void Mod() {
		double firstvalue = Double.valueOf(JTextfield_first_value.getText());
		double secondvalue = Double.valueOf(JTextfield_second_value.getText());
		this.MiniCalculatorModel.setFirst_value(firstvalue);
		this.MiniCalculatorModel.setSecond_value(secondvalue);
		this.MiniCalculatorModel.Mod();
		this.JTextfield_answer.setText(this.MiniCalculatorModel.getAnswer() + "");
	}
}
