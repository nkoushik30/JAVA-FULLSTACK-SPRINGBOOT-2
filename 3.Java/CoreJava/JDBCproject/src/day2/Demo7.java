package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Koushik@123");

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter First Name: ");
			String firstname = sc.next();

			System.out.print("Enter Last Name: ");
			String lastname = sc.next();

			System.out.print("Enter Balance: ");
			double balance = sc.nextDouble();

			String query = "INSERT INTO customer(firstname, lastname, balance) VALUES (?, ?, ?)";

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setDouble(3, balance);

			int rows = ps.executeUpdate();

			if (rows > 0) {
				System.out.println("\nCustomer inserted successfully!");
			} else {
				System.out.println("\nInsertion failed.");
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}