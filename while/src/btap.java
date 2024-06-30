import java.util.Scanner;

public class btap {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap x =");
		x = sc.nextInt();
		while (x >= 9) {
			System.out.println("Vui long nhap lai !!!");
			x = sc.nextInt();
		}
	}
}
