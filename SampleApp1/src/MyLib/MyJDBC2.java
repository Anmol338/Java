package MyLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class MyJDBC2 {

	final String DRIVER = "com.mysql.cj.jdbc.Driver";
	final String URL = "jdbc:mysql://localhost:3306/SampleApp";
	final String USER = "root";
	final String PSWD = "";

	public boolean search(String name, String password) {
		boolean result = false;

		String sql = "SELECT * From user where Name=? AND Password=?";
		
		if(name.length()<=0 || password.length()<=0) {
			 JOptionPane.showMessageDialog(null,"Enter Your Username and password!","Alert",JOptionPane.WARNING_MESSAGE);
		}
		// connect with database server
		try {
			// 1. Loading Driver
			Class.forName(DRIVER);
			// 2. Connect with Database Server
			Connection connection = DriverManager.getConnection(URL, USER, PSWD);

			// 2.1.
			PreparedStatement pstat = connection.prepareStatement(sql);
			pstat.setString(1, name);
			pstat.setString(2, password);
			// 2.2. Get Result
			ResultSet rs = pstat.executeQuery();

			if (rs.next()) {
				JOptionPane.showMessageDialog(null,"LogIn Successfully!");
				result = true;
			} else {
				JOptionPane.showMessageDialog(null,"Invalid Username or Password !");
			}	
			
//			while (rs.next()) {
//				if(rs.next()==false) {
//					JOptionPane.showMessageDialog(null,"LogIn Successfully!");
//				}else {
//					JOptionPane.showMessageDialog(null,"Invalid Username or Password !");
//				}
//			}
			
			// 3. Close Connection
			connection.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"LogIn Unsuccessfull!");
		}
		return result;
	}

}
