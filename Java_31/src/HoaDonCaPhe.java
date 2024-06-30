import java.util.Scanner;

public class HoaDonCaPhe {
	// ten loai caphe
	private String Tenloaicaphe;
	private double giatien1kg;
	private double KhoiLuong;
	
	public HoaDonCaPhe(String ten, double gia, double kl) {
		this.Tenloaicaphe = ten;
		this.giatien1kg = gia;
		this.KhoiLuong = kl;
	}
	
	public double TinhTongTien() {
		return this.giatien1kg * this.KhoiLuong;
	}
	
	public boolean KiemTraKhoiLuongLonHon(double khoiluong) {
//		if (this.KhoiLuong > khoiluong) {
//			return true;
//		}
//		return false;
		return this.KhoiLuong > khoiluong;
	}
	
	public boolean KiemTraTongTienLonHon(double tongtien) {
		return this.TinhTongTien() > tongtien;
	}
	
	public double GiamGia(double x) {
		if (this.TinhTongTien() > 500000) {			
			return this.TinhTongTien() * (x/100);
		}
		return 0;
	}
	
	public double Giasaukhigiam(double x) {
		return this.TinhTongTien() -  this.GiamGia(x);
	}
	
	
	
	
}
