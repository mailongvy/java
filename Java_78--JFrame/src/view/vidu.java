package view;

import javax.swing.JFrame;

public class vidu {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		//Gắn tên
		jf.setTitle("Vi du ve JFrame");
		
		// set size cho cửa sổ
		jf.setSize(600, 400);
		
		
		
//		while (true) {
//			System.out.println("Chuong trinh dang chay !!!");
//		}
		
//		set vị trí cho cửa sổ
		jf.setLocation(300, 300);
		
		// thoát ra khỏi chương trình khi đóng cửa sổ JFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		// cho phép hiển thị luôn ở dưới cùng
		jf.setVisible(true);
	}
}
