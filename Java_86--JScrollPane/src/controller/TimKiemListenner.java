package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TimKiemView;

public class TimKiemListenner implements ActionListener {
	private TimKiemView TimKiemView;
	
	

	public TimKiemListenner(view.TimKiemView timKiemView) {
		TimKiemView = timKiemView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String thongke = e.getActionCommand();
		if (thongke.equals("Thong ke")) {
			this.TimKiemView.TimKiem();
		}
	}
	
	
}
