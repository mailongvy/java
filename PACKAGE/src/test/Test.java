package test;

import code_a.Vidu;

public class Test {
	public static void main(String[] args) {
		Vidu vd = new Vidu(5, 6);
		System.out.println(vd.getA());
		
		code_b.Vidu vd2 = new code_b.Vidu(2, 3, 5);
		System.out.println(vd2.getC());
	}
}
