package day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo8 {
	public static void main(String[] args) {
		Connection con = DbConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		if(con == null){
			System.out.println("Error connecting database");
		}
		
		System.out.println("All records from bank.customer DB");
		
		String selectQry = "select * from customer";
		
		try {
			ps = con.prepareStatement(selectQry);
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+
									rs.getString(2)+" "+
									rs.getString(3)+ " "+
									rs.getDouble(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
