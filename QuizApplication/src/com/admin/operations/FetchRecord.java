package com.admin.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.main.MainClass;
import com.user.operations.CommonConnection;

public class FetchRecord {

	static Scanner sc = new Scanner(System.in);

	public static void fetchResult(String EmailId) throws SQLException {

		try {

			Connection connection = CommonConnection.getConnection();

			PreparedStatement ps = connection.prepareStatement("SELECT Marks FROM ResultTable WHERE email = ?");

			ps.setString(1, EmailId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int score = rs.getInt("Marks");
				System.out.println("The score of " + EmailId + " is " + score);

				MainClass.homePage();
			}

		} finally {

		}
	}

	public static void showingResult() {

		System.out.println("Enter EmailId >> ");
		String EmailId = sc.next();

		try {
			FetchRecord.fetchResult(EmailId);
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
