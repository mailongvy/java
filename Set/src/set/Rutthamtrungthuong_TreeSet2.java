package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * set là một interface kế thừa collection java. Set trong java là 1 collection không thể chứa các phần tử trùng lặp
 * Set bao gồm Hashset, LinkedHashSet, TreeSet, EnumSet
 * 
 */
public class Rutthamtrungthuong_TreeSet2 {
	Set<String> thungphieuduthuong;
	
//	public Rutthamtrungthuong_HashSet(Set<String> thungphieuduthuong) {
//		this.thungphieuduthuong = thungphieuduthuong;
//	}

	public Rutthamtrungthuong_TreeSet2() {
		this.thungphieuduthuong = new TreeSet<String>();
	}
	
	public boolean ThemPhieu(String giatri) {
		return this.thungphieuduthuong.add(giatri);
	}
	
	public boolean Xoaphieu(String giatri) {
		return this.thungphieuduthuong.remove(giatri);
	}
	
	public boolean kiemtraphieutontai(String giatri) {
		return this.thungphieuduthuong.contains(giatri);
	}
	
	public void Xoatatcacacphieuduthuong() {
		this.thungphieuduthuong.clear();
	}
	
	public int SIZE() {
		return this.thungphieuduthuong.size();
	}
	
//	 rut 1 phieu
	public String ruttham() {
		
		String ans = "";
		Random rd = new Random();
		int vitri = rd.nextInt(this.thungphieuduthuong.size());
		ans = (String)this.thungphieuduthuong.toArray()[vitri];
		return ans;
		
	}
	
//	in tat ca cac phieu ra man hinh
	public void inTatca() {
		System.out.println(Arrays.toString(this.thungphieuduthuong.toArray()));
	}
	
	public static void main(String[] args) {
		Rutthamtrungthuong_TreeSet2 rt = new Rutthamtrungthuong_TreeSet2();
		int luachon = 0;
		Scanner sc = new Scanner(System.in);
		
		
//		 dua 1 menu cho nguuoi chon lua chon 
		while (true) {
			System.out.println("------------------ MENU ----------------------");
			System.out.println("1. Them Ma so du thuong");
			System.out.println("2. Xoa di 1 ma so du thuong");
			System.out.println("3. Kiem tra phieu du thuong co ton tai hay chua");
			System.out.println("4. Xoa tat ca cac phieu du thuong");
			System.out.println("5. So Luong Phieu du thuong");
			System.out.println("6. Rut tham turng thuong");
			System.out.println("7. Xuat ra tat ca cac hieu trung thuong");
			System.out.println("0. Thoat khoi chuong trinh");
			System.out.println("-----------------------------------------------");
			
			System.out.println("Moi ban nhap lua chon: ");
			luachon = sc.nextInt();
			
			if (luachon == 1) {
				sc.nextLine();
				System.out.println("Nhap vao ma du thuong: ");
				String giatri = sc.nextLine();
				rt.ThemPhieu(giatri);
			}
			
			else if(luachon == 2) {
				sc.nextLine();
				System.out.println("Nhap vao ma du thuong: ");
				String giatri = sc.nextLine();
				rt.Xoaphieu(giatri);
			}
			else if(luachon == 3) {
				sc.nextLine();
				System.out.println("Nhap vao ma du thuong: ");
				String giatri = sc.nextLine();
				System.out.println("Kq kiem tra: " + rt.kiemtraphieutontai(giatri));
			}
			else if(luachon == 4) {
				rt.Xoatatcacacphieuduthuong();
			}
			else if(luachon == 5) {
				rt.SIZE();
			}
			else if(luachon == 6) {
				System.out.println("Ma so trung thuong la:" + rt.ruttham());
			}
			else if(luachon == 7) {
				System.out.println("Tat ca cac phieu trung thuong la: ");
				rt.inTatca();
			}
			else if(luachon == 0) {
				break;
			}
			
		}
	}
}
