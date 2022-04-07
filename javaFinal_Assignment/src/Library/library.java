package Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class library {
	// Instant Variables
	int age;
	String name, contactNumber;
	String username = "root", password = "";

	// Default Constructor
	public library() {
		this.age = 0;
		this.name = "";
		this.contactNumber = "";
	}

	// Parameterized Constructor
	public library(int age, String name, String contactNumber) {
		this.age = age;
		this.name = name;
		this.contactNumber = contactNumber;
	}

	// Getter Age
	public int getAge() {
		return age;
	}

	// Setter Age
	public void setAge(int age) {
		this.age = age;
	}

	// Getter Name
	public String getName() {
		return name;
	}

	// Setter Name
	public void setName(String name) {
		this.name = name;
	}

	// Getter Contact Number
	public String getContactNumber() {
		return contactNumber;
	}

	// Setter Contact Number
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void Connection() {
		try {

			// Loading Driver
			Class.forName("com.mysql.jdbc.Driver");

			// Get Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/anmol", username, password);
			System.out.println("Connection successful");

			// Create JDBC statement
			Statement statement = connection.createStatement();

			System.out.println("------------Your information------------------");
			System.out.println("Name: " + getName());
			System.out.println("Age: " + getAge());
			System.out.println("Contact Number: " + getContactNumber());

			// Insert
			statement
					.executeUpdate("INSERT INTO student_info(Name,Age,Contact_Number) +values('Jone',15,'9988775566')");
			System.out.println("Your information is succefully inserted into database.");

			// Close connection
			statement.close();
			connection.close();

		} catch (Exception e) {
			System.out.println("Connection Failed!");
		}
	}

}
