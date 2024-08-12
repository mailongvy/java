package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/*
 * có thể dùng filewriter, bufferedwriter, printwriter
 */
public class ViduGhitext {
	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_ghi_du_lieu\\file.txt", "UTF-8");
			pw.println("Xin chao, minh la MLV");
			pw.print("Du lieu: ");
			pw.print(3.14);
			pw.print("\t");
			pw.print("La so pi");		
			pw.println();
			
			Student st = new Student(123, "Mai Long Vỹ");
			pw.println(st);
			
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
