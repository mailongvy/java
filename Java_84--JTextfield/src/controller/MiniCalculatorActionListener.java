package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiniCalculatorView;

public class MiniCalculatorActionListener implements ActionListener {
	private MiniCalculatorView MiniCalculatorView;
	
	

	public MiniCalculatorActionListener(view.MiniCalculatorView miniCalculatorView) {
		super();
		MiniCalculatorView = miniCalculatorView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		if (button.equals("+")) {
			this.MiniCalculatorView.Plus();
		}
		else if (button.equals("-")) {
			this.MiniCalculatorView.Minus();
		}
		else if (button.equals("*")) {
			this.MiniCalculatorView.Multiply();
		}
		else if (button.equals("/")) {
			this.MiniCalculatorView.Divide();
		}
		else if (button.equals("%")) {
			this.MiniCalculatorView.Mod();
		}
		else if (button.equals("^")) {
			this.MiniCalculatorView.Pow();
		}
	}
	
}
