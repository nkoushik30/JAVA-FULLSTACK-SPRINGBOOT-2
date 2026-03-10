package day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Connection con = DbConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		if (con == null) {
			System.exit(0);
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter custid : ");
		int custid = scan.nextInt();
		System.out.println();

		String selectQry = "select * from customer where custid = ?";

		try {
			ps = con.prepareStatement(selectQry);
			ps.setInt(1, custid);

			rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println(
						rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4) + " ");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
