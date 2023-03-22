package com.user.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentLogin {

	static Scanner sc = new Scanner(System.in);

	public static void studentLogin(String email ,String password  ) {

		System.out.println("..*.. WELCOME TO QuizApplication ..*..");
		System.out.println("\n");

		

		try {
			Connection connection = CommonConnection.getConnection();

			PreparedStatement ps = connection.prepareStatement("select * from student");

			ResultSet table = ps.executeQuery();

			while (table.next()) {

				String user = table.getString(2);
				String pass = table.getString(6);
				
				if(email.equals(user) && password.equals(pass)) {
					
					System.out.println("Login SucseesFull...");
					
					DisplayQuestions.storeResult(email);
					
				}
				else {

					// System.out.println("Invalid credentials");

				}

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}		
	}
	
				public static void login() {
					
					System.out.println("Please Enter Your Email_Id ");
					String email = sc.next();

					System.out.println("Please Enter Your Password ");
					String password = sc.next();
					
					StudentLogin.studentLogin(email, password);
				}
}
