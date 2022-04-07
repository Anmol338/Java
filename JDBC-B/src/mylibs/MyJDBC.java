package mylibs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyJDBC {
	public boolean connect() {
		boolean result=false;
		//connect with database server
		try {
			//1. Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Connect with Database Server
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			//3. Close Connection
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			System.out.print("Error:"+ex.getMessage());
		}
		return result;
	}
	public boolean insert(int pid, String fname, String caddress) {
		boolean result=false;
		String sql = "INSERT INTO persons(pid, fname, caddress) VALUES(?, ?, ?)";
		//connect with database server
		try {
			//1. Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Connect with Database Server
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			//2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);
			pstat.setString(2, fname);
			pstat.setString(3, caddress);
			//2.2 Execute SQL Statement
			//stat.executeUpdate("INSERT INTO persons VALUES()");
			pstat.executeUpdate();
			//3. Close Connection
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			System.out.print("Error:"+ex.getMessage());
		}
		return result;
	}
	
	public boolean update(int pid, String fname, String caddress) {
		boolean result=false;
		String sql = "UPDATE persons SET fname=?, caddress=? WHERE pid=?";
		//connect with database server
		try {
			//1. Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Connect with Database Server
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			//2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, fname);
			pstat.setString(2, caddress);
			pstat.setInt(3, pid);
			//2.2 Execute SQL Statement
			pstat.executeUpdate();
			//3. Close Connection
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			System.out.print("Error:"+ex.getMessage());
		}
		return result;
	}
	
	public boolean delete(int pid) {
		boolean result=false;
		String sql = "DELETE FROM persons WHERE pid=?";
		//connect with database server
		try {
			//1. Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Connect with Database Server
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			//2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);
			//2.2 Execute SQL Statement
			pstat.executeUpdate();
			//3. Close Connection
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			System.out.print("Error:"+ex.getMessage());
		}
		return result;
	}
	
	public boolean select_all() {
		boolean result=false;
		String sql = "SELECT * FROM persons";
		try {
			//1. Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Connect with Database Server
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			//2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			//2.2 Get Result
			ResultSet rs = pstat.executeQuery();
			//2.3 Populate records
			System.out.println("ID\tNAME\tADDRESS");
			while(rs.next()) {
				System.out.println(rs.getInt("pid")+"\t"+rs.getString("fname")+"\t"+rs.getString("caddress"));
			}
			//3. Close Connection
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			System.out.print("Error:"+ex.getMessage());
		}
		return result;
	}
	
	public boolean search(int pid) {
		boolean result=false;
		String sql = "SELECT * FROM persons WHERE pid=?";
		try {
			//1. Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Connect with Database Server
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			//2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, pid);
			//2.2 Get Result
			ResultSet rs = pstat.executeQuery();
			//2.3 Populate records
			System.out.println("ID\tNAME\tADDRESS");
			while(rs.next()) {
				System.out.println(rs.getInt("pid")+"\t"+rs.getString("fname")+"\t"+rs.getString("caddress"));
			}
			//3. Close Connection
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			System.out.print("Error:"+ex.getMessage());
		}
		return result;
	}
}
