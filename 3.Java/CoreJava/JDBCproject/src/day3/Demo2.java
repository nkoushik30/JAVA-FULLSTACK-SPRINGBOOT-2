package day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo2 {
	// delete a record and disply all the records remaining.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Connection con = DbConnection.getConnection();
		PreparedStatement ps = null;

		if (con == null) {
			System.out.println("Error connecting DB:");
		}
		System.out.println("Enter the custid to delete his/her record : ");
		int custid = new java.util.Scanner(System.in).nextInt();
		String deleteQry = "delete from customer where custid = ?";
		try {
			ps = con.prepareStatement(deleteQry);
			ps.setInt(1, custid);

			int result = ps.executeUpdate();

			if (result == 0) {
				System.out.println("Error deleting the record");
			} else {
				System.out.println(custid + " Record deleted successfully...");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
