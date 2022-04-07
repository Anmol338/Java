//Package Include
package Week2.oop1;

//Import Color Class
import java.awt.Color;

public class Car { // Car Class
	// Attributes of class //Class Variables
	String model;
	Color color;
	int numPassengers;
	double amountOfGas;

	// Behaviours //Method
	// Add/remove a passenger
	public void addPassenger(int passenger) {
		this.numPassengers = this.numPassengers + passenger;
	}

	public void removePassenger(int passenger) {
		this.numPassengers = this.numPassengers - passenger;
	}
	
	//Get the tank filled
	public void addTank(double gas) {
		this.amountOfGas = this.amountOfGas + gas;
	}

}
