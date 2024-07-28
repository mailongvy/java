package main;

import java.util.Scanner;
import java.util.Stack;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stackchuoi = new Stack<String>();
		
//		ham stackchuoi.push: dua 1 gia tri vao stack
//		ham stackchuoi.pop: lay 1 gia tri ra va xoa khoi stack
//		stackchuoi.peek() : lay 1 gia tri ta ma khong xoa khoi stack
//		stackchuoi.clear(): xoa tat ca phan tu trong stack
//		stackchuoi.contains(o): ham kiem tra có phần tử có tồn tại trong stack hay không
		
//		ví dụ đảo ngược chuỗi
		System.out.println("Nhap vao chuoi: ");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			stackchuoi.push(s.charAt(i) + "");
		}
		System.out.println("Chuoi dao nguoc: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(stackchuoi.pop());
		}
		
		System.out.println();
		
//		chuyen tu he thap phan sang he nhi phan
		Stack<Integer> stacksodu = new Stack<Integer>();
		System.out.println("moi ban nhap so nguyen: ");
		int x = sc.nextInt();
		while (x > 0) {
			int sodu = x % 2;
			stacksodu.push(sodu);
			x /= 2;
			
		}
		
		for (int i = 0; i < stacksodu.size(); i++) {
			System.out.print(stacksodu.pop());
			i--;
		}
		
		
	
	}
}
