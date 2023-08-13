package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertValues1 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "abuzar");
		String name="abrar";
		String gmail="abrar778833@gmail.com";
		String password ="rar5613";
		String gender="male";
		String city="Gorkpur";
		PreparedStatement ps = com.prepareStatement("insert into abuzar(name,gmail,password,gender,city) values("+name+","+gmail+","+password+","+gender+","+city+")");
		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Success");

		} else {
			System.out.println("Fail");
		}
	}

}
