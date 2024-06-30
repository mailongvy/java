package java_06;
import java.util.Scanner;

public class nhapdulieu {
	public static void main(String[] args) {
		// cách nhập dữ liệu từ bàn phím
		// sử dụng lớp scanner cho phép người dùng nhập dũ liệu từ bàn phím đối với một vài kiểu dữ liệu
		// cấu trúc cảu 1 scanner cho phép người dùng nhập giá trị từ bàn phím
		// Scanner scanner = new Scanner(system.in)
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten: ");
		String hoVaten = sc.nextLine();
		
		System.out.println("Nhap ma sinh vien: ");
		long masinhvien = sc.nextLong();
		
		System.out.println("Diem trung binh: ");
		double dtb = sc.nextDouble();
		
		System.out.println("--------------");
		System.out.println("Ho va ten: " + hoVaten);
		System.out.println("Ma sinh vien: " + masinhvien);
		System.out.println("Diem trung binh: " + dtb);
	}
}
