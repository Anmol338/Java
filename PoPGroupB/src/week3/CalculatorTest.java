package week3;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(); //new -> Memory Location Calculator() -> Initializer
		c1.setNum1(23);
		c1.setNum2(3);
		c1.calcSum();
		System.out.println(c1.getNum3());
	}

}
