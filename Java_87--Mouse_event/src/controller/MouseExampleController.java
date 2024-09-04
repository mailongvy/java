package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.MouseExampleView;

public class MouseExampleController implements MouseListener, MouseMotionListener {
	private MouseExampleView mouseExampleView;
	
	
	
	public MouseExampleController(MouseExampleView mouseExampleView) {
		super();
		this.mouseExampleView = mouseExampleView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		this.mouseExampleView.Click();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		this.mouseExampleView.Enter();
		int x = e.getX();
		int y = e.getY();
		this.mouseExampleView.Update(x, y);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.mouseExampleView.exit();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		this.mouseExampleView.Update(x, y);
	}

	

}
