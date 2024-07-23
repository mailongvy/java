package vidu;

public class sinhvien implements Comparable<sinhvien> {
	private int masinhvien;
	private String Hovaten;
	private String Tenlop;
	private double diemtrungbinh;
	
	public sinhvien(int masinhvien, String hovaten, String tenlop, double diemtrungbinh) {
		super();
		this.masinhvien = masinhvien;
		Hovaten = hovaten;
		Tenlop = tenlop;
		this.diemtrungbinh = diemtrungbinh;
	}

	public int getMasinhvien() {
		return masinhvien;
	}

	public void setMasinhvien(int masinhvien) {
		this.masinhvien = masinhvien;
	}

	public String getHovaten() {
		return Hovaten;
	}

	public void setHovaten(String hovaten) {
		Hovaten = hovaten;
	}

	public String getTenlop() {
		return Tenlop;
	}

	public void setTenlop(String tenlop) {
		Tenlop = tenlop;
	}

	public double getDiemtrungbinh() {
		return diemtrungbinh;
	}

	public void setDiemtrungbinh(double diemtrungbinh) {
		this.diemtrungbinh = diemtrungbinh;
	}
	
	public String getTen() {
		String s = this.Hovaten.trim();
		if (s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt + 1);
		}
		return s;
	}

	@Override
	public int compareTo(sinhvien o) {
//		<0: đối tượng đang xét nhỏ hơn đối tượng truyền vào
//		=0: đối tượng đang xét tương đương với đối tượng truyền vào
//		<0: đối tượng đang xét lớn hơn đối tượng truyền vào 
//		dựa theo tên
//		phải cắt tên lấy dc tên
		String tenThis = this.getTen();
		String tenO = o.getTen();
		return tenThis.compareTo(tenO);
	}

	@Override
	public String toString() {
		return "sinhvien [masinhvien=" + masinhvien + ", Hovaten=" + Hovaten + ", Tenlop=" + Tenlop + ", diemtrungbinh="
				+ diemtrungbinh + "]";
	}
	
	
	
	
	
}
