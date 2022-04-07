package Connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database_Connection {

	public static void main(String[] args) {
		try {

			// 1. Loading Driver
			Class.forName("com.mysql.jdbc.Driver");

			// 2.Get Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/anmol", "root", "");

			// 3.Create JDBC statement
			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("select * from student_info");

			System.out.println("Connection to the database succesfully.");
		} catch (Exception e) {
			System.out.println("Connection failed with database.");
		}
	}
}