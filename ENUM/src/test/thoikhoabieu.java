package test;

public class thoikhoabieu {
	private date thu;
	private String cacMonHoc;
	public thoikhoabieu(date thu, String cacMonHoc) {
		this.thu = thu;
		this.cacMonHoc = cacMonHoc;
	}
	public date getThu() {
		return thu;
	}
	public void setThu(date thu) {
		this.thu = thu;
	}
	public String getCacMonHoc() {
		return cacMonHoc;
	}
	public void setCacMonHoc(String cacMonHoc) {
		this.cacMonHoc = cacMonHoc;
	}
	@Override
	public String toString() {
		return " [thu=" + thu + ", cacMonHoc=" + cacMonHoc + "]";
	}
	
	
}
