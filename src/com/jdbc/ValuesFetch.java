package com.jdbc;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ValuesFetch {

	public static void main(String[] args) throws Exception {
		Class. forName("com.mysql.cj.jdbc.Driver");
		Connection com= DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","abuzar");
		System.out.println("connection");
		PreparedStatement ps= com.prepareStatement("select * from abuzar ");
		ResultSet rs= ps.executeQuery();
		System.out.println(rs);
		while(rs.next()) 
		{
			
		String name1= rs.getString("name");
		System.out.println("Name: "+name1);
		
		String gmail1= rs.getString("gmail");
		System.out.println("Gmail:  "+gmail1);
		
	
		String password1= rs.getString("password");
		System.out.println("Password: " +password1);
		
		
		String gender1= rs.getString("gender");
		System.out.println("Gender: "+gender1);
		
		String city1= rs.getString("city");
		System.out.println("city: "+city1);
		// System.out.println(rs.getString("name")+" "+rs.getString("gmail")+" "+rs.getString("password")+" "+rs.getString("gender")+" "+rs.getString("city"));
		
		System.out.println("------------------------------");
		}

	} 
}
