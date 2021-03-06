package AuthorsTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Authors {

//	private static final String CreateTable = "CREATE TABLE Authors" + "(id int(11) auto_increment primary key,"
//			+ "firstName varchar(55) not null," + "lastName varchar(55) not null)";

//	private static final String INSERTQUERY = "INSERT INTO Authors(firstName,lastName) Value('Raj','Sharma'),('Nabin','Shrestha')";
	
	private static final String RETRIEVEQUERY = "SELECT * FROM Authors";
	
	

	public static void main(String[] args) {
		
		// CREATE TABLE into DATABASE
//		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_demo", "root", "");
//				Statement statement = connection.createStatement();) {
//			System.out.println("Connection established successfully!");
//
//			statement.executeUpdate(CreateTable);
//			System.out.println("Table Created successfully!");
//
//			statement.close();
//			connection.close();
//			System.out.println("Connection Closed successfully!");
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		
		//INSERT Value into DATABASE
//		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_demo", "root", "");
//				Statement statement = connection.createStatement();) {
//			System.out.println("Connection established successfully!");
//
//			statement.executeUpdate(INSERTQUERY);
//			System.out.println("Value Insert Successfully!");
//
//			statement.close();
//			connection.close();
//			System.out.println("Connection Closed successfully!");
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
		// RETRIEVE Records from database
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_demo", "root", "");
				Statement statement = connection.createStatement();) {
			System.out.println("Connection established successfully!");

			ResultSet rs = statement.executeQuery(RETRIEVEQUERY);
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				
				System.out.println(id+" , "+firstName+" , "+lastName);
				
			}

			statement.close();
			connection.close();
			System.out.println("Connection Closed successfully!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
