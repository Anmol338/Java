package Arrange;

public class Calculator {
	// Attributes/variables
	int num1;
	int num2;
	int num3;

	// Behaviours/methods
	public void add() {
		num3 =num1 + num2;
	}
	public void sub() {
		num3 =num1 - num2;
	}
	public void prd() {
		num3 =num1 * num2;
	}
	public void div() {
		num3 =num1 / num2;
	}
	public void mod() {
		num3 =num1 % num2;
	}
	public void pow() {
		num3 = (int) Math.pow(num1, num2);
	}

}
