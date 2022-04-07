package week_6_lab_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC1 {

	public static void main(String[] args) {
		// Download ConnectorJ
		// https://www.mysql.com/products/connector/
		// JDBC Driver for MySQL (Connector/J)

		// database info
		// host: localhost
		// port: 3306
		// user: root
		// password:
		// database: test
//		try {
//			//connect with database?
//			String url ="";
//		}
//		catch(Exception ex) {
//			System.out.println("Error "+ex.getMessage());
//		}
		
		String url = "jdbc:mysql://localhost:3306/sampletest";
		String userName="root";
		String userPassword="";
		
		try {
			Connection connection = DriverManager.getConnection(url, userName, userPassword);// Establishing connection
			
			if(connection != null) {
				System.out.println("Connected with the database successfully.");
			}
			
		} catch (SQLException e) {
			System.out.println("Error while connecting to the database");
		}

	}

}
