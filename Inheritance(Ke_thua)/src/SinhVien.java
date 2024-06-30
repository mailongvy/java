
public class SinhVien extends ConNguoi {
	private String tenLop, tenTruong;

	public SinhVien(String hovaten, int namsing, String tenLop, String tenTruong) {
		super(hovaten, namsing);
		this.tenLop = tenLop;
		this.tenTruong = tenTruong;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	
	public void Lambaitap() {
		System.out.println("... ... ...");
	}
	
}
