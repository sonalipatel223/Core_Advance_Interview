package com.rays.callable;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestProcedureInAndOut {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_int", "root", "root");

		CallableStatement callStmt = conn.prepareCall("{CALL empInAndOut(?,?)}");

		callStmt.setInt(1,3);

		callStmt.registerOutParameter(2, Types.INTEGER);

		callStmt.execute();

		System.out.println(callStmt.getInt(2));

	}
 
}

