package test;

import model.CounterModel;
import view.CounterView;

public class test {
	public static void main(String[] args) {
		CounterModel ct = new CounterModel();
		for (int i = 0; i < 3; i++) {
			ct.Increment();
		}
		System.out.println(ct.getValue());
		ct.Decremnet();
		
		CounterView ctv = new CounterView();
	}
}
