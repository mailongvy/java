package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * map: là một interface đại diện cho một giá trị chứa các anh xạ giữa các khoá và các giá trị. mỗi khoá tương ứng
 * với một giá trị.
 * Mỗi khoá chỉ tương ứng với một giá trị 
 * các ví dụ về map: từ điển, danh bạ số điện thoại, ...
 */

/*
 * xây dựng từ điển anh - việt
 * 1. thêm từ ngũ
 * 2. Xoá từ 
 * 3. Tìm ý nghĩa của từ 
 * 4. In ra danh sách các từ khoá
 * 5. In ra số lượng từ
 * 6. xoá hết từ điền
 * 
 */
public class Tudien {
	private Map<String, String> data;

	public Tudien(Map<String, String> data) {
		this.data = data;
	}
	
	public Tudien() {
		this.data = new TreeMap<String, String>();
//		this.data = new HashMap<String, String>();
	}
	
	public String Add(String key, String value) {
		return this.data.put(key, value);
	}
	
	public String xoatu(String tukhoa) {
		return this.data.remove(tukhoa);
	}
	
	public String Tratu(String key) {
		String yNghia = this.data.get(key);
		return yNghia;
	}
	
	public void PrintAll() {
		Set<String> Taphoptukhoa = this.data.keySet();
		System.out.println(Arrays.toString(Taphoptukhoa.toArray()));
	}
	
	public int Insoluong() {
		return this.data.size();
	}
	
	public void Xoatatca() {
		this.data.clear();
	}
	
	public static void main(String[] args) {
		Tudien tudien = new Tudien();
		int luachon;// lua chon cua nguoi dung
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------------- MENU ------------------------");
			System.out.println("1. Them tu ngu vao tu dien");
			System.out.println("2. Xoa tu");
			System.out.println("3. Tim y nghia cua tu");
			System.out.println("4. In ra danh sach tu khoa");
			System.out.println("5. In ra so luong tu");
			System.out.println("6. Xoa tat ca cac tu khoa co trong tu dien");
			System.out.println("0. Thoat khoi chuong trinh");
			System.out.println("-----------------------------------------------");
			
			System.out.println("Moi ban nhap lua chon: ");
			luachon = sc.nextInt();
			
			if (luachon == 1) {
				sc.nextLine();
				System.out.println("Moi ban nhap tu ban muon them vao tu dien: ");
				String tu = sc.nextLine();
				sc.nextLine();
				System.out.println("Moi ban nhap nghia cua tu: ");
				String ynghia = sc.nextLine();
				tudien.Add(tu, ynghia);
			}
			
			else if (luachon == 2) {
				sc.nextLine();
				System.out.println("Moi ban nhap tu khoa: ");
				String tukhoa = sc.nextLine();
				tudien.xoatu(tukhoa);
			}
			
			else if (luachon == 3) {
				sc.nextLine();
				System.out.println("Moi ban nhap tu khoa: ");
				String tukhoa = sc.nextLine();
				System.out.println("Y nghia cua tu la: " + tudien.Tratu(tukhoa));
				
				
			}
			
			else if (luachon == 4) {
				tudien.PrintAll();
			}
			
			else if (luachon == 5) {
				System.out.println("So luong tu la: " + tudien.Insoluong());
			}
			
			else if (luachon == 6) {
				tudien.Xoatatca();
			}
			
			else {
				break;
				
			}
		}
		
		
	}
	
	
	
	
	
}
