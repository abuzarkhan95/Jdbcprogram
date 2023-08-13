package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertValues3 {

	public static void main(String[] args) throws Exception { 
		String name= "Zaidkhan";
		String gmail= "zaikkhan723291@gmail.com";
		String password= "khan723291";
		String gender="male";
		String city= "lucknow";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "abuzar");
		PreparedStatement ps = com.prepareStatement("insert into abuzar(name,gmail,password,gender,city)values(?,?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,gmail);
		ps.setString(3,password);
		ps.setString(4,gender);
		ps.setString(5,city);
		int i = ps.executeUpdate();
		if (i >= 1) {
			System.out.println("Success"+i);

		} else {
			System.out.println("Fail"+i);
		}
		
	}

}

	


