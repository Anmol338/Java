package CreateTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_demo", "root", "");
				Statement statement = connection.createStatement();) {
			String std = "CREATE TABLE Author" + "(id INTEGER auto_increment primary key,"
					+ " firstName varchar(255) not null," + "lastName varchar(255) not null," + "age int(3) not null )";
			statement.executeUpdate(std);
			System.out.println("Created table in given database...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
