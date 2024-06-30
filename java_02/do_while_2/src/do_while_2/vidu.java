package do_while_2;

import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap n > 0: ");
			n = sc.nextInt();
		} while (n <= 0);
	}
}
