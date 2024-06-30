
public class Main {
	public static void main(String[] args) {
		Mydate2 md = new Mydate2(31, 1, 2024);
		System.out.println("Day = " + md.getDay());
		md.setDay(35);
		System.out.println("Day = " + md.getDay());
		md.setDay(30);
		System.out.println("Day = " + md.getDay());
		
		System.out.println("Month = " + md.getMonth());
		md.setMonth(15);
		System.out.println("Month = " + md.getMonth());
		md.setMonth(12);
		System.out.println("Month = " + md.getMonth());
	}
}
