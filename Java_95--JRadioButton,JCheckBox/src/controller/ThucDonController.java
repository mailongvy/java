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
		String monchinh = "";
		Enumeration<AbstractButton> button_monChinh = thucdonView.buttonGroup_Monchinh.getElements();
		while (button_monChinh.hasMoreElements()) {
			AbstractButton a = button_monChinh.nextElement();
			if (a.isSelected()) {
				monchinh = a.getText();
			}
		}
		
		String monphu = "";
		for (AbstractButton b : thucdonView.list_buttonGroup_monphu) {
			if (b.isSelected()) {
				monphu = monphu + b.getText() +"; ";
			}
		}
		
		
		thucdonView.thucDonModel.setLuachon_Monchinh(monchinh);
		thucdonView.thucDonModel.setLuachon_Monphu(monphu);
		thucdonView.thucDonModel.TinhTongTien();
		thucdonView.hienthiKetQua();
		
	}
}
