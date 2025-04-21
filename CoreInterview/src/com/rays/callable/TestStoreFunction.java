package com.rays.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestStoreFunction {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_int", "root", "root");

		CallableStatement callStmt = conn.prepareCall("{? = CALL square(?)}");
		callStmt.setInt(2, 4);
		callStmt.registerOutParameter(1, Types.INTEGER);
		callStmt.execute();

		System.out.println(" Square " + callStmt.getInt(1));
	}

}

//Pehla ? (OUT parameter): Yeh function ka return value capture karega.
//Dusra ? (IN parameter): Yeh function ko input value dega.
//Yahaan hum dusre parameter (position 2) me 4 pass kar rahe hain.