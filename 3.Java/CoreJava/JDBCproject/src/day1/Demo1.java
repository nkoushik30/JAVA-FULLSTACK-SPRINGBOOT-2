package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {

	public static void main(String[] args) {
		// loading the driver

		String url = "jdbc:mysql://localhost:3306/koushik";

		try {

			// 1. loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. establishing connection
			Connection con = DriverManager.getConnection(url, "root", "Koushik@123");
			if (con != null) {
				System.out.println("connection established!!!!!");
			} else {
				System.out.println("connection failed!!!!!!");
			}

			// 4. closing the driver connection
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
