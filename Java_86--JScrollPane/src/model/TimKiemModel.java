package model;

public class TimKiemModel {
	private String VanBan;
	private String Tukhoa;
	private String Ketqua;
	public TimKiemModel() {
		this.VanBan = "";
		this.Tukhoa = "";
		this.Ketqua = "";
		
		
	}
	public String getVanBan() {
		return VanBan;
	}
	public void setVanBan(String vanBan) {
		VanBan = vanBan;
	}
	public String getTukhoa() {
		return Tukhoa;
	}
	public void setTukhoa(String tukhoa) {
		Tukhoa = tukhoa;
	}
	public String getKetqua() {
		return Ketqua;
	}
	public void setKetqua(String ketqua) {
		Ketqua = ketqua;
	}
	
	public void Timkiem() {
		int count = 0;
		int pos = 0;
		while (true) {
			int i = this.VanBan.indexOf(this.Tukhoa, pos);
			
			if (i == -1) {
				// tình huống ko tìm thấy
				break;
			}
			
			else {
				count++;
				pos = i + 1;
				
			}
		}
		
		this.Ketqua = "Ket qua co " + count + this.Tukhoa;
	}
	
}
