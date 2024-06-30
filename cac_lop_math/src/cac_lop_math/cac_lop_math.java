package cac_lop_math;

import java.util.Scanner;

public class cac_lop_math {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so a = ");
		a = sc.nextDouble();
		System.out.println("Nhap so b = ");
		b = sc.nextDouble();
		
		// ham tri tuyet doi
		System.out.println("|a| = " + Math.abs(a));
		// ham tim min
		System.out.println("Min cua a, b = " + Math.min(a, b));
		// ham tim max
		System.out.println("Max cua a, b = " + Math.max(a, b));
		// ham ceil: tim gia tri nguyen gan nhat >= gia tri dang xet
		System.out.println("ceil(a)" + Math.ceil(a));
		// ham floor: tim gia tri nguyen gan nhat <= gia tri dang xet
		System.out.println("floor(a)" + Math.floor(a));
		
		// ham can bac hai sqrt
		System.out.println("can bac hai cua a:" + Math.sqrt(a));
		
		// ham tinh a^b
		System.out.println("a^b = " + Math.pow(a, b));
	}
}
