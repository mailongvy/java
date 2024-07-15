
public class Test {
	public static void main(String[] args) {
		System.out.println("Test cau a: ");
		MayTinhCasioFX500 mt1 = new MayTinhCasioFX500();
		MayTInhVinacal500 mt2 = new MayTInhVinacal500();
		
		System.out.println("5+3=" + mt1.cong(5, 3));
		System.out.println("4*5=" + mt2.nhan(4, 5));
		System.out.println("4/0=" + mt2.chia(4, 0));
		
		System.out.println("/n/ntest cau b: ");
		double[] arr1 = new double[] {5, 1, 3, 4, 5, 8, 0};
		double[] arr2 = new double[] {6, 2, 7, 9, 2, 4, 5};
		SapxepChen sxchen = new SapxepChen();
		Sapxepchon sxchon = new Sapxepchon();
		
		sxchen.SapxepTang(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
			
		}
		System.out.println();
		
		sxchon.SapxepTang(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}
}
