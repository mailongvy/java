
public class test {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100000, 1.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyen", 100000, 5.5);
		System.out.println("Tong tien hd: " + hd.TinhTongTien());
		System.out.println("Tong tien hd1: " + hd2.TinhTongTien());
		System.out.println("Kiem tra khoi luong lon hon 2 kg: " + hd.KiemTraKhoiLuongLonHon(2));
		System.out.println("Kiem tra tong tien lon hon 500k: " + hd.KiemTraTongTienLonHon(500000));
		System.out.println("Giam gia cua hd: " + hd.GiamGia(10));
		System.out.println("Giam gia cua hd2: " + hd2.GiamGia(10));
		System.out.println("Gia tien sau khi giam gia cua hd: " + hd.Giasaukhigiam(10));
		System.out.println("Gia tien sau khi giam gia cua hd2: " + hd2.Giasaukhigiam(10));
	}
}
