package switch_case;

import java.util.Scanner;

public class BaiTapKiemTraThu {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so nguyen n = ");
		n = sc.nextInt();
		
		switch (n) {
		case 2: {
			
			System.out.println("Thu 2");
			break;
		}
		case 3: {
			
			System.out.println("Thu 3");
			break;
		}
		case 4: {
			
			System.out.println("Thu 4");
			break;
		}
		case 5: {
			
			System.out.println("Thu 5");
			break;
		}
		case 6: {
			System.out.println("Thu 6");
			break;
		}
		case 7: {
			
			System.out.println("Thu 7");
			break;
		}
		default:
			System.out.println("Nhap du lieu sai");
	}
}
}