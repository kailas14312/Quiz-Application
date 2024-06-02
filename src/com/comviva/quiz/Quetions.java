package com.comviva.quiz;

import java.sql.*;
import java.util.Scanner;
/**
 *   This class contain all questions which is register in data base By JDBC connection;
 * 
 */
public class Quetions extends ShowQuiz {

	public static void questions() {
		try {

			String sql = "insert into quiz(quiz_no, question, A,B,C,D, ANS )"

					+ "values(1,'what is java','OOPS language','C++','C#','Ruby','OOPS language'),"
					+ "(2,'what is JDBC?','DB connection','netowrk','work','net','DB connection'),"
					+ "(3,'what is JVM?','java vertual m','tool kit','application','IDK','java vertual m'),"
					+ "(4,'what is JRE?','java runtime e','program','Apk','txt','java runtime e'),"
					+ "(5,'what is JDK?','JAVA devlopment kit','JDKK','JCD','Redio','JAVA devlopment kit'),"
					+ "(6,'what is SQL?','RDBMS','CDBMS','GDBMS','LDBMS','RDBMS'),"
					+ "(7,'what is GIT?','VCS','VSA','VGA','VIP','VCS'),"
					+ "(8,'what is GIT-HUB?','interface','web','internet','data','interface'),"
					+ "(9,'what is JIT?','compiler','just in time compiler','network','language','just in time compiler'),"
					+ "(10,'what is String?','Thread','object','data','immutable','immutable')";

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions", "root", "P@rth123");

			Statement statement = con.createStatement();

			statement.execute(sql);

			System.out.println("Insertion successfully...");

			con.close();

			statement.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	public static void markSheet(int id, String name, int mark) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "P@rth123");

			PreparedStatement prs = con.prepareStatement("insert into mark_sheet(id,name,mark)values(?,?,?)");

			prs.setInt(1, id);
			prs.setString(2, name);
			prs.setInt(3, mark);

			int i = prs.executeUpdate();
			System.out.println();
			System.out.println();
		System.out.println(">------------------------------- " + i + " --------------> Mark sheet Updated!");

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	public static void getMark() {

		System.out.println();
		System.out.println("<-----Press [1] To checke Marksheet ---- Press [2] To attend Quiz comppit----->");
		System.out.println();

		user2 = sc.nextInt();

		if (user2 == 1) {

			ShowQuiz.retriveMarksheet(id1);

		}

	}
}
