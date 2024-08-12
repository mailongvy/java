package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Vidughidoituong {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_ghi_doi_tuong_xun_file\\file.txt");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			Sinhvien sv = new Sinhvien();
			oos.writeObject(sv);
			oos.flush();
			
			oos.close();
			os.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
