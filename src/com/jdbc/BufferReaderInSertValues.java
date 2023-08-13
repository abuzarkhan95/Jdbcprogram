package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;




public class BufferReaderInSertValues {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String userName = "root";
			String password = "khan";
			String url = "jdbc:mysql://localhost:3306/center";
			Connection con = DriverManager.getConnection(url, userName, password);
			String query = "insert into coching (name,age,course,fees) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			System.out.println("entre your Name...");
			String name = br.readLine();
			
			System.out.println("entre your age...");
			String age = br.readLine();

			System.out.println("entre your course...");
			String course = br.readLine();
			System.out.println("enter your fees...");
			String fees = br.readLine();

			ps.setString(1,name );
			ps.setString(2, age);
			ps.setString(3, course);
			ps.setString(4, fees);
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
