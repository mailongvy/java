package if_else;

import java.util.Scanner;

public class giai_pt_bac_1 {
	public static void main(String[] args) {
//		phg trinh bac 1 y = ax + b
		/*
		 * neu a = 0, b = 0 pt vo so nghiem
		 *   		  b != 0 pt vo nghiem
		 * neu a != 0 co nghiem la x = -b/a
		 * 
		 */
		
		double a, b, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap he so a = ");
		a = sc.nextDouble();
		System.out.println("Nhap he so b = ");
		b = sc.nextDouble();
		
		if(a == 0) {
			if (b == 0) {
				System.out.println("Pt co vo so nghiem");
			}
			else {
				System.out.println("Pt vo nghiem");
			}
		}
		else {
			x = -b/a;
			System.out.println("Pt co nghiem la x = " + x);
		}
	}
}
