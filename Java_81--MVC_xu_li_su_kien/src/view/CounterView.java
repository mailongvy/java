		package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;


public class CounterView extends JFrame {
	private CounterModel countermodel;
	private JButton JButton_up;
	private JButton JButton_down;
	private JLabel JLabel_value;
	public CounterView() {
		this.countermodel = new CounterModel();
		this.init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Counter");
		
		this.setSize(300, 300);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac = new CounterListener(this);
		
		this.JButton_up = new JButton("Up");
		JButton_up.addActionListener(ac);
		this.JButton_down = new JButton("Down");
		JButton_down.addActionListener(ac);
		this.JLabel_value = new JLabel(this.countermodel.getValue() + "", JLabel.CENTER);
		
		JPanel JPanel = new JPanel();
		JPanel.setLayout(new BorderLayout());
		
		JPanel.add(JButton_down, BorderLayout.WEST);
		JPanel.add(JLabel_value, BorderLayout.CENTER);
		JPanel.add(JButton_up, BorderLayout.EAST);
		
		this.setLayout(new BorderLayout());
		this.add(JPanel, BorderLayout.CENTER);
	}
	
	public void Increment() {
		this.countermodel.Increment();
		this.JLabel_value.setText(this.countermodel.getValue() + "");
	}
	
	public void Decrement() {
		this.countermodel.Decremnet();
		this.JLabel_value.setText(this.countermodel.getValue() + "");
	}
}
