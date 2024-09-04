package model;

public class MouseExampleModel {
	// hai biến toạ độ
	private int x;
	private int y;
	// một biến đếm số lượng click chuột
	private int count;
	//biến xem thử chuột có trong bảng hay không
	private String Checkin;
	
	public MouseExampleModel() {
		this.x = 0;
		this.y = 0;
		this.count = 0;
		this.Checkin = "";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCheckin() {
		return Checkin;
	}

	public void setCheckin(String checkin) {
		Checkin = checkin;
	}
	
	public void Addclick() {
		this.count++;
	}
	
	public void Enter() {
		this.Checkin = "Yes";
	}
	
	public void exit() {
		this.Checkin = "No";
	}
	
}
