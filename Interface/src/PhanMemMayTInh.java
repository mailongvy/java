
public class PhanMemMayTInh implements MayTinhBoTui_interface, SapXepInterface {


	@Override
	public void SapxepTang(double[] arr) {
		for (int i = 1; i < arr.length; i++) {
			double x = arr[i];
			int pos = i - 1;
			while ((pos >= 0) && (arr[pos] > x)) {
				arr[pos +  1] = arr[pos];
				pos--;
			}
			arr[pos + 1] = x;
			
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
	
	@Override
	public double cong(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double chia(double a, double b) {
		// TODO Auto-generated method stub
		return b != 0 ? (a/b) : -1;
	
	}
	
}
