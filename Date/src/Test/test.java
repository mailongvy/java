package Test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class test {
	public static void main(String[] args) {
		// hàm lấy ra thời gian hiện tại system.currentTimeMillis()
//		long t1 = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//			System.out.println("TEST");
//		}
//		long t2 = System.currentTimeMillis();
//		System.out.println("Thoi gian trc khi chay for: " + t1);
//		System.out.println("Thoi gian sau khi chay for: " + t2);
//		System.out.println("Thoi gian chay for: " + (t2 - t1)/1000 + "s");
//		System.out.println("Thoi gian chay for: " + (t2 - t1) + "mls");
		
		// timeunit 
		System.out.println("3000 nam = " + TimeUnit.DAYS.toSeconds(3000*365) + "s");
		System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25) + "s");
		
//		do month tinh tu thang 0 - 11 nen cong 1
//		con year phai cong them 1970
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));
		
//		calendar: class mô phỏng hệ thống lịch
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE)  + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
		
		c.add(Calendar.HOUR, 10);
		System.out.println(c.get(Calendar.DATE)  + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
		
		c.add(Calendar.DATE, 14);
		System.out.println(c.get(Calendar.DATE)  + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));
		
		//dateformat
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));
		
		df = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		System.out.println(df.format(d));
	
	
	}
}
