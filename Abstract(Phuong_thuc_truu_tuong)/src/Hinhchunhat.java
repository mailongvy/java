
public class Hinhchunhat extends Hinh{
	private double chieurong;
	private double chieudai;
	public Hinhchunhat(ToaDo toado, double chieurong, double chieudai) {
		super(toado);
		this.chieurong = chieurong;
		this.chieudai = chieudai;
	}
	
	public double TinhDienTich() {
		return this.chieudai * this.chieurong;
	}
}
