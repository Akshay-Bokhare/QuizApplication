package com.admin.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.main.MainClass;
import com.user.operations.CommonConnection;

public class AddQuestion {

	static Scanner sc = new Scanner(System.in);

	public static void addQuestion() {

		System.out.println("Enter QuizQuestion Id");
		int Id = sc.nextInt();

		System.out.println("Enter Question");
		String Question = sc.next();

		System.out.println("Enter Questions Option1");
		String Option1 = sc.next();

		System.out.println("Enter Questions Option2");
		String Option2 = sc.next();

		System.out.println("Enter Questions Option3");
		String Option3 = sc.next();

		System.out.println("Enter Questions Option4");
		String Option4 = sc.next();

		System.out.println("Set Questions Answer");
		String Answer = sc.next();

		try {

			Connection connection = CommonConnection.getConnection();

			PreparedStatement ps = connection.prepareStatement(
					"insert into QuizQuestion(Id,Question,Option1,Option2,Option3,Option4,Answer) values (?,?,?,?,?,?,?)");

			ps.setInt(1, Id);
			ps.setString(2, Question);
			ps.setString(3, Option1);
			ps.setString(4, Option2);
			ps.setString(5, Option3);
			ps.setString(6, Option4);
			ps.setString(7, Answer);

			ps.execute();

			System.out.println("Question Add SucessFully....");

			MainClass.homePage();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

	}

}
