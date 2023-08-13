package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateValues {

	private static String gmail;

	public static void main(String[] args) throws Exception {
		String city = "lucknow";
		String gmail = "abrar778833@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","abuzar");
		PreparedStatement ps = con.prepareStatement("update abuzar set city='Gorakhpur' where id=8");
		//ps.setString(1, city);
	//	ps.setString(2, gmail);
		int count = ps.executeUpdate();
		if (count > 0) {
			System.out.println("Successfully");
		} else {

			System.out.println("Fail");
		}
	}

}
