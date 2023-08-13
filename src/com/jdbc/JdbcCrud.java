package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcCrud {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void setVlaues() {

		try {

			String query = "insert into coching (name,age,course,fees) values(?,?,?,?)";
			PreparedStatement ps = ConnectionProvider.getCon().prepareStatement(query);
			System.out.println("entre your Name...");
			String name = br.readLine();

			System.out.println("entre your age...");
			String age = br.readLine();

			System.out.println("entre your course...");
			String course = br.readLine();
			System.out.println("enter your fees...");
			String fees = br.readLine();

			ps.setString(1, name);
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

	public static void updateValues() {

		try {

			String query = ("update coching set course=? where name ='abubakar'");
			PreparedStatement ps = ConnectionProvider.getCon().prepareStatement(query);
			// System.out.println("entre your Name...");
			// String name = br.readLine();
			System.out.println("enter your course");
			String course = br.readLine();

			ps.setString(1, course);
			int i = ps.executeUpdate();
			if (i > 0)

				System.out.println("Successfully Run..." + i);

			else

				System.out.println("fail..." + i);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void fecthValues() throws SQLException {

		// try {

		String query = ("select * from coching");
		PreparedStatement ps = ConnectionProvider.getCon().prepareStatement(query);

		// System.out.println("enter your name");
		// String name= br.readLine();
		// ps.setString();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String name = ((ResultSet) ps).getString("name");
			System.out.println("Name:" + name);
		}
	}

	public static void deleteValues() {

		try {

			String query = ("delete from coching where name= ?");
			PreparedStatement ps = ConnectionProvider.getCon().prepareStatement(query);
			// System.out.println("entre your Name...");
			// String name = br.readLine();
			System.out.println("enter your name");
			String name = br.readLine();
			ps.setString(1, name);
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
