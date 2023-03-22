package com.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.admin.operations.AddQuestion;
import com.admin.operations.DispalyAllStudentScore;
import com.admin.operations.FetchRecord;
import com.user.operations.DisplayQuestions;
import com.user.operations.StudentLogin;
import com.user.operations.StudentRegistration;

public class MainClass {

	static Scanner sc = new Scanner(System.in);

	public static void homePage() {

//USER
		System.out.println("**__ Welcome To Quizz __** ");
		System.out.println("-> For Student Registration Press 1");
		System.out.println("-> For Login Press 2 ");
		System.out.println("-> For Viewing Result Press 3");
//ADMIN		
		System.out.println("-> For Adding Questions Press 4");
		System.out.println("-> Dispaly All Student Score Press 5");

		int choise = sc.nextInt();

		switch (choise) {
		case 1:

			StudentRegistration.getRecords();
			

			break;

		case 2:
			StudentLogin.login();

			break;

		case 3:

			FetchRecord.showingResult();

			break;

		case 4:

			AddQuestion.addQuestion();

			break;

		case 5:

			DispalyAllStudentScore.getAllStudentScore();
			break;

		}

	}
		public static void main(String args[]) {
					
				homePage();
				}
}
