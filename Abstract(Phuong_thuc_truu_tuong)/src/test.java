
public class test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(5, 5);
		ToaDo td2 = new ToaDo(7, 9);
		ToaDo td3 = new ToaDo(12, 1);
		
//		Hinh h = new Hinh(td1); => lỗi biên dịch
		Hinh h1 = new Diem(td1);
		
		Hinh h2 = new HinhTron(td2, 10);
		
		Hinh h3 = new Hinhchunhat(td3, 4, 6);
		
		System.out.println(h1.TinhDienTich());
		System.out.println(h2.TinhDienTich());
		System.out.println(h3.TinhDienTich());
	}
}
