package day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo1 {
	// update the record and print that updated record.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection con = DbConnection.getConnection();
		PreparedStatement ps = null;

		if (con == null) {
			System.out.println("unable to connect to db");
		}
		System.out.println("Enter the custid : ");
		int custid = sc.nextInt();

		System.out
				.println("Enter your choice of modificationas below \n" + " 1 for firstname \n" + " 2 for lastname \n");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("enter your firstname to modify: ");
			String s = sc.next();
			String updateQry = "update customer set firstname = ? where custid = ?";

			try {
				ps = con.prepareStatement(updateQry);
				ps.setInt(2, custid);
				ps.setString(1, s);
				int result = ps.executeUpdate();

				if (result > 0) {
					System.out.println(result + " : record Updated");
				} else {
					System.out.println("record(s) Updation failed");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("enter your lastname to modify: ");
			String s1 = sc.next();
			String updateQry1 = "update customer set lastname = ? where custid = ?";

			try {
				ps = con.prepareStatement(updateQry1);
				ps.setString(1, s1);
				ps.setInt(2, custid);
				int result = ps.executeUpdate();

				if (result > 0) {
					System.out.println(result + " : record Updated");
				} else {
					System.out.println("record(s) Updation failed");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		sc.close();
	}
}
