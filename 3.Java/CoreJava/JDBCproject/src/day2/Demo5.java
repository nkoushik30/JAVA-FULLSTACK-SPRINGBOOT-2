package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Koushik@123");

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter Customer ID: ");
			int id = sc.nextInt();

			System.out.print("Enter Last Name: ");
			String lastname = sc.next();

			String query = "SELECT * FROM customer WHERE custid=? AND lastname=?";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setInt(1, id);
			ps.setString(2, lastname);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				System.out.println("\nLogin Successful");
				System.out.println("------------------------");
				System.out.println("Customer ID : " + rs.getInt("custid"));
				System.out.println("First Name  : " + rs.getString("firstname"));
				System.out.println("Last Name   : " + rs.getString("lastname"));
				System.out.println("Balance     : " + rs.getDouble("balance"));

			} else {

				System.out.println("\nInvalid ID or Last Name");

			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}