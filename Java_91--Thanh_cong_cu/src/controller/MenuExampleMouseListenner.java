package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.MenuExampleView;

public class MenuExampleMouseListenner implements MouseListener {
	MenuExampleView menuExampleView;
	
	
	public MenuExampleMouseListenner(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}


	@Override
	public void mousePressed(MouseEvent e) {
		if (e.isPopupTrigger()) {
			this.menuExampleView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.isPopupTrigger()) {
			this.menuExampleView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
		}
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}


