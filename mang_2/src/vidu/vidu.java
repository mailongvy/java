package vidu;

public class vidu {
	public static void main(String[] args) {
		sinhvien sv1= new sinhvien(150, "Tran Van Thanh", "lop 1", 9);
		sinhvien sv2= new sinhvien(150, "Nguyen Thi Thanh Hoa", "lop 5", 8);
		sinhvien sv3= new sinhvien(199, "Nguyen Van Thanh An", "lop 2", 8);
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv3.compareTo(sv1));
		
		
	}
}
