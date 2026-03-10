package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo8 {
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
				System.out.println("record inserted successfully");

				System.out.println("record inserted successfully");

				String query1 = "select * from customer";
				PreparedStatement ps1 = conn.prepareStatement(query1);

				ResultSet rs = ps1.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("custid");
					String fname = rs.getString("firstname");
					String lname = rs.getString("lastname");
					double balance1 = rs.getDouble("balance");

					System.out.println(id + " " + fname + " " + lname + " " + balance1);
				}

			} else {
				System.out.println("unable to insert: ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
