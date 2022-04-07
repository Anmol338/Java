package Arrange;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal1;//Declare
		cal1 = new Calculator(); //Initialize
		cal1.num1=8; //Assign value
		cal1.num2=5; //Assign value
		cal1.add();  //Method Call
		System.out.println(cal1.num3); //Access Value
		
		Calculator cal2;
		cal2 =new Calculator();
		cal2.num1=2;
		cal2.num2=3;
		cal2.pow();
		System.out.println(cal2.num3);

	}

}
