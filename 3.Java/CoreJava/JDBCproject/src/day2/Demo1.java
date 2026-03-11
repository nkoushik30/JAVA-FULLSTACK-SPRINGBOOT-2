package day2;

import java.sql.*;

public class Demo1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// loading the driver
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Koushik@123");

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (conn == null) {
			System.out.println("unable to connect:");
		}

		// getting columns from the table
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("select * from customer");

		rs.next();

		System.out.println("Empid : " + rs.getInt(1));
		System.out.println("empname : " + rs.getString(2));
	}

}
