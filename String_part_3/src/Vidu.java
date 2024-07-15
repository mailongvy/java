
public class Vidu {
	public static void main(String[] args) {
		String s1 = "Xin chao co chu, xin chao cac ban, Xin chao";
		String s2 = "Xin chao";
		String s3 = "Xin chao 123";
//		ham indexof 
		System.out.println(s1.indexOf(s2));
		System.out.println(s1.indexOf(s3));
		
//		sử dụng vị trí bắt đầu là
		System.out.println("Vi tri cua s2 trong s1: " + s1.indexOf(s2, 2));
		
//		hàm lastindexof giống như hàm indexof nhưng xét từ phải qua trái
		System.out.println("vi tri cua s2 va s1: " + s1.lastIndexOf(s2));
	}
}
