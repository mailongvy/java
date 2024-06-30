package if_else;

import java.util.Scanner;

public class giaiptbac2 {
	public static void main(String[] args) {
//		pt bac 2: ax^2 + bx + c
		/*
		 * cac bien can co a b c: cac he so
		 * x1 x2 cac nghiem
		 * delta bien phu de giai
		 * 
		 * xet a = 0 => pt bạc 1 de giai
		 * xet a != 0 => 
		 * xet delta = b^2 - 4ac
		 * delta < 0 pt vo nghiem
		 * delta == 0 pt co nghiem kep x1 = x2 = -b/2a
		 * delta > 0
		 * x1 = (-b-sqrt(delta))/2a
		 * x2 = (-b+sqrt(delta))/2a
		 */
		double a, b, c, x1, x2, x, delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap he so a = ");
		a = sc.nextDouble();
		System.out.println("Nhap he so b = ");
		b = sc.nextDouble();
		System.out.println("Nhap he so c = ");
		c = sc.nextDouble();
		
		if (a == 0) {
			if(b == 0) {
				if (c == 0) {
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
		else {
			delta = Math.pow(b, 2) - 4 * a * c; 
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			else if (delta == 0) {
				x1 = x2 = -b/(2*a);
				System.out.println("phuong trinh co nghiem kep la x1 = x2 = " + x1);
			}
			else {
				x1 = (- b - Math.sqrt(delta))/(2*a);
				x2 = (- b + Math.sqrt(delta))/(2*a);
				System.out.println("Phuong trinh co hai nghiem la x1 = " + x1 + ", x2 = " + x2);
			}
		}
	}
}
