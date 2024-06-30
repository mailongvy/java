package da_ke_thua;

public class ConNguoi {
	protected String hovaten;
	protected int Namsinh;
	
	
	public ConNguoi(String hovaten, int namsinh) {
		this.hovaten = hovaten;
		this.Namsinh = namsinh;
	}
	
	
	public String getHovaten() {
		return hovaten;
	}



	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}



	public int getNamsinh() {
		return Namsinh;
	}



	public void setNamsinh(int namsinh) {
		Namsinh = namsinh;
	}



	public void an() {
		System.out.println("an");
	}
	
	public void ngu() {
		System.out.println("kho kho");
	}
	
	
	
}
