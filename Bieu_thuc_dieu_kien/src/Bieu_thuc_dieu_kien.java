// toán tử điều kiện
// (boolean expression) ? if-true-return-this : 

import java.util.Scanner;

public class Bieu_thuc_dieu_kien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		int a = sc.nextInt();
		
		String ketqua = (a % 2 == 0 ? "so chan" : "so le");
		System.out.println(ketqua);
	}
}