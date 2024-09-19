package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import view.ThucDonView;

public class ThucDonController implements ActionListener {
	private ThucDonView thucdonView;

	
	public ThucDonController(ThucDonView thucdonView) {
		super();
		this.thucdonView = thucdonView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String monchinh = thucdonView.jComboBox_MonChinh.getSelectedItem().toString();
		
		
		String monphu = "";
		Object[] luachonMonPhu =  thucdonView.jList_MonPhu.getSelectedValues();
		for (Object object : luachonMonPhu) {
			monphu = monphu + object.toString() + "; ";
		}
		
		
		thucdonView.thucDonModel.setLuachon_Monchinh(monchinh);
		thucdonView.thucDonModel.setLuachon_Monphu(monphu);
		thucdonView.thucDonModel.TinhTongTien();
		thucdonView.hienthiKetQua();
		
		String sotien_chu = (String) JOptionPane.showInputDialog(
				thucdonView,
				thucdonView.jLabel_ThongTin.getText()
				+ "\nNhap vao so tien: " ,
				"Thong Bao",
				JOptionPane.PLAIN_MESSAGE
				);
		
		try {
			double sotien = Double.valueOf(sotien_chu);
			JOptionPane.showMessageDialog(thucdonView,
				    "Thối tiền lại cho khách: "+(sotien - thucdonView.thucDonModel.getTongtien()),
				    "Infor",
				    JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e2) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(thucdonView,
				    "Nhập dữ liệu sai!",
				    "Error",
				    JOptionPane.ERROR_MESSAGE);
		}
	}
}
