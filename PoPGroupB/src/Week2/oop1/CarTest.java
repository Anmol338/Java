//Package Include
package Week2.oop1;

import java.awt.Color;

// CarTest Class
public class CarTest {

	// Main Class
	public static void main(String[] args) {
		Car car1; // Declare an object
		Car car2; // Declare an object
		car1 = new Car(); // Memory allocate //initialize an object
		car2 = new Car();

		// Access/Set Attribute car1
		car1.model = "Toyota";
		car1.color = Color.RED;
		car1.numPassengers = 5;
		car1.amountOfGas = 25; // Liters

		// Access/Set Attribute car2
		car2.model = "Hyundai";
		car2.color = Color.gray;
		car2.numPassengers = 4;
		car2.amountOfGas = 30; // Liters

		// Printing the Value of car1
		System.out.println(car1.model + ", " + car1.color + ", " + car1.numPassengers + ", " + car1.amountOfGas);

		// Printing the Value of car
		System.out.println(car2.model + ", " + car2.color + ", " + car2.numPassengers + ", " + car2.amountOfGas);

		System.out.println(car1.numPassengers);// 5
		car1.addPassenger(2);
		System.out.println(car1.numPassengers);// 7

		car1.removePassenger(3);
		System.out.println(car1.numPassengers);// 4
		
		System.out.println("\n\n\n-------Car1 Details-------");
		//Report amount of gas before filling the tank of car1
		System.out.println("Fuel Level Before:-");
		System.out.println(car1.amountOfGas);
		
		//Adding the level of tank of car1
		car1.addTank(10);
		
		//Report amount of gas after filling the tank of car1
		System.out.println("Fuel Level After:-");
		System.out.println(car1.amountOfGas);
		
		System.out.println("\n\n\n-------Car2 Details-------");
		//Report amount of gas before filling the tank of car1
		System.out.println("Fuel Level Before:-");
		System.out.println(car2.amountOfGas);
		
		//Adding the level of tank of car1
		car2.addTank(10);
		
		//Report amount of gas after filling the tank of car1
		System.out.println("Fuel Level After:-");
		System.out.println(car2.amountOfGas);
	}

}
