package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteValue {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String userName = "root";
			String password = "khan";
			String url = "jdbc:mysql://localhost:3306/center";
			Connection con = DriverManager.getConnection(url, userName, password);
			String query = ("delete from coching where name= ?");
			PreparedStatement ps = con.prepareStatement(query);
			//System.out.println("entre your Name...");
		//	String name = br.readLine();
			System.out.println("enter your name");
			String name= br.readLine();
			ps.setString(1,name);
			int i = ps.executeUpdate();
			if (i > 0)

				System.out.println("Successfully Run..." + i);

			else

				System.out.println("fail..." + i);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

			

	

			 	




