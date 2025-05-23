package com.rays.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestProcedureOut {

	public static void main(String[] args) throws Exception {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_int", "root", "root");

			CallableStatement callStmt = conn.prepareCall("{CALL empOut(?)}");

			callStmt.registerOutParameter(1, Types.INTEGER);

			callStmt.execute();

			int result = callStmt.getInt(1);

			System.out.println("Result from empOut stored procedure: " + result);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}

