package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
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
		
	}
}
