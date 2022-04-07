package mylibs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MyJDBC2 {
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/test";
	String USER = "root";
	String PSWD = "";
	
	public boolean insert(Person person) {
		boolean result=false;
		String sql = "INSERT INTO persons(pid, fname, caddress) VALUES(?, ?, ?)";
		//connect with database server
		try {
			//1. Loading Driver
			Class.forName(DRIVER);
			//2. Connect with Database Server
			Connection conn = DriverManager.getConnection(URL, USER, PSWD);
			//2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, person.getPid());
			pstat.setString(2, person.getFullName());
			pstat.setString(3, person.getContactAddress());
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
	
	public boolean update(Person person) {
		boolean result=false;
		String sql = "UPDATE persons SET fname=?, caddress=? WHERE pid=?";
		//connect with database server
		try {
			//1. Loading Driver
			Class.forName(DRIVER);
			//2. Connect with Database Server
			Connection conn = DriverManager.getConnection(URL, USER, PSWD);
			//2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, person.getFullName());
			pstat.setString(2, person.getContactAddress());
			pstat.setInt(3, person.getPid());
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
	
	public boolean delete(Person person) {
		boolean result=false;
		String sql = "DELETE FROM persons WHERE pid=?";
		//connect with database server
		try {
			//1. Loading Driver
			Class.forName(DRIVER);
			//2. Connect with Database Server
			Connection conn = DriverManager.getConnection(URL, USER, PSWD);
			//2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, person.getPid());
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
	
	public ArrayList select_all() {
		boolean result=false;
		String sql = "SELECT * FROM persons";
		ArrayList persons = new ArrayList();
		
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PSWD);
			PreparedStatement pstat = conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();
			
			System.out.println("ID\tNAME\tADDRESS");
			while(rs.next()) {
				Person tmp = new Person(rs.getInt("pid"), 
						rs.getString("fname"), 
						rs.getString("caddress"));
				persons.add(tmp);
			}
			//3. Close Connection
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			System.out.print("Error:"+ex.getMessage());
		}
		return persons;
	}
	
	public Person search(Person person) {
		boolean result=false;
		String sql = "SELECT * FROM persons WHERE pid=?";
		Person tmp= new Person();
		try {
			//1. Loading Driver
			Class.forName(DRIVER);
			//2. Connect with Database Server
			Connection conn = DriverManager.getConnection(URL, USER, PSWD);
			//2.1 Create JDBC Statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, person.getPid());
			//2.2 Get Result
			ResultSet rs = pstat.executeQuery();
			//2.3 Populate records
			tmp = new Person(rs.getInt("pid"), rs.getString("fname"), rs.getString("caddress"));
			//3. Close Connection
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			System.out.print("Error:"+ex.getMessage());
		}
		return tmp;
	}
}
