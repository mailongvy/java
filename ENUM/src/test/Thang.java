package test;

public enum Thang {
	Thang_1(31),
	Thang_2(29),
	Thang_3(31),
	Thang_4(30),
	Thang_5(31),
	Thang_6(30),
	Thang_7(31),
	Thang_8(31),
	Thang_9(30),
	Thang_10(31),
	Thang_11(30),
	Thang_12(31);
	
	private final int songay;
	
	Thang(int songay) {
		this.songay = songay;
	}
	
	public int soNgay() {
		return songay;
	}
}
