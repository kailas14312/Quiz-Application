
package com.comviva.quiz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * this is Property file class , we have seat config folder file path... 
 * in ---> load(new FileInputStream()) method & object.
 * also use getProperty method to get ---> id, password of new user.
 * 
 */
public class Config {
	String username;
	String password;

	public void loadProperties() {
		Properties prop = new Properties();

		try {

String filePath = "D:\\C\\Desktop\\kailas.java\\Basic Programs\\Quiz_commpite Zip\\Quiz_Compitetion\\Quiz Application\\config\\Connection.properties";
			prop.load(new FileInputStream(filePath));
			username = prop.getProperty("database.username");
			password = prop.getProperty("database.password");

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
