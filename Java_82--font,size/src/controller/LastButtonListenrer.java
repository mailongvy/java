package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButtonView;

public class LastButtonListenrer implements ActionListener {
	private LastButtonView lbv;
	public LastButtonListenrer(LastButtonView lbv) {
		this.lbv = lbv;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String sukien = e.getActionCommand();
		System.out.println("Ban da nhan nut !!!");
		if (sukien.equals("1")) {
			this.lbv.Changeto_1();
		}
		else if (sukien.equals("2")) {
			this.lbv.Changeto_2();
		}
		else if (sukien.equals("3")) {
			this.lbv.Changeto_3();
		}
		else if (sukien.equals("4")) {
			this.lbv.Changeto_4();
		}
	}
	
	
}
