package com.rays.callable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class TransactionHandling {
	public static void main(String[] args) {
		  String url = "jdbc:mysql://localhost:3306/advance_int";
	        String userName = "root";
	        String password = "root";
	        Connection conn = null;

	        try {
	            conn = DriverManager.getConnection(url, userName, password);
	            conn.setAutoCommit(false); // Transaction Start

	            Statement stmt = conn.createStatement();
	            stmt.executeUpdate("INSERT INTO emp VALUES (18, 'abc', 1000)");

	            conn.commit(); // Commit Transaction
	            System.out.println("Transaction Successful!");
	            
	        } catch (Exception e) {
			try {
				conn.rollback();
				e.printStackTrace();
				System.out.println(e.getMessage());
				
			}catch(SQLException e1 ) {
				
			}             		
		}
	}
}

//✅ Exception tab aayegi jab:

//Duplicate Primary Key Insert Karne Ki Koshish Karein
//Galat Data Type Insert Karen
//Table Ya Column Exist Na Kare
//Database Connection Fail Ho
//Agar koi bhi error aayegi, toh transaction rollback ho jayegi aur catch block execute hoga. 🚀
