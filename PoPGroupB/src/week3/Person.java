package week3;

public class Person {
	int id; // Instance variables
	String name; // Instance variables
	String address; // Instance variables

	// Default Constructor
	public Person() {
		this.id = 0;
		this.name = "";
		this.address = "";
	}

	// Setter method
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Getter method
	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}
}
