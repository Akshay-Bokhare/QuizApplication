package com.user.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.main.MainClass;

public class DisplayQuestions {

	private static final int Id = 0;
	static Scanner sc = new Scanner(System.in);
	static int count = 0;
	private static String email;

	static void storeResult(String email) { // store Result (Count)

		try {
			Connection connection = CommonConnection.getConnection();

			PreparedStatement ps = connection.prepareStatement("select * from QuizQuestion");

			ResultSet table = ps.executeQuery();
			System.out.println(" ");
			System.out.println("**__ Welcome To Quizz __**");
			while (table.next()) {
				System.out.println(" ");

				System.out.println("ID.." + table.getInt(1));
				System.out.println("Question.." + table.getString(2));
				System.out.println("Option1.." + table.getString(3));
				System.out.println("Option2.." + table.getString(4));
				System.out.println("Option3.." + table.getString(5));
				System.out.println("Option4.." + table.getString(6));
				System.out.println("");

				System.out.println("Enter Your Answer Between Option 1 To 4 ");
				String answer = sc.next();
				System.out.println("");

				if (answer.equals(table.getString(7))) {

					count++;
					System.out.println("Your Total  Score Is ..> " + count);

				} else {

					System.out.println(" Sorry You Choose Wrong Answer ");
				}

			}

			System.out.println(" --*-- You Complete Quiz_Question ThankYou --*--");

			System.out.println("Your Score Is.." + count);
			System.out.println(" ");

			getStore(email, count);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	static void getStore(String email, int count) {

		try {
			Connection connection = CommonConnection.getConnection();

			PreparedStatement ps = connection.prepareStatement("insert into resulttable (email , Marks) values (?,?);");

			ps.setString(1, email);
			ps.setInt(2, count);

			ps.execute();

			System.out.println(" --*-- Your Marks Store In Database Successfully --*--");

			MainClass.homePage();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
