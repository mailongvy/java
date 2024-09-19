package test;

import javax.swing.UIManager;

public class test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new view.Vidu();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
