package week5_lab_1;

import myLibrary.Calculator;
import myLibrary.MyCalculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(6, 7);
		Calculator c2;
		MyCalculator mc = new MyCalculator();

		// Sum
		c2 = mc.calcSum(c1);
		System.out.println(c2);

		// Sub
		c2 = mc.calcSub(c1);
		System.out.println(c2);

		// Prd
		c2 = mc.calcPrd(c1);
		System.out.println(c2);

		// Div
		c2 = mc.calcDiv(c1);
		System.out.println(c2);

		// Rem
		c2 = mc.calcRem(c1);
		System.out.println(c2);

		// Pow()
		c2 = mc.calcRem(c1);
		System.out.println(c2);
	}
}