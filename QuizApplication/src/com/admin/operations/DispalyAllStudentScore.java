package com.admin.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.user.operations.CommonConnection;

public class DispalyAllStudentScore {

	public static void getAllStudentScore() {

		try {
			Connection connection = CommonConnection.getConnection();

			PreparedStatement ps = connection.prepareStatement(
					"select s.id,s.email,s.firstname,s.lastname,r.Marks from student s inner join ResultTable r on s.email=r.email ");

			ResultSet dispalyrecords = ps.executeQuery();

			while (dispalyrecords.next()) {

				System.out.println("Id " + dispalyrecords.getInt(1));
				System.out.println("Email_Id " + dispalyrecords.getString(2));
				System.out.println("First Name " + dispalyrecords.getString(3));
				System.out.println("Last Name " + dispalyrecords.getString(4));
				System.out.println("Marks " + dispalyrecords.getString(5));
				System.out.println(" ");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

	}

}
