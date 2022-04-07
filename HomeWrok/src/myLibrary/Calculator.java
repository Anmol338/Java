package myLibrary;

public class Calculator {
	// Instance Variables
	int num1;
	int num2;
	int num3;

	// Default Constructor
	public Calculator() {
		this.num1 = 0;
		this.num2 = 0;
		this.num3 = 0;
	}

	// Parameterized constructor
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = 0;
	}

	// Getter
	public int getNum1() {
		return num1;
	}

	// Setter
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	// Getter
	public int getNum2() {
		return num2;
	}

	// Setter
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	// Getter
	public int getNum3() {
		return num3;
	}

	// Setter
	public void setNum3(int num3) {
		this.num3 = num3;
	}

	//toString
	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + "]";
	}
	
	
}
