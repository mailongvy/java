package vonglap_for;

public class inbangcuuchuong {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.println("Bang cuu chuong " + i);
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
	}
}
