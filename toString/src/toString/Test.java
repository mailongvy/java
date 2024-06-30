package toString;

public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(15, 5, 2025);
		MyDate md2 = new MyDate(11, 1, 2021);
		MyDate md3 = new MyDate(30, 3, 2025);
//		hàm trả về cái chuỗi: hàm toSring
		
		System.out.println(md1);
		
		int a = 5;
		int b = 6;
		if (a == b) {
			System.out.println("a = b");
		}
		else {
			System.out.println("a != b");
		}
		/*
		 * ko thể so sánh hai đối tượng bằng "=="
		 * phải dùng hàm equal
		 */
		System.out.println("md1 so sanh vs md2: " + md1.equals(md2));
		System.out.println("Hashcode md1: " + md1.hashCode());
		System.out.println("Hashcode md2: " + md2.hashCode());
		System.out.println("Hashcode md3: " + md3.hashCode());
	}
}
