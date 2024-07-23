package vidu;

import java.util.Arrays;

public class vidu {
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for(int i = x.length - 1; i >= 0; i--) {
			rs[index] = x[i];
			index++;
		} 
		return rs;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {1, 8, 2, 6, 4, 3, 7, 9};
		int[] b = new int[15];
		
//		hàm săp xếp
		System.out.println("a ban dau: " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("a luc sau: " + Arrays.toString(a));
		
//		hàm tìm kiếm 
//		binarysearch: chỉ sử dụng cho mang tăng dần
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1));
		
//		hàm điền giá trị 
//		hàm fill
		Arrays.fill(b, 5);
		System.out.println("b sau khi dien gia tri: " + Arrays.toString(b));
		
//		hàm săp xếp
		Arrays.sort(a);
		a = vidu.reverse(a);
		System.out.println("a luc sau khi sap xep giam dan: " + Arrays.toString(a));
	}


}
