package main;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.OutputStream;

public class Vidu_doc_du_lieu {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_doc_du_lieu_tu_file\\file.txt");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			Sinhvien sv =(Sinhvien) ois.readObject();
			System.out.println(sv);
			
			ois.close();
			is.close();
			
		} catch (Exception e) {	
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
