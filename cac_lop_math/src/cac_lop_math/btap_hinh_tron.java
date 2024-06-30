package cac_lop_math;

import java.util.Scanner;

public class btap_hinh_tron {
	public static void main(String[] args) {
		double r, dientich, chuvi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh r = ");
		r = sc.nextDouble();
		System.out.println("Dien tich hinh tron la: " + (Math.PI * 2 * r));
		System.out.println("Dien tich hinh tron la: " + Math.round(Math.PI * 2 * r));
		System.out.println("Chu vi hinh tron la: " + (Math.PI * r * r));
		System.out.println("Chu vi hinh tron la: " + Math.round(Math.PI * r * r));
		
		
	}
}
