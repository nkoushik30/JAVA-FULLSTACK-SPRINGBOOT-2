package day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		// write program for getting the record by name

		Connection con = DbConnection.getConnection();
		ResultSet rs = null;
		PreparedStatement ps = null;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		if (con == null) {
			System.out.println("unable to connect");
		}

		System.out.println("Enter your firstname : ");
		String s = sc.next();
		String selectQry = "select * from customer where firstname = ?";
		try {
			ps = con.prepareStatement(selectQry);
			ps.setString(1, s);

			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println(
						rs.getInt("custid") + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}