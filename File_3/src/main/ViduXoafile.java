package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViduXoafile {
	public static void XoaFile(File fx) {
		
		/*
		 * kiểm tra xem thử nếu là file thì sẽ xoá lun
		 */
		if (fx.isFile()) {
			System.out.println("Da xoa: " + fx.getAbsolutePath());
			fx.delete();
		}

//		ngược lại nếu là thư mục thì có 2 trg hợp
//		th1: nêu là thư mục rỗng sẽ xoá lun
//		th2: nếu thư mục chứa các thư mục con thì đệ quy để xoá các file bên trong trc khi xoa thu muc chính
		else if (fx.isDirectory()) {
			File[] mangcon = fx.listFiles();
			for (File f : mangcon) {
				XoaFile(f);
			}
//			xoá thư mục gốc 
			System.out.println("Da xoa: " + fx.getAbsolutePath());
 			fx.delete();
		}
	}
	
//	dùng files để xoá
	public static void XoaFile2(Path p) {
//		để xoá có 2 trg hợp
//		Trg hơp 1: nếu là file bth sẽ xoá 
		if(p.toFile().isFile()) {
			System.out.println("Da xoa: " + p.toFile().getPath());
			try {
				Files.delete(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*
		 * Trg hợp 2: nếu là thu mục sẽ có 2 trg hợp con:
		 * th1: là thư mục rỗng sẽ xoá lun
		 * th2: là thư mục có chứa các thư mục con sẽ xoá dần dần các thư mục con bên trong r mới xoá chính bản thân
		 * bằng cách dùng đệ quy
		 */
		
		else if (p.toFile().isDirectory()) {
			File[] mangcon = p.toFile().listFiles();
			for (File file : mangcon) {
				XoaFile2(file.toPath());
			}
//			sau khi xoá các file con thì xoá thư mục gốc
			System.out.println("Da xoa" + p.toFile().getAbsolutePath());
			try {
				Files.delete(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		File f0 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_3\\F0");
		File f0_1 = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_3\\F0_1");
		File f_vidu = new File("C:\\Users\\LENOVO\\Desktop\\eclipse-workspace\\File_3\\vidu.txt");
		
////		chỉ xoá được thư mục rỗng 
////		f0.deleteOnExit(); => không xoá được do không phải thư mục rỗng
//		f0_1.deleteOnExit(); // => xoá được vì thư mục này là thư mục rỗng
//		f_vidu.deleteOnExit(); // => xoá được vì đay chỉ là file txt bình thường
//		XoaFile(f0);
//		sử dụng class files để xoá tập tin và thu mục
		Path p0 = f0.toPath();
		Path p0_1 = f0_1.toPath();
		Path p_vidu = f_vidu.toPath();
		try {
			//Files.deleteIfExists(p0);
			XoaFile2(p0);
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p_vidu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
