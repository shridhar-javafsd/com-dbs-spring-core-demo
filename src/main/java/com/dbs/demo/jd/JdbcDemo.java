package com.dbs.demo.jd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

//	loading class, connection, query , resultset  , process 		

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("Start");

		String className = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/sys";
		String user = "root";
		String password = "root";
		String sql = "SELECT * FROM emp_table;";

		Class.forName(className);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
		}

		System.out.println("End");
	}
}
