package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorListener implements ActionListener {
	private MyColorView MycolorView;
	
	

	public MyColorListener(MyColorView mycolorView) {
		MycolorView = mycolorView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		System.out.println("Ban da nhan nut");
		if (src.equals("Red text")) {
			this.MycolorView.ChangeTextColor(Color.red);
		}
		else if (src.equals("Yellow text")) {
			this.MycolorView.ChangeTextColor(Color.yellow);
		}
		else if (src.equals("Green text")) {
			this.MycolorView.ChangeTextColor(Color.green);
		}
		else if (src.equals("Red background")) {
			this.MycolorView.ChangeBackground(Color.red);
		}
		else if (src.equals("Yellow background")) {
			this.MycolorView.ChangeBackground(Color.yellow);
		}
		else if (src.equals("Green background")) {
			this.MycolorView.ChangeBackground(Color.green);
		}
	}
	
	
}
