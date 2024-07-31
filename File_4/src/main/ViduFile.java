package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViduFile {
	public static void copyAll(File f1, File f2) {
		/*
		 * khi sao chép thư mục thì ko thể sao chép bên trong bản thân thư mục
		 * khi sao chép thì có 2 trg hợp sao chép thư mục
		 * trg hợp 1 => thư mục rỗng có thể sao chép copy bthg
		 * trg hợp 2 => thư mục có thư mục con bên trong thì phải copy bản thân thư mục trc r copy các tập con bên trong
		 */
		// copy thư mục ngoài trc
		try {
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (f1.isDirectory()) {
			// copy cac thu muc con va cac tap tin con
			File[] mangcon = f1.listFiles();
			for (File file : mangcon) {
				File file_new = new File(f2.getAbsolutePath() + "\\" + file.getName());
				copyAll(file, file_new);
			}
		}
	}
	
	
	public static void main(String[] args) {
		File f0 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_4\\File_1.txt");
		File f1 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_4\\File_2.txt");
		File f2 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_4\\File_2xyz.txt");
		
		// 1. Thay đổi tên tập tin và thu mục
		// sử dụng file đê thay đổi tên
		//f0.renameTo(f1);
		
		// sử dụng files để thay đổi tên tập tin và thư mục
		// do đầu vào chỉ nhận path chuyển qua path thành hàm toPath()
//		try {
//			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//2. di chuyển file	
//		File f2_new = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_4\\F0\\File_2xyz.txt");
//		try {
//			Files.move(f2.toPath(), f2_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//3. copy file
		File f_0 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_4\\F0");
		File f_0_copy = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_4\\F0_copy");
//		try {
//			Files.copy(f_0.toPath(), f_0_copy.toPath());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		copyAll(f_0, f_0_copy);
		
		
	}
}
