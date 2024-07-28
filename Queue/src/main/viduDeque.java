package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class viduDeque {
	public static void main(String[] args) {
		Deque<String> danhsachsinhvien = new ArrayDeque<String>();
		
		danhsachsinhvien.offer("TITV 1");
		danhsachsinhvien.offer("Nguyen Van B");
		danhsachsinhvien.offer("Nguyen Van A");
		danhsachsinhvien.offer("MLV");
		danhsachsinhvien.offerLast("MLV 3");
		danhsachsinhvien.offerFirst("MLV 10");
		
		while (true) {
			String ten = danhsachsinhvien.poll(); // lay ra va xoa
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
