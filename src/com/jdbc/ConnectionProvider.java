package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	 private static Connection connection = null; 
    

    
    public static  Connection getCon() {
		 if (connection ==null) 
			  try {
				  Class.forName("com.mysql.cj.jdbc.Driver");
				  connection =DriverManager.getConnection
						     ("jdbc:mysql://localhost:3306/center","root","khan");
				   return connection;
				  
			  }  
			catch (Exception e) {
				e.printStackTrace();
			}
				   
		 
	   else {
		   return connection;
	   }
		return connection;		   
		   
				   
			
		 }
    
}
