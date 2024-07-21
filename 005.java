// Assignment-1 Program-5
// 5. Write a Program which deletes a record of employee by using Prepared Statement.

import java.sql.*;

public class PDeleteDemo {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String url = "jdbc:mysql://localhost:3306/employee";

		try {
			conn = DriverManager.getConnection(url, "root", "tnrao");

			System.out.println("Creating prepared statement...");
			String sql = "DELETE FROM emp WHERE firstname = ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, "kashayap");

			int val = pstmt.executeUpdate();

			System.out.println(val + " record(s) deleted successfully");
	
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// output >>>
// data deleted