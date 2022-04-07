//Package Included
package Week2.oop1;

//Calculator
public class Calculator {
	// Attributes
	double num1; // first number
	double num2; // Second number
	double num3; // Result

	// Behaviours
	// add
	public void add() {
		this.num3 = this.num1 + this.num2;
	}

	// sub
	public void sub() {
		this.num3 = this.num1 - this.num2;
	}

	// product
	public void prod() {
		this.num3 = this.num1 * this.num2;
	}

	// division
	public void div() {
		this.num3 = this.num1 / this.num2;
	}

	// modulus
	public void mod() {
		this.num3 = this.num1 % this.num2;
	}
	
	// power
		public void pow() {
			this.num3 = Math.pow(num1, num2);
		}
}
