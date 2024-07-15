
public class SapxepChen implements SapXepInterface {

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
		for (int i = 1; i < arr.length; i++) {
			double x = arr[i];
			int pos = i - 1;
			while ((pos >= 0) && (arr[pos] < x)) {
				arr[pos +  1] = arr[pos];
				pos--;
			}
			arr[pos + 1] = x;
			
		}
	}
	
}
