// Assignment-1 Program-4
//4. Write a Program which updates a record of employee by using Prepared Statement.

import java.sql.*;

public class PInsertDemo {
	public static void main(String[] args) {
		Connection conn = null;

		String url = "jdbc:mysql://localhost:3306/employee";
		try {
			conn = DriverManager.getConnection(url, "root", "tnrao");
			
			String sql = "update emp set firstname = ? where lastname = ?";
			PreparedStatement pt = conn.prepareStatement(sql);
			
			pt.setString(1, "nirav");
			pt.setString(2, "kundra");

			int val = pt.executeUpdate();
			if (val > 0) {
				System.out.println("updated...";
			}
			pt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace
		}
	}
}

// output >>>
// record updates 