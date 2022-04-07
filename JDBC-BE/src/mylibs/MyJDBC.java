package mylibs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyJDBC {
	public boolean connect() {
		boolean result = false;
		// connect with database server
		try {
			// 1. Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Connect with Database Server
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			// 3. Close Connection
			connection.close();

			result = true;

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		return result;
	}

	public boolean Insert(String fname, String caddress) {
		boolean result = false;

		String sql = "INSERT INTO persons(fname,caddress) VALUES(?,?)";

		// connect with database server
		try {
			// 1. Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connect with Database Server
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

			// 2.1. Create JDBC Statement
			// Statement stat = connection.createStatement();

			PreparedStatement pstat = connection.prepareStatement(sql);
			pstat.setString(1, fname);
			pstat.setString(2, caddress);

			// 2.2. Execute Statement
			// stat.executeUpdate("INSERT INTO persons ");

			pstat.executeUpdate();

			// 3. Close Connection
			connection.close();

			result = true;

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		return result;
	}

	public boolean select_all() {
		boolean result = false;

		String sql = "SELECT * FROM persons";

		// connect with database server
		try {
			// 1. Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Connect with Database Server
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

			// 2.1.
			PreparedStatement pstat = connection.prepareStatement(sql);

			// 2.2. Get Result
			ResultSet rs = pstat.executeQuery();

			// 2.3. Populate/Display records
			System.out.println("ID\tName\t\tAddress");
			while (rs.next()) {
				System.out.println(rs.getInt("pid") + "\t" + rs.getString("fname") + "\t\t" + rs.getString("caddress"));
			}

			// 3. Close Connection
			connection.close();

			result = true;

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		return result;
	}

	public boolean search(int pid) {
		boolean result = false;

		String sql = "SELECT * FROM persons WHERE pid=?";

		// connect with database server
		try {
			// 1. Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Connect with Database Server
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

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

			result = true;

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		return result;
	}

	public boolean Update(int pid, String fname, String caddress) {
		boolean result = false;

		String sql = "UPDATE  persons SET fname=?,caddress=? WHERE pid=?";

		// connect with database server
		try {
			// 1. Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connect with Database Server
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

			// 2.1. Create JDBC Statement
			// Statement stat = connection.createStatement();

			PreparedStatement pstat = connection.prepareStatement(sql);
			pstat.setString(1, fname);
			pstat.setString(2, caddress);
			pstat.setInt(3, pid);

			// 2.2. Execute Statement
			// stat.executeUpdate("INSERT INTO persons ");

			pstat.executeUpdate();

			// 3. Close Connection
			connection.close();

			result = true;

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		return result;
	}
	
	public boolean delete(int pid) {
		boolean result = false;

		String sql = "DELETE FROM persons WHERE pid=?";

		// connect with database server
		try {
			// 1. Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connect with Database Server
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

			// 2.1. Create JDBC Statement
			// Statement stat = connection.createStatement();

			PreparedStatement pstat = connection.prepareStatement(sql);
			pstat.setInt(1, pid);

			// 2.2. Execute Statement
			// stat.executeUpdate("INSERT INTO persons ");

			pstat.executeUpdate();

			// 3. Close Connection
			connection.close();

			result = true;

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		return result;
	}
}
