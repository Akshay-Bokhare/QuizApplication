package com.user.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonConnection {

	public static Connection getConnection() throws SQLException {

		Connection connection = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		return connection;

	}

	public static void main(String[] args) {

	}

}
