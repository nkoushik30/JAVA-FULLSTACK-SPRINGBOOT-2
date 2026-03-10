package day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo7 {
	// assignment- get all the records after inserting into the table;

	public static void main(String[] args) {
		Connection con = DbConnection.getConnection();

		PreparedStatement ps = null;
		ResultSet rs = null;

		if (con == null) {
			System.exit(0);
		}
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstname : ");
		String fname = sc.next();
		System.out.println("Enter lastname : ");
		String lname = sc.next();
		System.out.println("enter balance : ");
		double balance = sc.nextDouble();

		String insertQry = "insert into customer (firstname, lastname, balance)values (?, ?, ?)";
		try {
			ps = con.prepareStatement(insertQry);
			ps.setString(1, fname);

			ps.setString(2, lname);

			ps.setDouble(3, balance);

			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println("record inserted successfully");

				String selectQry = "SELECT * FROM customer ORDER BY custid DESC;";

				PreparedStatement ps1 = con.prepareStatement(selectQry);

				rs = ps1.executeQuery();

				System.out.println("customer records");

				while (rs.next()) {
					System.out.println(rs.getInt("custid") + " " + rs.getString("firstname") + " "
							+ rs.getString("lastname") + " " + rs.getDouble("balance"));

				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
