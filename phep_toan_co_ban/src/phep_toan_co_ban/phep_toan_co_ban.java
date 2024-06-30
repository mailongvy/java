package phep_toan_co_ban;

import java.util.Scanner;

public class phep_toan_co_ban {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao a = ");
		a = sc.nextInt();
		System.out.println("Nhap vao b = ");
		b = sc.nextInt();
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		float thuong = (float)a / b;
		System.out.println("a / b = " + thuong);
		System.out.println("a % b = " + (a % b));
		
	}
}
