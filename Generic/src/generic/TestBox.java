package generic;

public class TestBox {
	public static void main(String[] args) {
		Box box = new Box(15);
		System.out.println("Gia tri box: " + box.getValue());
		
//		Box box = new Box(15.5); => Báo lỗi
//		Box box = new Box("Muoi lam") => báo lõi
	}
}
