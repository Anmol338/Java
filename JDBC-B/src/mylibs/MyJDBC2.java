package mylibs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MyJDBC2 {
	final String DRIVER = "com.mysql.cj.jdbc.Driver";
	final String URL = "jdbc:mysql://localhost:3306/test";
	final String USER = "root";
	final String PSWD = "";

	public boolean connect() {
		boolean result = false;
		// connect with database server
		try {
			// 1. Loading Driver
			Class.forName(DRIVER);
			// 2. Connect with Database Server
			Connection conn = DriverManager.getConnection(URL, USER, PSWD);
			// 3. Close Connection
			conn.close();
			result = true;
		} catch (Exception ex) {
			System.out.print("Error:" + ex.getMessage());
		}
		return result;
	}

	public boolean insert(Person person) {
		boolean result = false;
		String sql = "INSERT INTO persons VALUES(?, ?, ?)";
		// connect with database server
		try {
			// 1. Loading Driver
			Class.forName(DRIVER);
			// 2. Connect with Database Server
			Connection conn = DriverManager.getConnection(URL, USER, PSWD);
			// 2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, person.getPid());
			pstat.setString(2, person.getfname());
			pstat.setString(3, person.getcaddress());
			// 2.2 Execute SQL Statement
			// stat.executeUpdate("INSERT INTO persons VALUES()");
			pstat.executeUpdate();
			// 3. Close Connection
			conn.close();
			result = true;
		} catch (Exception ex) {
			System.out.print("Error:" + ex.getMessage());
		}
		return result;
	}

	public boolean update(int pid, String fname, String caddress) {
		boolean result = false;
		String sql = "UPDATE persons SET fname=?, caddress=? WHERE pid=?";
		// connect with database server
		try {
			// 1. Loading Driver
			Class.forName(DRIVER);
			// 2. Connect with Database Server
			Connection conn = DriverManager.getConnection(URL, USER, PSWD);
			// 2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, fname);
			pstat.setString(2, caddress);
			pstat.setInt(3, pid);
			// 2.2 Execute SQL Statement
			pstat.executeUpdate();
			// 3. Close Connection
			conn.close();
			result = true;
		} catch (Exception ex) {
			System.out.print("Error:" + ex.getMessage());
		}
		return result;
	}

	public boolean delete(int pid) {
		boolean result = false;
		String sql = "DELETE FROM persons WHERE pid=?";
		// connect with database server
		try {
			// 1. Loading Driver
			Class.forName(DRIVER);
			// 2. Connect with Database Server
			Connection conn = DriverManager.getConnection(URL, USER, PSWD);
			// 2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);
			// 2.2 Execute SQL Statement
			pstat.executeUpdate();
			// 3. Close Connection
			conn.close();
			result = true;
		} catch (Exception ex) {
			System.out.print("Error:" + ex.getMessage());
		}
		return result;
	}

	public ArrayList select_all() {
		ArrayList persons = new ArrayList();
		String sql = "SELECT * FROM persons";
		try {
			// 1. Loading Driver
			Class.forName(DRIVER);
			// 2. Connect with Database Server
			Connection conn = DriverManager.getConnection(URL, USER, PSWD);
			// 2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			// 2.2 Get Result
			ResultSet rs = pstat.executeQuery();
			// 2.3 Populate records
			
			while (rs.next()) {
				Person tmp = new Person(rs.getInt("pid"), 
						rs.getString("fname"), 
						rs.getString("caddress"));
				persons.add(tmp);
			}
			// 3. Close Connection
			conn.close();
		} catch (Exception ex) {
			System.out.print("Error:" + ex.getMessage());
		}
		return persons;
	}

	public Person search(int pid) {
		Person person = new Person();
		String sql = "SELECT * FROM persons WHERE pid=?";
		try {
			// 1. Loading Driver
			Class.forName(DRIVER);
			// 2. Connect with Database Server
			Connection conn = DriverManager.getConnection(URL, USER, PSWD);
			// 2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);

			// 2.2 Get Result
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {
				person.setPid(rs.getInt("pid"));
				person.setfname(rs.getString("fname"));
				person.setcaddress(rs.getString("caddress"));
			}
			// 3. Close Connection
			rs.close();
			conn.close();
		} catch (Exception ex) {
			System.out.print("Error:" + ex.getMessage());
		}
		return person;
	}
}
