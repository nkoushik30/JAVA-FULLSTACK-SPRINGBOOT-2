package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo3 {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Koushik@123");

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select * from customer");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
				System.out.println(rs.getString(3) + " " + rs.getDouble(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}