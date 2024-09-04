package model;

import java.util.StringTokenizer;

public class ThucDonModel {
	private String luachon_Monchinh;
	private String luachon_Monphu;
	private double tongtien;
	public ThucDonModel() {
		luachon_Monchinh = "";
		luachon_Monphu = "";
		tongtien = 0;
		
	}
	public ThucDonModel(String luachon_Monchinh, String luachon_Monphu, double tongtien) {
		super();
		this.luachon_Monchinh = luachon_Monchinh;
		this.luachon_Monphu = luachon_Monphu;
		this.tongtien = tongtien;
	}
	public String getLuachon_Monchinh() {
		return luachon_Monchinh;
	}
	public void setLuachon_Monchinh(String luachon_Monchinh) {
		this.luachon_Monchinh = luachon_Monchinh;
	}
	public String getLuachon_Monphu() {
		return luachon_Monphu;
	}
	public void setLuachon_Monphu(String luachon_Monphu) {
		this.luachon_Monphu = luachon_Monphu;
	}
	public double getTongtien() {
		return tongtien;
	}
	public void setTongtien(double tongtien) {
		this.tongtien = tongtien;
	}
	
	public void TinhTongTien() {
		this.tongtien = 0;
		if (this.luachon_Monchinh.equals("Cơm")) {
			this.tongtien += 20000;
		}
		else if (this.luachon_Monchinh.equals("Phở")) {
			this.tongtien += 15000;
		}
		else if (this.luachon_Monchinh.equals("Bún")) {
			this.tongtien += 30000;
		}
		
		StringTokenizer stk = new StringTokenizer(this.luachon_Monphu, ";");
		while(stk.hasMoreElements()) {
			String monPhu = stk.nextToken();
			monPhu = monPhu.trim();
			if(monPhu.equals("Trà sữa")) {
				this.tongtien+= 5000;
			}else if(monPhu.equals("Coca Cola")) {
				this.tongtien+= 10000;
			}else if(monPhu.equals("Bánh Ngọt")) {
				this.tongtien+= 15000;
			}else if(monPhu.equals("Nem")) {
				this.tongtien+= 20000;
			}
		}
		
	}
	
	
}
