package epkieu;

public class epkieu {
	public static void main(String[] args) {
		int a = 100;
		int b = 2;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// ép kiểu ngầm đinh
		
		float c = (float) a;
		float d = (float) b;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
//		ép kiểu tường minh cần phải khai báo rõ
		float e = 3.5f;
		float f = 9.5f;
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		int g = (int) e;
		int h = (int) f;
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		
//		ép kiểu dữ liệu nguyên thuỷ và đói tượng 
	}
}
