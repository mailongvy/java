
public class vidu {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";
//		ham equals => so sánh hai chuỗi khác nhau có phân biệt hoa thường
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));
//		hàm equalIgnorecase => so sánh hai chuỗi khác nhau không phân biệt hoa thường
		System.out.println("s1 equalsIgnorecase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnorecase s3: " + s1.equalsIgnoreCase(s3));
//		hàm compareto => so sánh > < = 
//		hàm chỉ trả về số âm dương và 0
		
		String sv1 = "Nguyen Van A";
		String sv2 = "Nguyen Van B";
		String sv3 = "Nguyen Van";
		String sv4 = "Nguyen Van A";
		System.out.println("sv1 compareto sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compareto sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compareto sv4: " + sv1.compareTo(sv4));
//		hàm comparetoIgnorecase là hàm so sánh tương tự với compareto nhưng khong phân biệt hoa thường
		
//		hàm regionMatches => so sánh 1 đoạn 
//		hàm regionMatches(Vị trí bắt đầu chuỗi cần xét, tên chuỗi 2, vị trí bắt đầu xét chuỗi 2, đồ dài chuỗi cần xét)
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		Boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);
		
//		hàm startwith => hàm kiểm tra chuỗi bắt đàu (hàm trả về true false)
		String sdt = "037456789";
		System.out.println(sdt.startsWith("037"));
		
//		hàm endwith => hàm kiem tra chuõi kết thúc bằng
		String Tenfile = "I love you.jpg";
		String Tenfile2 = "JAVA.pdf";
		if (Tenfile.endsWith("jpg")) {
			System.out.println("File la file hinh anh");
		}
		else if (Tenfile.endsWith("pdf")) {
			System.out.println("file la file pdf");
		}
		
	}
}
