package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchValus{

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//try {
			
			String query = ("select * from coching");
			PreparedStatement ps = ConnectionProvider.getCon().prepareStatement(query);
		
			//System.out.println("enter your name");
		//	String name= br.readLine();
		//	ps.setString();
			ResultSet  rs=  ps.executeQuery();
			 while(rs.next()) {
				 System.out.println("fetch values");
			//	 String name=((ResultSet) ps).getString("name");
			//	System.out.println("Name:"+name);
			 
			 String s=rs.getString(1);
			 System.out.println("Name : "+s);
			 String g=rs.getString(2);
			 System.out.println("Age : "+g);
			 String c=rs.getString(3);
			 System.out.println("Course : "+c);
			 String f=rs.getString(4);
			 System.out.println("Fees : "+f);
			 System.out.println("...................");
			 }
		}
}