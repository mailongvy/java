package test;

import java.io.File;
import java.io.IOException;

public class ViduTaoTapTinVaThuMuc {
	public static void main(String[] args) {
		/*
		 * Lưu ý: 
		 * MS Windows: \ => \\ vidu: C:\\Thu_muc_1\\Thu_muc_2\\tap_tin.txt
		 * linux, macos: / => vidu: /thu_muc/thu_muc_2/ten tap tin.txt
		 */
		
//		kiem tra thu muc va tap tin co ton tai hay ko
		File folder1 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File");
		File folder2 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File\\java68");
		
		System.out.println("Kiem tra folder1 co ton tai hay ko: " + folder1.exists());
		System.out.println("Kiem tra folder2 co ton tai hay ko: " + folder2.exists());
		
//		tạo thư mục
//		phuong thức mkdir: make directory
//		mkdir() => tạo một thu mục 
		File d1 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File\\Directory_1");
		d1.mkdir();
		
//		phương thức mkdirs() => tạo ra nhiều thư mục cùng lúc
		File d2 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File\\Directory_1\\Directory_2\\Dỉrectory_3\\Directory_4");
		d2.mkdirs();
		
//		tạo tập tin (có phần mở rộng: .exe, .txt, .doc, .xls)
		File file1 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File\\Directory_1\\vidu1.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			không có quyền tạo tập tin
//			ổ cứng bị đầy ko thể tạo tập tin
//			đường dẫn sai
			
			e.printStackTrace();
		}
	}
}
