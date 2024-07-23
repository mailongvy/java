package vidu;

import java.util.Arrays;

public class test_2 {
	public static void main(String[] args) {
		sinhvien sv1= new sinhvien(150, "Tran Van Thanh", "lop 1", 9);
		sinhvien sv2= new sinhvien(150, "Nguyen Thi Thanh Hoa", "lop 5", 8);
		sinhvien sv3= new sinhvien(199, "Nguyen Van Thanh An", "lop 2", 8);
		sinhvien sv4= new sinhvien(199, "Nguyen Van Thanh Binh", "lop 2", 8);
		
		sinhvien[] a_sv = new sinhvien[] {sv1, sv2, sv3, sv4};
		
		System.out.println("Ban dau: " + Arrays.toString(a_sv));
		Arrays.sort(a_sv);
		System.out.println("Luc Sau: " + Arrays.toString(a_sv));
		
//		tim kiem
		System.out.println("Tim Kiem An" + Arrays.binarySearch(a_sv, sv4));
	}
}
