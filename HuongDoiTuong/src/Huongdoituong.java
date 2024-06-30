
public class Huongdoituong {
	private int day;
	private int month;
	private int year;
	
	public Huongdoituong(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public void Printday() {
		System.out.println("Day: " + this.day);
	}
	public void Printmonth() {
		System.out.println("Month: " + this.month);
	}
	public void PrintYear() {
		System.out.println("Year: " + this.year);
	}
	public void Printdate() {
		System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
	}
	
	
}
