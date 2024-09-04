package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener {
	private MenuExampleView MenuExampleView;
	
	
	public MenuExampleController(view.MenuExampleView menuExampleView) {
		MenuExampleView = menuExampleView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		
		if (button.equals("Open")) {
			this.MenuExampleView.setText_JLabel("Ban da click JMenuItem Open");
		}
		else if (button.equals("Exit")) {
//			this.MenuExampleView.setText_JLabel("Ban da click JMenuItem Exit");
			System.exit(0);

		}
		else if (button.equals("Welcome")) {
			this.MenuExampleView.setText_JLabel("Ban da click JMenuItem Welcome");

		}
	}
	
}
