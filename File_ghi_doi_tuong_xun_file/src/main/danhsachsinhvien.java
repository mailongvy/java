package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class danhsachsinhvien {
	private ArrayList<Sinhvien> dssv;
	
	

	public danhsachsinhvien(ArrayList<Sinhvien> dssv) {
		this.dssv = dssv;
	}

	public danhsachsinhvien() {
		this.dssv = new ArrayList<Sinhvien>();
	}
	
	
	
	public ArrayList<Sinhvien> getDssv() {
		return dssv;
	}

	public void setDssv(ArrayList<Sinhvien> dssv) {
		this.dssv = dssv;
	}

//	them sinh vien vao danh sach sinh vien
	public void AddStudent(Scanner sc) {
		int n;
		System.out.println("Moi ban nhap so sinh vien can them: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Moi ban nhap sinh vien thu " + (i + 1) + " : ");
			Sinhvien sv = new Sinhvien();
			dssv.add(sv);
		}
		
	}
	
	
//  in danh sach sinh vien
	public void PrintList() {
		for (int i = 0; i < this.dssv.size(); i++) {
			System.out.println("Sinh vien thu " + (i + 1) + " : ");
			System.out.println(this.dssv.get(i).toString());
		}
	}
	
//	kiem tra danh sach sinh vien co rong hay ko
	public boolean CheckEmpty() {
//		if (this.dssv.isEmpty()) {
//			return true;
//		}
//		return false;
		return this.dssv.isEmpty();
	}
	
//	lay ra so luong sinh vien trong danh sach
	public int SIZE() {
		return this.dssv.size();
	}
	
//	lam rong danh sach sinh vien
	public void CLEAR() {
		this.dssv.removeAll(dssv);
	}

//	kiem tra sinh vien co hay ko tồn tại trong danh sách dua vao ma sinh vien
	public boolean Check(Scanner sc) {
		String temp;
		sc.nextLine();
		System.out.println("Moi ban nhap ma sinh vien can kiem tra: ");
		temp = sc.nextLine();
		for (int i = 0; i < dssv.size(); i++) {
			if (temp.compareToIgnoreCase(dssv.get(i).getMasinhvien()) == 0) {
				return true;
			}
		}
		return false;
	}
	
//	xoa mot sinh vien khoi danh sach dua tren ma sinh vien
	public void Delete_1_Student(Scanner sc) {
		String temp;
		sc.nextLine();
		System.out.println("Nhap ma sinh vien cua sinh vien can xoa khoi danh sach: ");
		temp = sc.nextLine();
		for (int i = 0; i < dssv.size(); i++) {
			if (temp.compareToIgnoreCase(dssv.get(i).getMasinhvien()) == 0) {
				dssv.remove(dssv.get(i));
			}
		}
		
	}
	
//	tim kiem sinh vien dua vao ten
	public void Search_Student(Scanner sc) {
		String temp;
		System.out.println("Moi ban nhap ten sinh vien can tim kiem: ");
		temp = sc.nextLine();
		for (int i = 0; i < dssv.size(); i++) {
			if (temp.compareToIgnoreCase(dssv.get(i).getHoVaten()) == 0) {
				System.out.println("Thong tin sinh vien tim kiem: ");
				System.out.println(dssv.get(i).toString());
			}
		}
	}
	
	public void swap(Sinhvien i, Sinhvien j) {
		Sinhvien temp = i;
		i = j;
		j = temp;
	}
	
//	sap xep sinh vien co so diem tu thap den cao
	public void Sort_by_grade() {
		Collections.sort(this.dssv, new Comparator<Sinhvien>() {

			@Override
			public int compare(Sinhvien sv1, Sinhvien sv2) {
				// TODO Auto-generated method stub
				if (sv1.getDiemtrungbinh() < sv2.getDiemtrungbinh()) {
					return -1;
				}
				else if (sv1.getDiemtrungbinh() > sv2.getDiemtrungbinh()) {
					return 1;
				}
				else {
					return 0;
				}
			}
			
		});
		
	}
	
//	ghi du lieu sinh vien xun file
	public void ghidulieuxunFile(File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			for (Sinhvien sinhvien : dssv) {
				oos.writeObject(sinhvien.toString());
			}
			
			oos.flush();
			oos.close();
			os.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		danhsachsinhvien dssv = new danhsachsinhvien();
//		dssv.AddStudent(sc);
//		System.out.println(dssv.getDssv().size());
//		System.out.println(dssv.getDssv().toString());
//	}
//	
	

}
