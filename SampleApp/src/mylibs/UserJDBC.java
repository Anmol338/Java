package mylibs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserJDBC extends Database {

	public User login(User user) {
		String sql = "SELECT * FROM users WHERE loginName=? AND loginPassword=?";
		try {
			Connection conn = connect();
			if (conn != null) {
				PreparedStatement pstat = conn.prepareStatement(sql);
				pstat.setString(1, user.getLoginName());
				pstat.setString(2, user.getLoginPassword());
				ResultSet rs = pstat.executeQuery();
				while(rs.next()) {
					user.setUid(rs.getInt("uid"));
					user.setFullName(rs.getString("fullName"));
					user.setRole(rs.getString("role"));
				}
			}
		} catch (Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return user;
	}
}
