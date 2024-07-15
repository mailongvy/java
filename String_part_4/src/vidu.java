
public class vidu {
	public static void main(String[] args) {
		String s1 = "MaiLongVy";
		String s2 = "7878";
//		nối chuỗi có hai cách
//		c1: dùng + để nối hai chuỗi
		String s3 = s1 + s2;
//		c2: dùng hàm concat => nối chuỗi
		String s4 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s4);
		
//		hàm replaceAll: thay thế biến đổi chuỗi con thành chuỗi con khác nhưng ko làm thay đổi giá trị ban đầu
		String s5 = "Longvyy";
		String s6 = s5.replaceAll("Long", "L");
		System.out.println(s6);
		
//		toLowercase: hàm viết thường các kí tự
//		toUppercase: hàm viết hoa các kí tự
		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();		
		System.out.println(s7);
		System.out.println(s8);
		
//		hàm trim: hàm xoá các khaongr trắng dư thừ ở đầu chuỗi
		String s9 = "    Xin chào các bạn      ";
		System.out.println(s9.trim());
		
//		hàm substring => cắt chuỗi con
		String s10 = "Xin chào các bạn, mình là TITV";
		String s11 = s10.substring(10);
		System.out.println(s11);
		String s12 = s10.substring(10, 15);
		System.out.println(s12);
	}
}
