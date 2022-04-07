package week3;

public class CarTest {

	public static void main(String[] args) {
		Car obj1; // Declare
		obj1 = new Car(); // new -> Memory Allocation, Car() -> Initialize
		// System.out.println(obj1.model);// Direct Access
		System.out.println(obj1.getModel());// Indirect Access
		
		// obj1.model="Toyota"; //Direct Assign
		
		obj1.setModel("Toyota");//Indirect Assign
		System.out.println(obj1.getModel());//Indirect Access
	
		
	}

}
