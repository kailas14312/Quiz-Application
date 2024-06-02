package com.comviva.quiz;

import java.sql.*;
import java.util.Scanner;

/**
 * This class contain all 10 Quiz , which will be appear in quiz test;
 */
public class ShowQuiz {

	static Scanner sc = new Scanner(System.in);
	static int id1;
	static int tableId;
	static String name;
	static int no;
	static int user2;
	static int mark;
	static int dami = id1;
	static Config config = new Config();
	

	public static void showQuestions1() {
		config.loadProperties();
		try {
			Thread.sleep(6000);
			System.out.println();
			System.out.println("-----------------------------------OK Started-----------------------------------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions", config.username, config.password);
			PreparedStatement ps = con.prepareStatement("select question,A,B,C,D FROM quiz where quiz_no=1");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println();
				System.out.println();
				System.out.println("1]--> " + rs.getString(1));
				System.out.println();
				System.out.println("[1[" + rs.getString(2) + "]   [2[" + rs.getString(3) + "]   [3[" + rs.getString(4)
						+ "]   [4[" + rs.getString(5) + "]");
				System.out.println();
				System.out.println("================================================================");
			}
			con.close();
			ps.close();
			rs.close();
			user2 = sc.nextInt();

			if ((user2 == 4) || (user2 == 2) || (user2 == 3)) {

				System.out.println("Wrong Answer:");
				System.out.println("-------------");
				System.out.println("Correct Answer is == [1]");

			} else if (user2 == 1) {
				System.out.println("Correct Answer");
				mark++;
			} else {
				System.out.println("invalid input ");

			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println();
			System.out.println("Wait for Next Question ---> ");
		}

	}

	public static void showQuestions2() {
		config.loadProperties();
		try {
			Thread.sleep(6000);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions", config.username, config.password);
			PreparedStatement ps = con.prepareStatement("select question ,A,B,C,D FROM quiz where quiz_no=2");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println();
				System.out.println();
				System.out.println("2]--> " + rs.getString(1));
				System.out.println();
				System.out.println("[1[" + rs.getString(2) + "]   [2[" + rs.getString(3) + "]   [3[" + rs.getString(4)
						+ "]   [4[" + rs.getString(5) + "]");
				System.out.println();
				System.out.println("================================================================");
			}
			con.close();
			ps.close();
			rs.close();
			user2 = sc.nextInt();

			if ((user2 == 4) || (user2 == 2) || (user2 == 3)) {

				System.out.println("Wrong Answer:");
				System.out.println("-------------");
				System.out.println("Correct Answer is == [1]");

			} else if (user2 == 1) {
				System.out.println("Correct Answer");
				mark++;
			} else {
				System.out.println("invalid input ");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println();
			System.out.println("Wait for Next Question ---> ");
		}
	}

	public static void showQuestions3() {
		config.loadProperties();
		try {
			Thread.sleep(6000);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions", config.username, config.password);
			PreparedStatement ps = con.prepareStatement("select question ,A,B,C,D FROM quiz where quiz_no=3");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println();
				System.out.println();
				System.out.println("3]--> " + rs.getString(1));
				System.out.println();
				System.out.println("[1[" + rs.getString(2) + "]   [2[" + rs.getString(3) + "]   [3[" + rs.getString(4)
						+ "]   [4[" + rs.getString(5) + "]");
				System.out.println();
				System.out.println("================================================================");
			}
			con.close();
			ps.close();
			rs.close();
			user2 = sc.nextInt();

			if ((user2 == 4) || (user2 == 2) || (user2 == 3)) {

				System.out.println("Wrong Answer:");
				System.out.println("-------------");
				System.out.println("Correct Answer is == [1]");

			} else if (user2 == 1) {
				System.out.println("Correct Answer");
				mark++;
			} else {
				System.out.println("invalid input ");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println();
			System.out.println("Wait for Next Question ---> ");
		}
	}

	public static void showQuestions4() {
		config.loadProperties();
		try {
			Thread.sleep(6000);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions",config.username, config.password);
			PreparedStatement ps = con.prepareStatement("select question ,A,B,C,D FROM quiz where quiz_no=4");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println();
				System.out.println();
				System.out.println("4]--> " + rs.getString(1));
				System.out.println();
				System.out.println("[1[" + rs.getString(2) + "]   [2[" + rs.getString(3) + "]   [3[" + rs.getString(4)
						+ "]   [4[" + rs.getString(5) + "]");
				System.out.println();
				System.out.println("================================================================");
			}
			con.close();
			ps.close();
			rs.close();
			user2 = sc.nextInt();

			if ((user2 == 4) || (user2 == 2) || (user2 == 3)) {

				System.out.println("Wrong Answer:");
				System.out.println("-------------");
				System.out.println("Correct Answer is == [1]");

			} else if (user2 == 1) {
				System.out.println("Correct Answer");
				mark++;
			} else {
				System.out.println("invalid input ");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println();
			System.out.println("Wait for Next Question ---> ");
		}
	}

	public static void showQuestions5() {
		config.loadProperties();
		try {
			Thread.sleep(6000);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions", config.username, config.password);
			PreparedStatement ps = con.prepareStatement("select question ,A,B,C,D FROM quiz where quiz_no=5");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println();
				System.out.println();
				System.out.println("5]--> " + rs.getString(1));
				System.out.println();
				System.out.println("[1[" + rs.getString(2) + "]   [2[" + rs.getString(3) + "]   [3[" + rs.getString(4)
						+ "]   [4[" + rs.getString(5) + "]");
				System.out.println();
				System.out.println("================================================================");
			}
			con.close();
			ps.close();
			rs.close();
			user2 = sc.nextInt();

			if ((user2 == 4) || (user2 == 2) || (user2 == 3)) {

				System.out.println("Wrong Answer:");
				System.out.println("-------------");
				System.out.println("Correct Answer is == [1]");

			} else if (user2 == 1) {
				System.out.println("Correct Answer");
				mark++;
			} else {
				System.out.println("invalid input ");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println();
			System.out.println("Wait for Next Question ---> ");
		}
	}

	public static void showQuestions6() {
		config.loadProperties();
		try {
			Thread.sleep(6000);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions", config.username, config.password);
			PreparedStatement ps = con.prepareStatement("select question ,A,B,C,D FROM quiz where quiz_no=6");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println();
				System.out.println();
				System.out.println("6]--> " + rs.getString(1));
				System.out.println();
				System.out.println("[1[" + rs.getString(2) + "]   [2[" + rs.getString(3) + "]   [3[" + rs.getString(4)
						+ "]   [4[" + rs.getString(5) + "]");
				System.out.println();
				System.out.println("================================================================");
			}
			con.close();
			ps.close();
			rs.close();
			user2 = sc.nextInt();

			if ((user2 == 4) || (user2 == 2) || (user2 == 3)) {

				System.out.println("Wrong Answer:");
				System.out.println("-------------");
				System.out.println("Correct Answer is == [1]");

			} else if (user2 == 1) {
				System.out.println("Correct Answer");
				mark++;
			} else {
				System.out.println("invalid input ");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println();
			System.out.println("Wait for Next Question ---> ");
		}
	}

	public static void showQuestions7() {
		config.loadProperties();
		try {
			Thread.sleep(6000);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions", config.username, config.password);
			PreparedStatement ps = con.prepareStatement("select question ,A,B,C,D FROM quiz where quiz_no=7");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println();
				System.out.println();
				System.out.println("7]--> " + rs.getString(1));
				System.out.println();
				System.out.println("[1[" + rs.getString(2) + "]   [2[" + rs.getString(3) + "]   [3[" + rs.getString(4)
						+ "]   [4[" + rs.getString(5) + "]");
				System.out.println();
				System.out.println("================================================================");
			}
			con.close();
			ps.close();
			rs.close();
			user2 = sc.nextInt();

			if ((user2 == 4) || (user2 == 2) || (user2 == 3)) {

				System.out.println("Wrong Answer:");
				System.out.println("-------------");
				System.out.println("Correct Answer is == [1]");

			} else if (user2 == 1) {
				System.out.println("Correct Answer");
				mark++;
			} else {
				System.out.println("invalid input ");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println();
			System.out.println("Wait for Next Question ---> ");
		}
	}

	public static void showQuestions8() {
		config.loadProperties();
		try {
			Thread.sleep(6000);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions", config.username, config.password);
			PreparedStatement ps = con.prepareStatement("select question ,A,B,C,D FROM quiz where quiz_no=8");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println();
				System.out.println();
				System.out.println("8]--> " + rs.getString(1));
				System.out.println();
				System.out.println("[1[" + rs.getString(2) + "]   [2[" + rs.getString(3) + "]   [3[" + rs.getString(4)
						+ "]   [4[" + rs.getString(5) + "]");
				System.out.println();
				System.out.println("===================================================================");
			}
			con.close();
			ps.close();
			rs.close();
			user2 = sc.nextInt();

			if ((user2 == 4) || (user2 == 2) || (user2 == 3)) {

				System.out.println("Wrong Answer:");
				System.out.println("-------------");
				System.out.println("Correct Answer is == [1]");

			} else if (user2 == 1) {
				System.out.println("Correct Answer");
				mark++;
			} else {
				System.out.println("invalid input ");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println();
			System.out.println("Wait for Next Question ---> ");
		}
	}

	public static void showQuestions9() {
		config.loadProperties();
		try {
			Thread.sleep(6000);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions", config.username, config.password);
			PreparedStatement ps = con.prepareStatement("select question ,A,B,C,D FROM quiz where quiz_no=9");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println();
				System.out.println();
				System.out.println("9]--> " + rs.getString(1));
				System.out.println();
				System.out.println("[1[" + rs.getString(2) + "]   [2[" + rs.getString(3) + "]   [3[" + rs.getString(4)
						+ "]   [4[" + rs.getString(5) + "]");
				System.out.println();
				System.out.println("==================================================================");
			}
			con.close();
			ps.close();
			rs.close();
			user2 = sc.nextInt();

			if ((user2 == 4) || (user2 == 1) || (user2 == 3)) {

				System.out.println("Wrong Answer:");
				System.out.println("-------------");
				System.out.println("Correct Answer is == [2]");

			} else if (user2 == 2) {
				System.out.println("Correct Answer");
				mark++;
			} else {
				System.out.println("invalid input ");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println();
			System.out.println("Wait for Next Question ---> ");
		}
	}

	public static void showQuestions10() {
		config.loadProperties();
		try {
			Thread.sleep(6000);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions", config.username, config.password);
			PreparedStatement ps = con.prepareStatement("select question ,A,B,C,D FROM quiz where quiz_no=10");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println();
				System.out.println();
				System.out.println("10]--> " + rs.getString(1));
				System.out.println();
				System.out.println("[1[" + rs.getString(2) + "]   [2[" + rs.getString(3) + "]   [3[" + rs.getString(4)
						+ "]   [4[" + rs.getString(5) + "]");
				System.out.println();
				System.out.println("==================================================================");
			}
			con.close();
			ps.close();
			rs.close();
			user2 = sc.nextInt();

			if ((user2 == 1) || (user2 == 2) || (user2 == 3)) {

				System.out.println("Wrong Answer:");
				System.out.println("<------------->");
				System.out.println("Correct Answer is == [4]");

			} else if (user2 == 4) {
				System.out.println("Correct Answer");
				mark++;
			} else {
				System.out.println("invalid input ");
			}
		System.out.println("<---------------------------- Thank You --------------------------->");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void displayMarkSheet() {
		config.loadProperties();
		System.out.println();
		System.out.println("<-----------------To Check Marks Kindly Enter your ---------------> ID");
		System.out.println();
		System.out.println();
		System.out.println();
		
		try {
			for (int i = 1; i <= 3; i++) {

				dami = sc.nextInt();

				if (dami == id1) {
					System.out.println();
					System.out.println();
					System.out.println("<--------------------------- Wait For Result -------------------------->");
					Thread.sleep(8000);
					System.out.println();
					System.out.println("NAME --  " + name);
					System.out.println("ID   --  " + id1);
					System.out.println();
					if (mark > 9) {
						System.out.println("congratulations --> Your in [A] - Gread");
					} else if (mark > 7) {
						System.out.println("Your in [B] - Gread");
					} else if (mark > 5) {
						System.out.println("Your in [C] - Gread");
					} else {
						System.out.println("Your Failed");
					}

					System.out.println("your mark is 10 OUT-OF" + "  =  " + mark);
					System.out.println();
					System.out.println("<------------------------------ Thank You ------------------------------->");

				} else {
					System.err.println("Wrong ID");
				}
			}
		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public static void retriveMarksheet(int id1) {
		
		config.loadProperties();
		try {
			System.out.println();
			System.out.print(">----------------------------> Loading Result ");
			for (int i = 0; i < 10; i++) {
				System.out.print(".");
				Thread.sleep(700);
			}
			System.out.println();
			System.out.println();
			System.out.println("<------------------------------ Your Result ------------------------------->");
			System.out.println();

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", config.username, config.password);

			PreparedStatement prs = con.prepareStatement("select id,name,mark from mark_sheet where id=?");

			prs.setInt(1, id1);

			ResultSet rs = prs.executeQuery();

			if (rs.next()) {

				tableId = rs.getInt(1);
				name = rs.getString("name");
				mark = rs.getInt("mark");

				System.out.println("Id:   " + id1);
				System.out.println("Name: " + name);
				System.out.println("Mark: " + mark);

				if (mark > 9) {
					System.out.println("congratulations --> Your in [A] - Gread");
				} else if (mark > 7) {
					System.out.println("Your in [B] - Gread");
				} else if (mark > 5) {
					System.out.println("Your in [C] - Gread");
				} else {
					System.out.println("Your Failed");
				}
				System.out.println();
				System.out.println(">-------------------------- your mark is  " + mark + "  OUT-OF  ------------------------> 10 ");
				System.out.println();
				System.out.println();

				System.out.println("<--------------------------- Mark sheet Retrieved! ---------------------------->");
			} else {
				System.out.println();
				System.err.println(">----------------------- No mark sheet found for ID: --------------------------> " + id1);
			}
			    System.out.println();
			    System.out.println("<---------------------------------Thank You------------------------------------>");

			rs.close();
			prs.close();
			con.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		System.exit(0);
	}

}
