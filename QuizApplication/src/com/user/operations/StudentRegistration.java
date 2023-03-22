package com.user.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.main.MainClass;

public class StudentRegistration {

	static Scanner sc = new Scanner(System.in);

	public static void getRecords() {
		System.out.println(" ");
		System.out.println("**__ This Is Student Registration From __**\n");

		System.out.println("->Enter Your ID ");
		int id = sc.nextInt();

		System.out.println("->Enter Your Email_ID");
		String email = sc.next();

		System.out.println("->Enter Your firstname");
		String firstname = sc.next();

		System.out.println("->Enter Your lastname");
		String lastname = sc.next();

		System.out.println("->Enter Your city");
		String city = sc.next();

		System.out.println("->Enter Your password");
		String password = sc.next();

		try {
			Connection connection = CommonConnection.getConnection();

			PreparedStatement ps = connection.prepareStatement(
					"insert into student(id,email,firstname,lastname,city,password) values (?,?,?,?,?,?)");

			ps.setInt(1, id);
			ps.setString(2, email);
			ps.setString(3, firstname);
			ps.setString(4, lastname);
			ps.setString(5, city);
			ps.setString(6, password);

			ps.execute();

			System.out.println("--> Record Insert Sucesfully..");

			System.out.println("Registration Sucesfull Now You Can LogIn");

			MainClass mainclass = new MainClass();

			MainClass.homePage();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

	}

}
