package main;


import java.util.PriorityQueue;
import java.util.Queue;

public class viduvePriorityQueue {
	public static void main(String[] args) {
		Queue<String> danhsachsinhvien = new PriorityQueue<String>();
		
		danhsachsinhvien.offer("TITV 1");
		danhsachsinhvien.offer("Nguyen Van B");
		danhsachsinhvien.offer("Nguyen Van A");
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
 