
package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.util.jar.Attributes.Name;

public class InsertValues4 {

	public static void main(String[] args)throws Exception {
	String name= "Anzar";
	String gmail="anzar904421@gmail.com";
	String password="@90kh44";
	String gender= "Male";
	String city="Baghnagar";
Class.forName("com.mysql.cj.jdbc.Driver");
Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","abuzar");
PreparedStatement ps=com.prepareStatement("insert into abuzar(name,gmail,password,gender,city)values(?,?,?,?,?)");
ps.setString(1,name);
ps.setString(2,gmail);
ps.setString(3,password);
ps.setString(4,gender);
ps.setString(5,city);
int i = ps.executeUpdate();
if(i>10) {
	System.out.println("Value success");
	
}
else {
	System.out.println("value fail");
}
	}

}
