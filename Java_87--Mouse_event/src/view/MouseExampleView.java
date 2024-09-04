package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseExampleController;
import model.MouseExampleModel;

public class MouseExampleView extends JFrame {
	MouseExampleModel MouseExampleModel;
	private JPanel JPanel_Mouse;
	private JLabel JLabel_x;
	private JLabel JLabel_y;
	private JLabel JLabel_count_value;
	private JLabel JLabel_checkin_value;
	private JLabel JLabel_position;
	private JLabel JLabel_count;
	private JLabel JLabel_checkin;
	private JLabel JLabel_empty_1;
	private JLabel JLabel_empty_2;

	public MouseExampleView() throws HeadlessException {
		this.MouseExampleModel = new MouseExampleModel();
		
		this.init();
		
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Mouse Example");
		
		this.setSize(600, 600);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		// tạo hàm có thể nhận vào các sự kiện thay đổi chuột
		MouseExampleController mouseExampleController = new MouseExampleController(this);
//		MouseListener mouseExampleController = new MouseExampleController(this);
//		MouseMotionListener mouseExampleController_1 = new MouseExampleController(this);
		
		// tạo 2 panel
		// 1 panel: có thể di chuyển con chuột vào
		// 1 panel: hiển thị thông số của MouseEvent
		JPanel_Mouse = new JPanel();
		JPanel_Mouse.setBackground(Color.gray);
		JPanel_Mouse.setOpaque(true);
		JPanel_Mouse.addMouseListener(mouseExampleController);
		JPanel_Mouse.addMouseMotionListener(mouseExampleController);
		
		//panel chứa các thông tin
		JPanel JPanel_info = new JPanel();
		JPanel_info.setLayout(new GridLayout(3, 3));
		Font font = new Font("Arial", Font.BOLD, 14);
		JLabel_position = new JLabel("Position: ");
		JLabel_position.setFont(font);
		JLabel_x = new JLabel("x= ");
		JLabel_x.setFont(font);
		JLabel_y = new JLabel("y= ");
		JLabel_y.setFont(font);
		JLabel_count = new JLabel("Number of click: ");
		JLabel_count.setFont(font);
		JLabel_count_value = new JLabel("n");
		JLabel_count_value.setFont(font);
		JLabel_empty_1 = new JLabel();
		JLabel_checkin = new JLabel("Mouse is in component:  ");
		JLabel_checkin.setFont(font);
		JLabel_checkin_value = new JLabel("no");
		JLabel_checkin_value.setFont(font);
		JLabel_empty_2 = new JLabel();
		JPanel_info.add(JLabel_position);
		JPanel_info.add(JLabel_x);
		JPanel_info.add(JLabel_y);
		JPanel_info.add(JLabel_count);
		JPanel_info.add(JLabel_count_value);
		JPanel_info.add(JLabel_empty_1);
		JPanel_info.add(JLabel_checkin);
		JPanel_info.add(JLabel_checkin_value);
		JPanel_info.add(JLabel_empty_2);
		
		this.setLayout(new BorderLayout());
		this.add(JPanel_Mouse, BorderLayout.CENTER);
		this.add(JPanel_info, BorderLayout.SOUTH);
	}
	
	public void Click() {
		this.MouseExampleModel.Addclick();
		this.JLabel_count_value.setText(this.MouseExampleModel.getCount() + "");
	}
	
	public void Enter() {
		this.MouseExampleModel.Enter();
		
		this.JLabel_checkin_value.setText(this.MouseExampleModel.getCheckin());
		
	}
	
	public void exit() {
		this.MouseExampleModel.exit();
		this.JLabel_checkin_value.setText(this.MouseExampleModel.getCheckin());
	}
	
	public void Update(int x, int y) {
		this.MouseExampleModel.setX(x);
		this.MouseExampleModel.setY(y);
		this.JLabel_x.setText(this.MouseExampleModel.getX() + "");
		this.JLabel_y.setText(this.MouseExampleModel.getY() + "");
	}
	
	
}
