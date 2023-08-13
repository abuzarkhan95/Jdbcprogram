package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcErrorSolve {
	public static void main(String[] args) {
		try {
	 Class.forName("com.mysql.cj.jdbc.Driver");
		
		 
	  String userName= "root";
	  String password ="khan";
	  String url ="jdbc:mysql://localhost:3306/center";
	  Connection con =DriverManager.getConnection(url ,userName ,password);
        System.out.println("connection is created");
	  
        try {
        	   String sql = "INSERT INTO data1 (UserName , UserId) VALUES (?, ?)";
        	   PreparedStatement statement = con.prepareStatement(sql);
        	   statement.setString(1, "Ayaz");
        	   statement.setInt(2,1);
        	   
        	   statement.executeUpdate();
        	   
        	   System.out.println("VALUE INSERTEd");
        	} catch (SQLException e) {
        	   e.printStackTrace();
        	}
        try {
        	   String sql = "SELECT UserName FROM data1 WHERE UserId = ?";
        	   PreparedStatement statement = con.prepareStatement(sql);
        	   statement.setInt(1, 1);
        	   ResultSet result = statement.executeQuery();
        	   if (result.next()) {
        	       String UserName = result.getString("UserName");
        	       int UserId = result.getInt("UserId");
        	    
        	       System.out.println("UserId: " + UserId);
        	       System.out.println("UserName 2: " + UserId);
        	  
        	   }
        	} catch (SQLException e) {
        	   e.printStackTrace();
        	}
        try {
        	   String sql = "UPDATE data1 SET UserName, WHERE UserId= ?";
        	   PreparedStatement statement = con.prepareStatement(sql);
        	   statement.setString(1, "aadi");
        	   statement.executeUpdate();
        	   System.out.println("Record updated.");
        	} catch (SQLException e) {
        	   e.printStackTrace();
        	}
        try {
        	   String sql = "DELETE FROM data1 WHERE UserId= ?";
        	   PreparedStatement statement = con.prepareStatement(sql);
        	   statement.setString(1, "Ayaz");
        	   statement.setInt(2, 10);
        	   statement.executeUpdate();
        	   System.out.println("Record deleted.");
        	} catch (SQLException e) {
        	   System.out.println(e.getMessage());
        	}
		}
		catch (Exception e) {
			
			e.printStackTrace();
			

	    
			}
		
	}

}
