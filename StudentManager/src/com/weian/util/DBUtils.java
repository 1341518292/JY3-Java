package com.weian.util;
/**
 * JDBC�Ĺ�����
 * @author Weian
 *
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBUtils {
	
	private static Properties prop = null;
	
	//���������ļ�
	static {
		prop = new Properties();
		try {
			prop.load(DBUtils.class.getResourceAsStream("/setting.properties"));
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	//�������ݿ�
	public static Connection getConnection() {
		String url = prop.getProperty("url");
		String user = prop.getProperty("username");
		String password = prop.getProperty("password");

		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
