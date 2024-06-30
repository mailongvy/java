
public class ConNguoi {
	protected String hovaten;
	protected int namsing;
	
	public ConNguoi(String hovaten, int namsing) {
		this.hovaten = hovaten;
		this.namsing = namsing;
	}

	public String getHovaten() {
		return hovaten;
	}

	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}

	public int getNamsing() {
		return namsing;
	}

	public void setNamsing(int namsing) {
		this.namsing = namsing;
	}
	
	public void an() {
		System.out.println("Mam mam");
	}
	
	public void ngu() {
		System.out.println("kho kho");
	}
	
	public void uong() {
		System.out.println("uc uc");
	}
	
}
