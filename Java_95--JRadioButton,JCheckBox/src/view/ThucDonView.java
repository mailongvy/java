package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.ThucDonController;
import model.ThucDonModel;

public class ThucDonView extends JFrame {
	public ThucDonModel thucDonModel;
	public JRadioButton jRadioButton_Com;
	public JRadioButton jRadioButton_Bun;
	public JRadioButton jRadioButton_Pho;
	public ButtonGroup buttonGroup_Monchinh;
	public JCheckBox jCheckBox_TraSua;
	public JCheckBox jCheckBox_CocaCola;
	public JCheckBox jCheckBox_BanhNgot;
	public JCheckBox jCheckBox_Nem;
//	public ButtonGroup buttonGroup_monphu;
	public JLabel jLabel_ThongTin;
	public JButton jButton_ThanhToan;
	public ArrayList<JCheckBox> list_buttonGroup_monphu;

	public ThucDonView() {
		this.thucDonModel = new ThucDonModel();
		
		this.init();
		
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Thuc Don");
		
		this.setSize(600, 600);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		this.setLayout(new BorderLayout());
		
		Font font = new Font("Arial", Font.BOLD, 14);
		
		JLabel header = new JLabel("THỰC ĐƠN NHÀ HÀNG");
		header.setFont(font);
		
		ActionListener ac = new ThucDonController(this);
		
		JPanel jPanel_tieude = new JPanel();
		jPanel_tieude.add(header);
		this.add(jPanel_tieude, BorderLayout.NORTH);
		
		
		JPanel jPanel_monchinh = new JPanel();
		jPanel_monchinh.setOpaque(true);
		jPanel_monchinh.setLayout(new GridLayout(1, 3));
		jRadioButton_Com = new JRadioButton("Cơm");
		jRadioButton_Com.setFont(font);
		jRadioButton_Bun = new JRadioButton("Bún");
		jRadioButton_Bun.setFont(font);
		jRadioButton_Pho = new JRadioButton("Phở");
		jRadioButton_Pho.setFont(font);
		buttonGroup_Monchinh = new ButtonGroup();
		buttonGroup_Monchinh.add(jRadioButton_Com);
		buttonGroup_Monchinh.add(jRadioButton_Bun);
		buttonGroup_Monchinh.add(jRadioButton_Pho);
		jPanel_monchinh.add(jRadioButton_Com);
		jPanel_monchinh.add(jRadioButton_Bun);
		jPanel_monchinh.add(jRadioButton_Pho);
		
		JPanel jPanel_monphu = new JPanel();
		jPanel_monphu.setLayout(new GridLayout(2, 2));
		jCheckBox_TraSua = new JCheckBox("Trà sữa");
		jCheckBox_TraSua.setFont(font);
		jCheckBox_CocaCola = new JCheckBox("Coca Cola");
		jCheckBox_CocaCola.setFont(font);
		jCheckBox_BanhNgot = new JCheckBox("Bánh Ngọt");
		jCheckBox_BanhNgot.setFont(font);
		jCheckBox_Nem = new JCheckBox("Nem");
		jCheckBox_Nem.setFont(font);
		list_buttonGroup_monphu = new ArrayList<JCheckBox>();
		list_buttonGroup_monphu.add(jCheckBox_TraSua);
		list_buttonGroup_monphu.add(jCheckBox_CocaCola);
		list_buttonGroup_monphu.add(jCheckBox_BanhNgot);
		list_buttonGroup_monphu.add(jCheckBox_Nem);
		jPanel_monphu.add(jCheckBox_TraSua);
		jPanel_monphu.add(jCheckBox_CocaCola);
		jPanel_monphu.add(jCheckBox_BanhNgot);
		jPanel_monphu.add(jCheckBox_Nem);
		

		JPanel jPanel_LuaChon = new JPanel();
		// gồm hai dòng một dòng liệt kê các món chính một dòng liệt kê các món phụ
		jPanel_LuaChon.setLayout(new GridLayout(2, 1));
		jPanel_LuaChon.add(jPanel_monchinh);
		jPanel_LuaChon.add(jPanel_monphu);
		this.add(jPanel_LuaChon, BorderLayout.CENTER);
		
		JPanel jPanel_thanhtoan = new JPanel();
		jPanel_thanhtoan.setLayout(new GridLayout(1, 2));
		// panel thanh toán chúng ta sẽ gồm có 1 label hiển thị thông tin chi tiết 
		// và 1 nút button để xác nhận
		jLabel_ThongTin = new JLabel();
		jLabel_ThongTin.setFont(font);
		jLabel_ThongTin.setForeground(Color.red);
		jButton_ThanhToan = new JButton("Thanh Toán");
		jButton_ThanhToan.setFont(font);
		jButton_ThanhToan.addActionListener(ac);
		jButton_ThanhToan.addActionListener(null);
		jPanel_thanhtoan.add(jLabel_ThongTin);
		jPanel_thanhtoan.add(jButton_ThanhToan);
		this.add(jPanel_thanhtoan, BorderLayout.SOUTH);
		
		
	}

	public void hienthiKetQua() {
		// TODO Auto-generated method stub
		String kq = "Mon chinh: " +  this.thucDonModel.getLuachon_Monchinh()
					+ " Mon phu: " + this.thucDonModel.getLuachon_Monphu()
					+ " Tong Tien: " + this.thucDonModel.getTongtien();
		this.jLabel_ThongTin.setText(kq);
	}

	
	
	
	
}
