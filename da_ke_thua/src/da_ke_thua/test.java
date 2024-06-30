package da_ke_thua;

public class test {
	public static void main(String[] args) {
		NguoiBaLan nbl = new NguoiBaLan("Lewandownski", 1987);
		NguoiVietNam nvn = new NguoiVietNam("Mai Long Vy", 2004);
		NguoiMy nm = new NguoiMy("Donald Trump", 1965);
		
		nbl.XinChao();
		nvn.XinChao();
		nm.XinChao();
	}
}
