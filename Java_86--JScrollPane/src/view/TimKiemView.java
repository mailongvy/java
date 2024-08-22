package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.plaf.FontUIResource;

import controller.TimKiemListenner;
import model.TimKiemModel;

public class TimKiemView extends JFrame {
	private TimKiemModel TimKiemModel;
	private JTextArea jTextarea_vanban;
	private JTextField jTextfield_tukhoa;
	private JLabel JLabel_ketqua;

	public TimKiemView() throws HeadlessException {
		this.TimKiemModel = new TimKiemModel();
		
		this.init();
		
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Tim kiem");
		
		this.setSize(600, 600);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		Font font = new FontUIResource("Arial", Font.BOLD, 14);
		JLabel JLabel_vanban = new JLabel("Van ban");
		JLabel_vanban.setFont(font);
		// tạo ra JTextarea để tạo ra được đoạn văn bản từ bàn phím từ nhiều dòng
		jTextarea_vanban = new JTextArea(100, 100);
		jTextarea_vanban.setFont(font);
		// JScrollPane: tạo ra một thanh cuộn javaswing
		JScrollPane JScrollPane = new JScrollPane(JLabel_vanban, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		
		// tạo ra jpanel chứa các jtextarea và textfield
		// center
//		JPanel JPanel_center = new JPanel();
//		JPanel_center.setLayout(new GridLayout(2, 1, 10, 10));
//		JPanel_center.add(JLabel_vanban);
//		JPanel_center.add(jTextarea_vanban);
		
		
//		footer
		ActionListener ac = new TimKiemListenner(this);
		JLabel JLabel_tukhoa = new JLabel("Tu khoa:");
		JLabel_tukhoa.setFont(font);
		jTextfield_tukhoa = new JTextField();
		jTextfield_tukhoa.setFont(font);
		
		JButton JButton_thongke = new JButton("Thong ke");
		JButton_thongke.setFont(font);
		JButton_thongke.addActionListener(ac);
//		JButton_thongke.setBackground(Color.blue);
//		JButton_thongke.setOpaque(true);
		
		JLabel_ketqua = new JLabel("Ket qua");
//		JLabel_ketqua.setBackground(Color.yellow);
//		JLabel_ketqua.setOpaque(true);
		
		JPanel JPanel_footer = new JPanel();
		JPanel_footer.setLayout(new GridLayout(2, 2, 20, 20));
		JPanel_footer.add(JLabel_tukhoa);
		JPanel_footer.add(jTextfield_tukhoa);
		JPanel_footer.add(JButton_thongke);
		JPanel_footer.add(JLabel_ketqua);
		

		
		
		this.setLayout(new BorderLayout());
		this.add(JLabel_vanban, BorderLayout.NORTH);
		this.add(JScrollPane, BorderLayout.CENTER);
		this.add(JPanel_footer, BorderLayout.SOUTH);
		
	}
	
	public void TimKiem() {
		this.TimKiemModel.setVanBan(jTextarea_vanban.getText());
		this.TimKiemModel.setTukhoa(jTextfield_tukhoa.getText());
		this.TimKiemModel.Timkiem();
		this.JLabel_ketqua.setText(this.TimKiemModel.getKetqua());
	}
	
}
