package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Koushik@123");

			System.out.print("Enter Customer ID: ");
			@SuppressWarnings("resource")
			int id = (new Scanner(System.in)).nextInt();

			String query = "SELECT * FROM customer WHERE custid = ?";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				System.out.println("Customer Details");
				System.out.println("----------------------");
				System.out.println("Customer ID : " + rs.getInt(1));
				System.out.println("First Name  : " + rs.getString(2));
				System.out.println("Last Name   : " + rs.getString(3));
				System.out.println("Balance     : " + rs.getDouble(4));

			} else {
				System.out.println("Customer not found.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}