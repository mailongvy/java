package model;

public class MiniCalculatorModel {
	private double first_value;
	private double second_value;
	private double answer;
	public MiniCalculatorModel() {
		this.first_value = 0;
		this.second_value = 0;
		this.answer = 0;
	}
	public double getFirst_value() {
		return first_value;
	}
	public void setFirst_value(double first_value) {
		this.first_value = first_value;
	}
	public double getSecond_value() {
		return second_value;
	}
	public void setSecond_value(double second_value) {
		this.second_value = second_value;
	}
	public double getAnswer() {
		return answer;
	}
	public void setAnswer(double answer) {
		this.answer = answer;
	}
	
	public void Plus() {
		this.answer = this.first_value + this.second_value;
	}
	
	public void Minus() {
		this.answer = this.first_value - this.second_value;
	}
	
	public void Multiply() {
		this.answer = this.first_value * this.second_value;
	}
	
	public void Divide() {
		this.answer = this.first_value / this.second_value;
	}
	
	public void Pow() {
		this.answer = Math.pow(this.first_value, this.second_value);
	}
	
	public void Mod() {
		this.answer = this.first_value % this.second_value;
	}
	
	
}
