package day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo6 {
	// write insert program using preparestatement
	public static void main(String[] args) {

		Connection con = DbConnection.getConnection();
		PreparedStatement ps = null;
		if (con == null) {
			System.exit(0);
		}

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter firstname : ");
		String fname = sc.next();
		System.out.println("Enter lastname : ");
		String lname = sc.next();
		System.out.println("Enter balance : ");
		double balance = sc.nextDouble();

		String insertQry = "insert into customer (firstname, lastname, balance) values (?, ?, ?)";

		try {
			ps = con.prepareStatement(insertQry);

			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setDouble(3, balance);
			int rows = ps.executeUpdate();
			if (rows > 0) {
				System.out.println("Record inserted successfully");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
