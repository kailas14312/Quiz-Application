
package com.comviva.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *    This is the class, use for to check Quiz competitor register id;
 */
public class Checke_Id extends ShowQuiz {
	

	public static void getDuplicateId() {
		Config config = new Config();
		config.loadProperties();
		

		List<Integer> list = new ArrayList<>();
		int ides = 0;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/result", config.username, config.password);

			PreparedStatement ps = con.prepareStatement("select id from mark_sheet");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				ides = rs.getInt(1);
				list.add(ides);
			}

			boolean con1 = list.contains(id1);

			if (con1 == true) {

				System.out.println();
				System.err
						.println("----------------------Duplicate ID ---> Kindly Choose another ID------------------");
				System.out.println();
				System.exit(0);
			}
			con.close();
			ps.close();
			rs.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
