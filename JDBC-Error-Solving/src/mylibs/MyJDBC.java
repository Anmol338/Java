package mylibs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyJDBC {
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/test";
	String USER = "root";
	String PSWD = "";
	
	public boolean connection() {
		boolean result = false;
		try {
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(URL,USER,PSWD);
			connection.close();
			result = true;
			
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		return result;
	}
	
	public boolean Insert(Person person) {
		String sql = "INSERT INTO persons(fname,caddress) VALUES(?,?)";
		
		boolean result = false;
		try {
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(URL,USER,PSWD);
			PreparedStatement pstat = connection.prepareStatement(sql);
			pstat.setString(1, person.getFname());
			pstat.setString(2, person.getCaddress());
			pstat.executeUpdate();
			pstat.close();
			connection.close();
			result = true;
		} catch (Exception e) {
			System.out.println("Error :"+e.getMessage());
		}
		return result;
	}
	
	public void search(int pid) {
		Person person = new Person();

		String sql = "SELECT * FROM persons WHERE pid=?";

		// connect with database server
		try {
			// 1. Loading Driver
			Class.forName(DRIVER);
			// 2. Connect with Database Server
			Connection connection = DriverManager.getConnection(URL, USER, PSWD);

			// 2.1.
			PreparedStatement pstat = connection.prepareStatement(sql);
			pstat.setInt(1, pid);
			// 2.2. Get Result
			ResultSet rs = pstat.executeQuery();

			// 2.3. Populate/Display records
			System.out.println("ID\tName\t\tAddress");
			while (rs.next()) {
				System.out.println(rs.getInt("pid") + "\t" + rs.getString("fname") + "\t\t" + rs.getString("caddress"));
			}

			// 3. Close Connection
			connection.close();

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
	}
}
