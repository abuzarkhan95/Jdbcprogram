package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ValuesDelete {

	public static void main(String[] args)throws Exception {
String gmail= "anzer904421@gmail.com";
Class.forName("com.mysql.cj.jdbc.Driver");
Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","abuzar");
PreparedStatement ps=com.prepareStatement("delete from abuzar where gmail=?");
ps.setString(1, gmail);
int count= ps.executeUpdate();
if(count>0) {
	System.out.println("delete succssfully");
}
else {
	System.out.println("delete fail");
}
	}

}
