package vidu;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		String s = "Xin chao tat ca cac ban, tui la peter";
		String[] a = s.split(" ");  
		System.out.println(Arrays.toString(a));
		
		String[] b = s.split(",");
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chao, minh la peter. Minh la lap trinh vien";
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
	}
}
