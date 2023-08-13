package com.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class JdbcCrudMain {
	public static void main(String[] args) throws SQLException {
		System.out.println("CHoose option");
		 
		  		  

		System.out.println("set✔:\nupdate✔:\nfetch✔:\ndelete✔:\n\nEnter choice❤ ");
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.nextLine();

		
		switch (ch) {
		case  "set"  : JdbcCrud.setVlaues();break;
		case "update": JdbcCrud.updateValues();break;
		case "fetch" : JdbcCrud.fecthValues();break;
		case "delete": JdbcCrud.deleteValues();break;
	     default:System.out.println("wrong input");
           
		}
	    scanner.close();
	}

}
