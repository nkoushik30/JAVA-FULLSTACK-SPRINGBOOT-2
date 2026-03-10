package day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo9 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Connection con = DbConnection.getConnection();
		PreparedStatement ps = null;
		if (con == null) {
			System.exit(0);
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter custid : ");
		int custid = scan.nextInt();
		System.out.println();

		String deleteQry = "delete from customer where custid = ?";
		
		try {
			ps = con.prepareStatement(deleteQry);
			
			ps.setInt(1, custid);
			
			int result = ps.executeUpdate();
			
			if(result > 0){
				System.out.println(result + "record Deleted");
			}else{
				System.out.println("record(s) deletion failed");
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
