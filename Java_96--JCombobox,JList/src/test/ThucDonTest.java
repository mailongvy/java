package test;

import javax.swing.UIManager;

import view.ThucDonView;

public class ThucDonTest {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new ThucDonView();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
