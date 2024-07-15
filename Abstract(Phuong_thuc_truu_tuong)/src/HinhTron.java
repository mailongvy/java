
public class HinhTron extends Hinh {
//	bán kình hình tròn 
	private double r;
	
	public HinhTron(ToaDo toado, double r) {
		super(toado);
		this.r = r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	public double TinhDienTich() {
		return Math.pow(this.r, 2)*Math.PI;
	}
	
	
	
}
