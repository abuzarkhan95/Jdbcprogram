package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InsertValues2 {
	
	private static Scanner scanner = new Scanner(System.in);

	private static boolean validate(String email) {
		
		Pattern pattern = Pattern.compile("[-0-9a-zA-Z.+_]+@[-0-9a-zA-Z.+_]+\\.[a-zA-Z]{2,4}");
		
		Matcher matcher = pattern.matcher(email);
	
		return matcher.matches();
	}
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "abuzar");
		String q = "insert into abuzar(name,gmail,password,gender,city) values(?,?,?,?,?)";
		PreparedStatement ps = com.prepareStatement(q);
		System.out.println("Enter you name");
		ps.setString(1, scanner.nextLine());
		System.out.println("Enter your gamil");
		String emailString = scanner.nextLine(); 
		if(validate(emailString)) {
		ps.setString(2, emailString);
		}else {
			throw new IllegalArgumentException("Your Email is not valid");
		}
		System.out.println("Enter your password");
		ps.setString(3, scanner.nextLine());
		System.out.println("Enter your gender");
		ps.setString(4, scanner.nextLine());
		System.out.println("Enter your city");
		ps.setString(5, scanner.nextLine());
		
		int i = ps.executeUpdate();
		if (i >= 1) {
			System.out.println("Success"+i);

		} else {
			System.out.println("Fail"+i);
		}
		
	}

}
