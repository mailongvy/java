import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println(mm.timMin(2, 3));
		System.out.println(mm.timMin(5.5, 6.0));
		System.out.println(mm.tinhtong(5, 6));
		
		int n;
		System.out.println("Nhap so luong phan tu cua mang: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		double arr[] = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + i + " : ");
			arr[i] = sc.nextDouble();
		}
		System.out.println(mm.tinhtong(arr));
		sc.close();
	}
	
	
}
