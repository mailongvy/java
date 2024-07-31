package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class vidudocfile {
	public static void main(String[] args) {
//		File p0 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_ghi_du_lieu\\file.txt");
//		File p1 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_doc_du_lieu\\file.txt");
//		try {
//			Files.copy(p0.toPath(), p1.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// cachs 1
		
//		File f = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_doc_du_lieu\\file.txt");
//		try {
//			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//			String line = null;
//			while (true) {
//				line = br.readLine();
//				if (line == null) {
//					break;
//				}
//				else {
//					System.out.println(line);
//				}
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// cach 2
		File f2 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_doc_du_lieu\\file.txt");
		try {
			List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
			for (String line : allText) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
