package mylibs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//room management (Room)
public class JDBCRoom extends Database {

	// DELETE Room
	public boolean delete(int rid) {
		Connection conn;
		PreparedStatement pstat;
		String sql = "DELETE FROM rooms WHERE id=?";
		boolean result = false;
		try {
			conn = connect();
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, rid);
			pstat.executeUpdate(); // insert,update,delete
			pstat.close();
			conn.close();
			result = true;
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return result;
	}

	// Update Room
	public boolean update(Room room) {
		Connection conn;
		PreparedStatement pstat;
		String sql = "UPDATE rooms SET type=?, rate=?, status=? WHERE id=?";
		boolean result = false;
		try {
			// insert
			conn = connect();
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, room.getType());
			pstat.setDouble(2, room.getRate());
			pstat.setString(3, room.getStatus());
			pstat.setInt(4, room.getId());
			pstat.executeUpdate(); // insert,update,delete
			pstat.close();
			conn.close();
			result = true;
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return result;
	}

	// Search Room
	public Room search(int rid) {

		Connection conn;
		PreparedStatement pstat;
		ResultSet rs;
		String sql = "SELECT * FROM rooms WHERE id = ?";
		Room room = new Room();

		try {
			conn = connect();
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, rid);
			rs = pstat.executeQuery();
			while (rs.next()) {
				room.setId(rs.getInt("id"));
				room.setType(rs.getString("type"));
				room.setRate(rs.getDouble("rate"));
				room.setStatus(rs.getString("status"));
			}

		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return room;
	}

	// Insert Room
	public boolean insert(Room room) {
		Connection conn;
		PreparedStatement pstat;
		boolean result = false;
		String sql = "INSERT INTO rooms VALUES(?,?,?,?)";
		try {
			// insert
			conn = connect();
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, room.getId());
			pstat.setString(2, room.getType());
			pstat.setDouble(3, room.getRate());
			pstat.setString(4, room.getStatus());
			pstat.executeUpdate(); // insert,update,delete
			pstat.close();
			conn.close();
			result = true;
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return result;
	}
}
