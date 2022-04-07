//Package Include
package Week2.oop1;

//Calculator
public class CalculatorTest {

	// Main method
	public static void main(String[] args) {
		Calculator calc1; // Declare
		calc1 = new Calculator(); // Initialize
		calc1.num1 = 9; // Assign
		calc1.num2 = 6; // Assign

		System.out.println("\n\n-------Addition------");
		calc1.add(); // Add
		System.out.println(calc1.num3); // Access

		System.out.println("\n\n-------Addition------");
		calc1.num1=18; //Assign
		calc1.num2=7; //Assign
		calc1.add();  //Add
		System.out.println(calc1.num3); //Access
		
		System.out.println("\n\n-------Addition------");
		calc1.num1=4; //Assign
		calc1.num2=6; //Assign
		calc1.add();  //Add
		System.out.println(calc1.num3); //Access

		System.out.println("\n\n-------Subtraction------");
		calc1.num1 = 100; // Assign
		calc1.num2 = 50; // Assign
		calc1.sub(); // subtraction
		System.out.println(calc1.num3); // Access

		System.out.println("\n\n-------Multiplication------");
		calc1.num1 = 9; // Assign
		calc1.num2 = 8; // Assign
		calc1.prod(); // Multiplication
		System.out.println(calc1.num3); // Access

		System.out.println("\n\n-------Division------");
		calc1.num1 = 4; // Assign
		calc1.num2 = 2; // Assign
		calc1.div(); // Division
		System.out.println(calc1.num3); // Access

		System.out.println("\n\n-------Modulus------");
		calc1.num1 = 9; // Assign
		calc1.num2 = 2; // Assign
		calc1.mod(); // Modulus
		System.out.println(calc1.num3); // Access

		System.out.println("\n\n-------Power------");
		calc1.num1 = 5; // Assign
		calc1.num2 = 3; // Assign
		calc1.pow(); // Power
		System.out.println(calc1.num3); // Access
	}

}
