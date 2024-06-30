package try_catch_finally;

import java.util.Scanner;

public class trycatchfinally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			System.out.println("nhap vao so nguyen n = ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap du lieu khong dung");
		} finally {
			
		}
		System.out.println("Gia tri nhap la = " + n);
		System.out.println("Ket thuc chuong trinh");
	}
}
