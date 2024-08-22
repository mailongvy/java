package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	
//	JFrame jf;
	
	public MyWindow() {
//		jf = new JFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void Show() {
		this.setVisible(true);
		
	}
	
	public void Show(String title) {
		this.setTitle(title);
		this.setVisible(true);
		
	}
	
	public void Show(String title, int width, int height) {
		this.setSize(width, height);
		this.setTitle(title);
		this.setVisible(true);
		
	}
	
	public void Show(String title, int width, int height, int x, int y) {
		this.setSize(width, height);
		this.setTitle(title);
		this.setVisible(true);
		this.setLocation(x, y);
		
	}
	
	
	public static void main(String[] args) {
		MyWindow mw = new MyWindow();
		mw.Show("hehe", 600, 300, 300, 300);
	}
	
	
}
