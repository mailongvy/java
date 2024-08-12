package test;

import java.io.File;
import java.util.Scanner;

import main.danhsachsinhvien;

public class test {
	public static void clearScreen() {
        // Implement platform-specific code to clear the screen (e.g., using ANSI escape sequences)
        System.out.print("\033[H\033[2J");
        System.out.flush();
	}
	
	public static void Pause() {
		System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
	 }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		danhsachsinhvien dssv = new danhsachsinhvien();
		int luachon;
		while (true) {
			clearScreen();
			System.out.println("------------ QUAN LI SINH VIEN --------------------");
			System.out.println("--- 1. Them sinh vien vao danh sach sinh vien");
			System.out.println("--- 2. Xuat danh sach sinh vien");
			System.out.println("--- 3. Kiem tra danh sach co rong hay khong");
			System.out.println("--- 4. So luong sinh vien cua danh sach");
			System.out.println("--- 5. Lam rong danh sach sinh vien");
			System.out.println("--- 6. Tim kiem sinh vien dua vao ma sinh vien");
			System.out.println("--- 7. Xoa 1 sinh vien dua vao ma sinh vien");
			System.out.println("--- 8. Tim kiem sinh vien dua vao ten");
			System.out.println("--- 9. Xuat cac sinh vien co diem tu cao den thap");
			System.out.println("--- 10. Ghi du lieu cua danh sach sinh vien xun tap tin");
			System.out.println("---------------------------------------------------");
			System.out.println("Moi ban nhap lua chon: ");
			luachon = sc.nextInt();
			if(luachon == 1) {
				dssv.AddStudent(sc);
			}
			
			else if (luachon == 2) {
				dssv.PrintList();
				Pause();	
			}
			
			else if(luachon == 3) {
				System.out.println(dssv.CheckEmpty());
				Pause();
			}
			
			else if(luachon == 4) {
				System.out.println("Danh sach sinh vien co " + dssv.SIZE() + " sinh vien");
				Pause();
			}
			
			else if(luachon == 5) {
				dssv.CLEAR();
			}
			
			else if(luachon == 6) {
				boolean temp = dssv.Check(sc);
				System.out.println("Check: " + temp);
				Pause();
				
			}
			
			else if(luachon == 7) {
				dssv.Delete_1_Student(sc);
			}
			
			else if(luachon == 8) {
				dssv.Search_Student(sc);
			}
			
			else if(luachon == 9) {
				dssv.Sort_by_grade();
				dssv.PrintList();
				Pause();
			}
			
//			ghi xuong file
			
			else if (luachon == 10) {
				sc.nextLine();
				System.out.println("Nhap ten file: ");
				String tenfile = sc.nextLine();
				File f = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_ghi_doi_tuong_xun_file\\" + tenfile);
				dssv.ghidulieuxunFile(f);
			}
			
		}
		
	}
}
