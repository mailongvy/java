package test;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		thoikhoabieu tkb_t2 = new thoikhoabieu(date.Monday, "Toan Ly Hoa");
		thoikhoabieu tkb_t3 = new thoikhoabieu(date.Tuesday, "Van Su Dia");
		thoikhoabieu tkb_t4 = new thoikhoabieu(date.Wednesday, "Ly Hoa Sinh");
		thoikhoabieu tkb_t5 = new thoikhoabieu(date.Thursday, "Tin hoc - GDCD - The duc");
		
		System.out.println(tkb_t5.toString());	
		
		int x = Thang.Thang_1.soNgay();
		System.out.println(x);
	}
}
