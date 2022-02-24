package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Setconnection {
	public static void main(String args[]) {
		Setconnection obj = new Setconnection();
		try {
			obj.dbConn();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection dbConn() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "Ravi_admin";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected succesfully");
		return con;
	}
}