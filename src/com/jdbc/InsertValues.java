package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertValues {

	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver"); 
//	String username="root";
//	String pass="abuzar";
//	String url="jdbc:mysql://localhost:3306/register";
	Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","abuzar");
	PreparedStatement ps =   com. prepareStatement("alter table Abuzar rename column gamil to gmail");
	int i = ps.executeUpdate();
	if(i>1) {
		System.out.println("Success");
	}
	else {
		System.out.println("Fail");
	}

	}

}
