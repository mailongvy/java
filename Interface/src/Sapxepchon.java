import java.util.Iterator;

public class Sapxepchon implements SapXepInterface {
	
	@Override
	public void SapxepTang(double[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			int pos = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[pos]) {
					pos = j;
				}
			}
			double temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		
	}

	@Override
	public void SapxepGiam(double[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			int pos = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[pos]) {
					pos = j;
				}
			}
			double temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
	}
	
}
