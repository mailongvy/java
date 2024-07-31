package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ViduFile {
	File file;
	
	
	
	public ViduFile(String Tenfile) {
		this.file = new File(Tenfile);
	}

	public boolean Kiemtrathucthi() {
		// kiem tra file co duoc thuc thi ko
		return this.file.canExecute();
	}
	
	public boolean Kiemtradoc() {
		// kem tra file doc duoc hay ko dung canRead()
		return this.file.canRead();
	}

	public boolean Kiemtraghi() {
		return this.file.canWrite();
	}
	
	// hàm lấy đường dẫn
	public void Induongdan() {
		System.out.println(this.file.getAbsolutePath());
	}
	
	// hàm lấy tên
	public void InTenFile() {
		System.out.println(this.file.getName());
	}
	
	// hàm kiểm tra đay là thư muc hay là tập tin
	public void Kiemtrathumuchayhaytaptin() {
		if (this.file.isDirectory()) {
			System.out.println("Day la thu muc");
		}
		else if (this.file.isFile()) {
			System.out.println("Day la tap tin");
		}
		else {
			System.out.println("Duong dan sai");
		}
	}
	
//	in danh sach cac file con
	public void Indanhsachcacfilecon() {
		if (this.file.isDirectory()) {
			System.out.println("Day la thu muc, thu muc con la: ");
			File[] mangcon = this.file.listFiles();
//			for each la tra ve cac interator
			for (File file : mangcon) {
				System.out.println(file.getAbsolutePath());
			}
		}
		else if (this.file.isFile()) {
			System.out.println("Day la tap tin, khong co cac file con ben trong");
		}
	}
	
//	in ra cay thu muc
	public void Incaythumuc() {
		this.Inchitietcaythumuc(this.file, 1);
	}
	
	public void Inchitietcaythumuc(File f, int bac) {
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.println(f.getName());
		if (f.canRead() && f.isDirectory()) {
			File[] mangcon = f.listFiles();
			for (File fx : mangcon) {
				Inchitietcaythumuc(fx, bac + 1);
			}
//			Inchitietcaythumuc(f, bac);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luachon;
		System.out.println("Nhap ten file: ");
		String tenfile = sc.nextLine();
		ViduFile cdf = new ViduFile(tenfile);
		do {
			System.out.println("------------------- MENU ---------------------");
			System.out.println("1. Kiem tra file co duoc thuc thi hay ko");
			System.out.println("2. Kiem tra file co duoc doc hay ko");
			System.out.println("3. Kiem tra file co duoc ghi hay ko");
			System.out.println("4. In duong dan");
			System.out.println("5. In ten file");
			System.out.println("6. Kiem tra file la thu muc hoac tap tin");
			System.out.println("7. In ra danh sach file con");
			System.out.println("8. In ra cay thu muc ");
			System.out.println("0. Thoat khoi chuong trinh");
			System.out.println("----------------------------------------------");
			System.out.println("Moi ban nhap lua chon: ");
			luachon = sc.nextInt();
			
			if (luachon == 1) {
				System.out.println("Kiem tra thuc thi: " + cdf.Kiemtrathucthi());
			}
			
			else if (luachon == 2) {
				System.out.println("Kiem tra doc: " + cdf.Kiemtradoc());
			}
			else if (luachon == 3) {
				System.out.println("Kiem tra ghi " + cdf.Kiemtraghi());
			}
			else if (luachon == 4) {
				cdf.Induongdan();
			}
			else if (luachon == 5) {
				cdf.InTenFile();
			}
			else if (luachon == 6) {
				cdf.Kiemtrathumuchayhaytaptin();
			}
			else if (luachon == 7) {
				cdf.Indanhsachcacfilecon();
			}
			else if (luachon == 8) {
				cdf.Incaythumuc();
			}
			
			
			
		} while (luachon != 0);
	}
}
