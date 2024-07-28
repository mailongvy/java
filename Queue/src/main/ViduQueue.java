package main;

import java.util.LinkedList;
import java.util.Queue;

public class ViduQueue {
	public static void main(String[] args) {
		Queue<String> danhsachsinhvien = new LinkedList<String>();
		
		danhsachsinhvien.offer("TITV 1");
		danhsachsinhvien.offer("Nguyen Van A");
		danhsachsinhvien.offer("Nguyen Van B");
		danhsachsinhvien.offer("MLV");
		
		while (true) {
			String ten = danhsachsinhvien.poll(); // lay ra va xoa
			if (ten == null) {
				break;
			}
			System.out.println(ten);
			
		}
	}
}
