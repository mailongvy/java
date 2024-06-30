import java.util.Scanner;

public class chuyen_so_thap_phan_thanh_he_nhi_phan {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n = ");
		n = sc.nextInt();
		String kq = "";
		while (n > 0) {
			kq = (n % 2) + kq;
			n /= 2;
		}
		System.out.println(kq);
	}
}
