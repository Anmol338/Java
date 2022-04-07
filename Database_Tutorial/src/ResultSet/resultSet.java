package ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class resultSet {

	// Database Query
	private static final String QUERY = "SELECT * FROM users";

	public static void main(String[] args) {

		// try - catch
		try ( // Establishing a connection to the database
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_demo", "root", "");

				// Creating a statement using connection object
				Statement statement = connection.createStatement();

				// Execute a query
				ResultSet rs = statement.executeQuery(QUERY)) {

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				String password = rs.getString("password");

				System.out.println(id + " , " + name + " , " + email + " , " + country + " , " + password);
				
			}
			
			rs.close();
			statement.close();
			rs.close();
			System.out.println("Connection close successfully!");
			
		} catch (Exception e) {

		}
		
		
	}
	
	
}
