import java.util.Scanner;
//  lay do dai va lay cac ki tu
public class Vidu {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		System.out.println("--------------------");
//		length: hàm trẻ bề độ dài của string
		System.out.println("Do dai chuoi la: " + s.length());
		int dodai = s.length();
		
//		ham charat(vi tri)=> lấy kí tự bất kì ở vị trí
		for (int i = 0; i < dodai; i++) {
			System.out.println("Vi tri " + i + " la: " + s.charAt(i));
		}
//		ham getchars(vi tri bat dau, vi tri ket thuc, mang luu du lieu, vi tri bat dau luu cua mang)
//		: ham lấy hàng loạt kí tự
		char[] arr = new char[100];
		s.getChars(2, 4, arr, 0);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Gia tri cua mang tai " + i + " la: " + arr[i]);
		}
		
//		ham getbytes => có 3 cách, lấy ra các giá trị của các kí tự của 1 mảng
		byte[] arrByte = s.getBytes();
		for (byte b : arrByte) {
			System.out.println(b);
		}
		
		
	}
}
