import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		int[] mang1 = {1, 2, 3};
		
//		copy mảng 
		int[] mang1_a = mang1;
		mang1_a[0] = 100;
		System.out.println("Mang 1: " + Arrays.toString(mang1));
		System.out.println("Mang 1a: " + Arrays.toString(mang1_a));
		
//		cách 2: copy mảng dùng hàm clone
		int[] mang1_b = mang1.clone();
		mang1_b[0] = 50;
		System.out.println("Mang 1b: " + Arrays.toString(mang1_b));

//		cách 3: sử dụng hàm System.arraycopy
		int[] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c[0] = 50;
		System.out.println("mang 1c: " + Arrays.toString(mang1_c));
		
	}
}
